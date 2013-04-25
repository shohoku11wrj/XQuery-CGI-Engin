/********************************************************************
 * 
 * HelloSession.java
 *
 * Represents three pages: A, B, and C -- the form has a button 
 * to go to each of the three.
 * Creates a "session" object on the first client interaction.
 * Uses the session to keep track of sequence of visits over the 
 * whole session.
 *
 ********************************************************************/

import java.io.*;
import java.text.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloSession extends HttpServlet {
// One instance of the Tracker class is what is stored in the
// session. The Tracker keeps track of the number of interactions
// and an array of the sequence of pages visited.
// Java note: you can declare nested utility classes like this
    private class Tracker {
        private int count;
        private Vector series; // Vector is a dynamic array that stores Objects
        // Vector responds to: size(), addElement(), and elementAt()
        public Tracker() {
            count = 0;
            series = new Vector();
        }

        public void upCount() {
            count++;
        }

        public int getCount() {
            return(count);
        }

        public void add(Object object) {
            series.addElement(object);
        }

        public void printSeries(PrintWriter out) {
            for (int i=0; i<series.size(); i++) {
                out.println(series.elementAt(i) + " ");
            }
        }
    }

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
    throws IOException, ServletException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        String title = "Hello Session";
        out.println("<title>" + title + "</title>");
        out.println("</head>");
        out.println("<body bgcolor=white>");
        out.println("<h1>" + title + "</h1>");

        /*// See if there is a session already
        // If not, create the session and put a new tracker in it
        // If there is an existing session, get the tracker out of it
        Tracker tracker = null;
        HttpSession session = request.getSession(false);
        if (session == null) {
            out.println("Hello there! I haven't seen you before have I? Creating a session.");
            session = request.getSession(true);
            tracker = new Tracker();
            session.putValue("tracker", tracker);
        }
        else {
            tracker = (Tracker) session.getValue("tracker");
        }
        // At this point, a session and tracker object are established
        // Increment the number of visits and print the greeting
        tracker.upCount();
        String time;
        if (tracker.getCount() == 1) time = " time ";
        else time = " times ";
        out.println("Dang if we haven't served you " +
        tracker.getCount() + time + "this session");
        // Standard technique to look at which button was pressed to
        // return the right page (the page string is for the visit tracking)
        String page;
        if (request.getParameter("gotob") != null) {
            doB(out);
            page = "b"; 
        }
        else if (request.getParameter("gotoc") != null) {
            doC(out);
            page = "c";
        }
        else {
            doA(out); // the page of last resort
            page = "a";
        }
        tracker.add(page);*/
        // Just to show off the session state we are keeping,
        // echo the series of visits for this whole session
        out.println("<hr>Order of visits so far...");
        /*tracker.printSeries(out);*/
        // Print the form with the A B C buttons last
        doForm(out);
        out.println("</body>");
        out.println("</html>");
    }
    
    // Separated out utilities for the HTML generation...
    public void doForm(PrintWriter out) {
        out.println("<hr><form><input name=gotoa type=submit value=A>");
        out.println("<input name=gotob type=submit value=B>");
        out.println("<input name=gotoc type=submit value=C></form>");
    }

    public void doA(PrintWriter out) {
        out.println("<h2>The A page rules</h2>");
        out.println("<p>This dress exacerbates the genetic betrayal that is my legacy.");
    }

    public void doB(PrintWriter out) {
        out.println("<h2>The B page rules</h2>");
        out.println("<p>Clattu barrada nickto.");
    }

    public void doC(PrintWriter out) {
        out.println("<h2>The C page rules</h2>");
        out.println("<p>Picture this -- I'm hiding naked in a refrigerator.");
    }
}
/*

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

*//**
 * Servlet implementation class HelloSession
 *//*
@WebServlet("/HelloSession")
public class HelloSession extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    *//**
     * @see HttpServlet#HttpServlet()
     *//*
    public HelloSession() {
        super();
        // TODO Auto-generated constructor stub
    }

	*//**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 *//*
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	*//**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 *//*
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}*/
