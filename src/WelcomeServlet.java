package com.training.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.User;


/**
 * Servlet implementation class WelcomeServlet
 */
@WebServlet("/WelcomeServlet")
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WelcomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String user = (String)request.getAttribute("user");
		String password = (String)request.getAttribute("pwd");
		List<User> usrList = (List<User>)request.getAttribute("userList");
		
		HttpSession session = request.getSession();
		
		session.setAttribute("userList", usrList);

		
		out.print("<h1>Welcome "+user+"! You are successfully logged in </h1>");
		
		out.println("<table border='1'> ");
		out.println("<tr> <th>");
		out.println("Name </th>");
		out.println("<th> Password </th>");
		for(User usr:usrList) {
			out.println("<tr><td>" +usr.getName() +"</td>");
			out.println("<td>" +usr.getPassword() +"</td> </tr>");
			//out.println(usr.getId());
		}
		
		
	} 

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}