package com.bridgeit.util;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bridgeit.dao.SignupDao;
import com.bridgeit.dto.SignupDto;


public class Util 
{
	
	public Integer register(SignupDto dto)
	
	{
	 
		SignupDao dao=	new SignupDao();
		Integer n=dao.register(dto);
		
		return n;
	}
	
	
	public HttpServletResponse register(HttpServletRequest req, HttpServletResponse resp){
	 
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

		try {
	
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
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return resp;
	}

}
