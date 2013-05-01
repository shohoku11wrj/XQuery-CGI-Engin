import javax.xml.xquery.XQConnection;
import javax.xml.xquery.XQDataSource;
import javax.xml.xquery.XQExpression;
import javax.xml.xquery.XQSequence;
import net.xqj.sedna.SednaXQDataSource;


public class XQueryExecution {
		
	public String queryFromDB(){
		String result="";
		//XQuery
		XQDataSource xqs = new SednaXQDataSource();
		try {
			xqs.setProperty("serverName", "localhost");
		    xqs.setProperty("databaseName", "test");
		    
			XQConnection xqc = xqs .getConnection("SYSTEM","MANAGER");
			XQExpression xqe = xqc.createExpression();
			//XQPreparedExpression xqp = xqc.prepareExpression("LOAD '../data/test_files/test.xml' 'test.xml'");

			long startTime = System.nanoTime();
			XQSequence xqjs = xqe.executeQuery(
					"for $a in doc('test')/db/person let $b:=$a/first where $b='Renjie' return $b");
        	long endTime = System.nanoTime();
	        long execTime = endTime - startTime;
	        System.out.println(execTime);
			//XQResultSequence xqr = xqe.executeQuery(".//person[0]");
			//.writeSequence(System.out, null);
			xqc.close(); 
		} catch (Exception e) {
			// file does not exist error
			
			// syntax error
			
			e.printStackTrace();
		}
		
		/*XQConnection xqc = xqjd.getConnection();
		XQExpression xqe;
		XQSequence xqs;
		try {
			xqe = xqc.createExpression();
			// execute a first query
			xqs = xqe.executeQuery("doc('/home/ranger/cs609/test.xml')");
			// process the query results
			XQResultSequence xqr = xqe.executeQuery(".//person[0]");
		} catch (XQException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		/*XQExpression expr = conn.createExpression();
		 
		// the XQuery expression to be executed
		String es = "declare variable $x as xs:integer external;" +
		            " for $n in fn:collection('catalog')//item" +
		            " where $n/price <= $x" +
		            " return fn:data($n/name)";
		 
		// bind a value (21) to an external variable with the QName x
		expr.bindInt(new QName("x"), 21, null);
		 
		// execute the XQuery expression
		XQResultSequence result = expr.executeQuery(es);
		 
		// process the result (sequence) iteratively
		while (result.next()) {
		  // process the result ...
		}*/
		return result;
	}

}
