package com.training.test;

	import java.io.IOException;
	import java.io.PrintWriter;
	import java.util.List;

	import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.Cookie;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;

import com.training.test.model.Product;

	//import com.training.web.model.User;

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
			List<Product> usrList = (List<Product>)request.getAttribute("userList");
			
			Cookie cookie1 =new Cookie("username", user);
			//Cookie cookie2 =new Cookie("password", password);
			
			response.addCookie(cookie1);
			//response.addCookie(cookie2);
			
			out.print("<h1>Welcome "+user+"! You are successfully logged in </h1>");
			
			out.println("<table border='1'> ");
			out.println("<tr> <th>");
			out.println("Name </th>");
			out.println("<th> Password </th>");
			for(Product usr:usrList) {
				out.println("<tr><td>" +usr.getProductName() +"</td>");
				//out.println("<td>" +usr.getPassword() +"</td> </tr>");
			}
			out.print("<h3> Cookies are created. Click on the below "+ 
			           " button to get the cookie </h3>");
			out.print("<form action ='GetCookieServlet' method ='POST'>");
			out.print("<input type = 'submit' value='Get Cookie' ");
			out.print("/form");
		}

		/**
		 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			doGet(request, response);
		}

	}

	//Servlet Filter: Used to do pre-processing of request or post-processing of the response.

	//
	
