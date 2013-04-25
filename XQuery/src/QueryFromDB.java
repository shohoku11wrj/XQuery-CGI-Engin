

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.StringReader;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.stream.XMLStreamReader;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import javax.xml.xquery.XQConnection;
import javax.xml.xquery.XQDataSource;
import javax.xml.xquery.XQException;
import javax.xml.xquery.XQExpression;
import javax.xml.xquery.XQResultSequence;
import javax.xml.xquery.XQSequence;

import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXParseException;

import net.xqj.sedna.SednaXQDataSource;

/**
 * Servlet implementation class QueryFromDB
 */
@WebServlet("/QueryFromDB")
public class QueryFromDB extends HttpServlet {
	private static final long serialVersionUID = 1L;
	XQueryExecution xqe = new XQueryExecution();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QueryFromDB() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/xml;charset=UTF-8");
		PrintWriter out = response.getWriter();
		String expression = request.getParameter("expr");
		//XQuery
		XQDataSource xqd = new SednaXQDataSource();
		try {
			xqd.setProperty("serverName", "localhost");
			xqd.setProperty("databaseName", "test");
		    
			XQConnection xqc = xqd .getConnection("SYSTEM","MANAGER");
			XQExpression xqe = xqc.createExpression();
			XQSequence xqs = xqe.executeQuery(expression); // execution method 1: tp outputStream
			xqs.writeSequence(out, null);
			
			/* 
			 * Do XML format in Server side
			 */
			/* 
			XQResultSequence xqr = xqe.executeQuery(expression); // execution method 2: to string
			//xqs.writeSequence(s, null);
			String xmlString = null;
			if(xqr.next()) {
				xmlString = xqr.getItemAsString(null);
			}
			
			//DocumentBuilder parser = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			//InputSource is = new InputSource(new StringReader(xmlString));
		    //Document document = parser.parse(is);
		    Source source = new StreamSource(new StringReader(xmlString)); //new DOMSource(document);
		    Result output = new StreamResult(out);
			
			// format XML by XSLT
			
			//StreamSource stylesource = new StreamSource(getClass().getResourceAsStream("proper-indenting.xsl"));
		    TransformerFactory transformerFactory = TransformerFactory.newInstance();
			transformerFactory.setAttribute("indent-number", 4);
			Transformer transformer = transformerFactory.newTransformer();
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			transformer.transform(source, output);
			*/
			xqc.close(); 
		} 
		catch (XQException xqe) { //TODO Check this Exception, before run XQuery
			// file does not exist error
			out.println("The SENDA db has not runned.");
			System.err.println("The SENDA db has not runned.");
			xqe.printStackTrace();
		}
		catch (Exception e) {
			// file does not exist error
			out.write("The SENDA db has not runned.");
			// syntax error
			
			e.printStackTrace();
		}
		finally {
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
