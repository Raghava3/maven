package com.bridgeit.util;

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
	
	
	

}
