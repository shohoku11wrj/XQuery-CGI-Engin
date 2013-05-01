

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.file.Files;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SednaController
 */
@WebServlet(description = "Control SendaXMLDB, on & off, switch xml file bundles, upload/del/change xml docs", urlPatterns = { "/SednaController" })
public class SednaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static final String SEDNA_HOME = "/home/ranger/cs609/sedna/sedna"; 
	public static final String SEDNA_BIN = SEDNA_HOME + "/bin";
	public static final String SEDNA_DATA = SEDNA_HOME + "/data";
	static String CollectionDir="";
	Process pr;
	static String s; // get stdInput or stdError

	static Runtime rt = Runtime.getRuntime();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SednaController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String resp="";
		PrintWriter out = response.getWriter();
        
		String type = request.getParameter("type").trim();
		// TODO
		// 1. get sedna/bin directory address from web.xml
		// 2. switch sedna, change current file bundles, 
		if(type.equals("START")) {
			resp = TurnOnSenda();
		}
		else if(type.equals("STOP")) {
			resp = TurnOffSenda();
		}
		else if(type.equals("NEW")) {
			String col = request.getParameter("col").trim();
			resp = NewCollection(col);
			if(resp.equals("SUCCESS")) {
				resp = ListCollections();
			}
			else if (resp.equals("FAIL")) {
				resp = ListCollections()+", Create New Collection Failed";
			}
			else {
				resp = "Unexpected error happened.";
			}
		}
		else if(type.equals("COL")) {
			resp = ListCollections();
		}
		else if(type.equals("DOC")) {
			String col = request.getParameter("col").trim();
			resp = ListDocuments(col);
		}
		out.print(resp);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// upload/del/update xml doc
	}
	
	private String TurnOnSenda() {
		String result="";
		try {
			pr = rt.exec(SEDNA_BIN+"/se_gov"); // exitcode=0 success; exitcode=1 error;
			result = pr.getOutputStream().toString();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	private String TurnOffSenda() {
		String result="";
		try {
			pr = rt.exec(SEDNA_BIN+"/se_stop");
			result = pr.getOutputStream().toString();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	private String NewCollection(String col) {
		String result="";
		//TODO
		// create with collection
		try {
			// stop collection, maybe error
			//pr = rt.exec(SEDNA_BIN+"/se_smsd " + col);
			// delete collection, maybe error
			//pr = rt.exec(SEDNA_BIN+"/se_ddb " + col);
			// create collection
			pr = rt.exec(SEDNA_BIN+"/se_cdb " + col); // this will also create the directory /data/col_files
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		
		/*
		// deal with directory
		File collection = new File(SEDNA_DATA + "/" + col);
		// Check directory existed
		// if existed, del collection , clean files in dir; if not, mkdirs;
		if(collection.exists()) {
			File[] files = collection.listFiles();
			for (File f: files) {
				f.delete();
			}
		}
		else{
			collection.mkdirs();
		}
		CollectionDir = collection.getAbsolutePath();
		*/
		
		// run new collection
		try {
			int exitCode = pr.waitFor();
			if (exitCode == 0) {
				pr = rt.exec(SEDNA_BIN+"/se_sm " + col);
				exitCode = pr.waitFor();
				if (exitCode == 0) {
					result = "SUCCESS";
				} else {
					result = "FAIL";
				}
			}
		}
		catch (InterruptedException e) {
			result = "FAIL";
			e.printStackTrace();
		} catch (IOException e) {
			result = "FAIL";
			e.printStackTrace();
		}
		
		return result;
	}
	
	private String ListCollections() {
		String result="";
		try {
			pr = rt.exec(SEDNA_BIN+"/se_rc -sm-list");
		} catch (IOException e) {
			e.printStackTrace();
		}
		BufferedReader stdInput = new BufferedReader(new 
	             InputStreamReader(pr.getInputStream()));

		BufferedReader stdError = new BufferedReader(new 
	             InputStreamReader(pr.getErrorStream()));

		
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

		return result;
	}
	
	private String ListDocuments(String col) {
		String result="";
		
		// get docs "*.xml" from specified collection
		String folder = SEDNA_DATA + "/" + col+"_files";
		File docs = new File(folder);
		
		for (final File fileEntry : docs.listFiles()) {
	        if (fileEntry.isFile()
	        		&& fileEntry.canRead()) {
	        	try {
					if(Files.probeContentType(fileEntry.toPath()).equals("application/xml")) {
						if(result.equals("")) {
							result = fileEntry.getName();
						}
						else {
							result+=","+fileEntry.getName();
						}
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
	        }
	    }
		
		return result;
	}
	
	public void DownloadFile(String colName, String fileName) {
	}

}
