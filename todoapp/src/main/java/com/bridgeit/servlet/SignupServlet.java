package com.bridgeit.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bridgeit.dto.SignupDto;
import com.bridgeit.util.Util;

public class SignupServlet extends HttpServlet 
{

	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException 
			{
		
		String fname=req.getParameter("fname");
		String mname=req.getParameter("mname");
		String lname=req.getParameter("lname");
		String email=req.getParameter("email");
		String pass=req.getParameter("psw");
		
		SignupDto dto=new SignupDto();
		dto.setEmail(email);
		dto.setFname(fname);
		dto.setMname(mname);
		dto.setLname(lname);
		dto.setPass(pass);
	
		Util util=new Util();
		Integer value=util.register(dto);
if(	value.intValue()>0)
{
	System.out.println(	value.intValue());
	  resp.sendRedirect("Login.jsp");
}
else
{
	  resp.sendRedirect("SignUp.jsp");

}
			}
	
	
}
