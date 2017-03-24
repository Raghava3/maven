package com.bridgeit.servlet;

import java.io.IOException;



import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bridgeit.dao.SignupDao;

public class LoginServlet extends HttpServlet
{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException 
			{
		   String email=req.getParameter("email");
		   String pass=req.getParameter("psw");
		   
		   SignupDao signupDao=new SignupDao();
		String name=  signupDao.select(email,pass);
		 
		if(name.equals("!!!!"))
		{
			 resp.sendRedirect("Login.jsp");
		}
		else
		{
			 resp.sendRedirect("welcome.jsp");
		}
		
	   }

}
