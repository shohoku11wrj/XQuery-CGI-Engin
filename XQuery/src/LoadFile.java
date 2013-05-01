

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 * Servlet implementation class LoadFile
 */
@WebServlet("/LoadFile")
@MultipartConfig
public class LoadFile extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String SEDNA_BIN = SednaController.SEDNA_BIN;
	private static final String SEDNA_DATA = SednaController.SEDNA_DATA;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoadFile() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		OutputStream outputStream = response.getOutputStream();
		String colName = request.getParameter("col").trim();
		String fileName = request.getParameter("doc").trim();
		File file = new File(SEDNA_DATA + "/" + colName+"_files" + "/" + fileName);
		FileInputStream in = new FileInputStream(file);
		byte[] buffer = new byte[512];
		int length;
		while ((length = in.read(buffer)) > 0){
			outputStream.write(buffer, 0, length);
		}
		in.close();
		outputStream.flush();
		
		return;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String colName = request.getParameter("col");
		try{
			Part filePart = request.getPart("file"); // Retrieves <input type="file" name="file">
		    String filename = getFilename(filePart);
		    InputStream is = filePart.getInputStream();
					byte[] buffer = new byte[512];
					int bytesRead;
					File file = new File(SEDNA_DATA+ "/" + colName+"_files/" + filename);
					FileOutputStream f =new FileOutputStream(file);
					while((bytesRead = is.read(buffer)) != -1) {
						f.write(buffer,0,bytesRead);
					}	
					//TODO
					// LOAD file to current collection of SEDNA
					Runtime rt = Runtime.getRuntime();
					Process ps = rt.exec(SEDNA_BIN+"/se_term -query \"LOAD '"
					+file.getAbsolutePath()+"' '"+filename+"'\" "+colName);
					BufferedReader stdInput = new BufferedReader(new 
				             InputStreamReader(ps.getInputStream()));

					BufferedReader stdError = new BufferedReader(new 
				             InputStreamReader(ps.getErrorStream()));
					String s;
					String result="";
					try {
						// read the output from the command
						while ((s = stdInput.readLine()) != null) {
							if(result.equals("")){
								result=s;
							}
							else {
								result = result+","+s;
							}
						}
						// read any errors from the attempted command
						while ((s = stdError.readLine()) != null) {
							result = s;
						}
					} catch (IOException e) {
						e.printStackTrace();
					}
					
					response.setContentType("text/plain");
					response.setCharacterEncoding("UTF-8");
					response.getWriter().write("File "+filename+" successfully uploaded.");
					response.getWriter().write(result);
					
					return;
		} catch (IOException ioe) {
			throw new ServletException("Cannot write file to the server.",ioe);
		}
	}
	
	private static String getFilename(Part part) {
	    for (String cd : part.getHeader("content-disposition").split(";")) {
	        if (cd.trim().startsWith("filename")) {
	            String filename = cd.substring(cd.indexOf('=') + 1).trim().replace("\"", "");
	            return filename.substring(filename.lastIndexOf('/') + 1).substring(filename.lastIndexOf('\\') + 1); // MSIE fix.
	        }
	    }
	    return null;
	}
}
