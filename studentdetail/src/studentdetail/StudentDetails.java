package studentdetail;

import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StudentDetails extends HttpServlet{
	protected void doPost(HttpServletRequest req,HttpServletResponse result)
			throws ServletException,IOException{
		PrintWriter p = result.getWriter();
		result.setContentType("text/html");

		String studentId = req.getParameter("sId");
		String studentName = req.getParameter("sName");



		if(studentId.equals("12345") && studentName.equals("Chaithra")) {
			p.println("ID: " +studentId);
			p.println("Name: "+studentName);

		}
		else
			p.println("Not valid");
		p.close();
	}
}