

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import com.ximpleware.AutoPilot;
import com.ximpleware.NavException;
import com.ximpleware.VTDGen;
import com.ximpleware.VTDNav;
import com.ximpleware.XPathEvalException;
import com.ximpleware.XPathParseException;

/**
 * Servlet implementation class XPathQuery
 */
@WebServlet("/XPathQuery")
public class XPathQuery extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String SEDNA_DATA = SednaController.SEDNA_DATA;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public XPathQuery() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/xml;charset=UTF-8");
		PrintWriter writer = response.getWriter();
		writer.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		writer.append("<response>");
		String index = request.getParameter("index");
		String colName = request.getParameter("col").trim();
		String docName = request.getParameter("doc").trim();
		String expression = request.getParameter("expr").trim();
		File file = new File(SEDNA_DATA + "/" + colName+"_files" + "/" + docName);
		
		
		
		if(!docName.equals("")&&!docName.equals("None")
				&&!colName.equals("")&&!colName.equals("None")) {
		//index XPath
		String vxlPath = SEDNA_DATA + "/" + colName+"_files" + "/" + file.getName()+".vxl";
		VTDGen vg = null;
		VTDNav vn = null;
		AutoPilot ap = null;
		VTDNav vn2 = null;
		AutoPilot ap2 = null;
		if(index.equals("NO")) {
			try {
				DocumentBuilderFactory domFactory = DocumentBuilderFactory.newInstance();
			    domFactory.setNamespaceAware(true); // never forget this!
			    DocumentBuilder builder = domFactory.newDocumentBuilder();
			    Document doc = builder.parse(file);
			    
				XPathFactory factory = XPathFactory.newInstance();
				XPath xpath = factory.newXPath();
	        	XPathExpression expr = xpath.compile(expression);
				// calculate time consuming
				long execTime = 0;
	        	long startTime = System.nanoTime();
	        	Object result = expr.evaluate(doc, XPathConstants.NODESET);
				long endTime = System.nanoTime();
		        execTime = endTime - startTime;
		        writer.append("<time>"+execTime/1000000+"ms"+(execTime%1000000)/1000+"</time>");
		        
			    NodeList nodes = (NodeList) result;
			    String queryResult="";
			    for (int i = 0; i < nodes.getLength(); i++) {
			    	queryResult=queryResult+nodes.item(i).getNodeValue()+"\r\n"; 
			    }
			    writer.append("<result>"+queryResult+"</result>");
			} catch (XPathExpressionException xpee) {
				writer.append("<error>"+xpee.getMessage()+"</error>");
				xpee.printStackTrace();
			}
			/*
			   try {
				vg = new VTDGen();
	        	if (vg.parseFile(file.getAbsolutePath(),true)){
	        		vn = vg.getNav();
		            ap = new AutoPilot(vn);
		            long execTime = 0;
		            for(int i=0;i<10;i++) {
			        	long startTime = System.nanoTime();
						ap.bind(vn);
						ap.selectXPath(expression);
						ap.evalXPathToString();
						long endTime = System.nanoTime();
				        execTime = execTime + endTime - startTime;
		            }
		            execTime = execTime/10;
			        writer.append("<time>"+execTime/1000000+"ms"+(execTime%1000000)/1000+"</time>");
					int i=-1; 
					String queryResult="";
			        while((i=ap.evalXPath())!=-1){
			        	queryResult=queryResult+vn.toString(i)+"\r\n";
			        }
			        writer.append("<result>"+queryResult+"</result>");
	        	}
			} catch (XPathParseException xppe) {
				writer.append("<error>"+xppe.getMessage()+"</error>");
				xppe.printStackTrace();
			} catch (XPathEvalException e) {
				writer.append("<error>"+e.getMessage()+"</error>");
				e.printStackTrace();
			} catch (NavException e) {
				writer.append("<error>"+e.getMessage()+"</error>");
				e.printStackTrace();
			}
			*/
			catch(Exception e){
		    	writer.append("<error>"+e.getMessage()+"</error>");
		    	e.printStackTrace();
		    }
		}
		else if(index.equals("YES")) {
			try{
				vg = new VTDGen();
		    	if (vg.parseFile(file.getAbsolutePath(),true)){
		    		//TODO
		    		// exam whether the index file is existed, and has the same hashcode
		    		vg.writeIndex(vxlPath); // create INDEX file "*.vxl"
		    		vn2 = vg.loadIndex(vxlPath);
			        ap2 = new AutoPilot(vn2);
			        long execTime = 0;
		        	long startTime = System.nanoTime();
					ap2.bind(vn2);
					ap2.selectXPath(expression);
					ap2.evalXPathToString();
					long endTime = System.nanoTime();
			        execTime = endTime - startTime;
			        writer.append("<time>"+execTime/1000000+"ms"+(execTime%1000000)/1000+"</time>");
					int i=-1; 
					String queryResult="";
			        while((i=ap2.evalXPath())!=-1){
			        	queryResult=queryResult+vn2.toString(i)+"\r\n";
			        }
			        writer.append("<result>"+queryResult+"</result>");
		    	}
		    	
		    } catch (XPathParseException xppe) {
				writer.append("<error>"+xppe.getMessage()+"</error>");
				xppe.printStackTrace();
			} catch (XPathEvalException e) {
				writer.append("<error>"+e.getMessage()+"</error>");
				e.printStackTrace();
			} catch (NavException e) {
				writer.append("<error>"+e.getMessage()+"</error>");
				e.printStackTrace();
			}catch(Exception e){
		    	writer.append("<error>"+e.getMessage()+"</error>");
		    	e.printStackTrace();
		    }
		}
		
		} // end if exam parameters: colName, docName
		writer.append("</response>");
		writer.flush();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
