package com.example.servletjspdemo.web;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public FirstServlet() {
        super();
    
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	//	HttpSession session = request.getSession();
		
		User user = new User();
		user.setname(request.getParameter("name"));
		user.setSurname(request.getParameter("surname"));
		user.setEmail(request.getParameter("email"));
		user.setEmail1(request.getParameter("email1"));
		user.setEmployer(request.getParameter("eployer"));
		user.setVote(request.getParameter("vote"));
		user.setJob(request.getParameter("job"));
		

		
		
		
		String name = request.getParameter("name");
		
		//ServletContext context = request.getServletContext();
		//if(Firstname !=null && !Firstname.equals(""))
		//{
			//session.setAttribute("Firstname", Firstname);
			//context.setAttribute("name", Firstname);
			
		//}
		
		response.getWriter().println("Hello "+ name+"!");
		//response.getWriter().println("Hello from session "+ session.getAttribute("Firstname")+"!");
		//response.getWriter().println("Hello from context "+ context.getAttribute("Firstname")+"!");
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
