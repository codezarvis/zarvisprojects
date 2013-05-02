package com.lib.service.impl;

import java.util.List;

import com.lib.domain.sub.LibUserImpl;
public interface LibService {
	
	    
	    void create(LibUserImpl libuser);
	    
	    List<LibUserImpl> getAll();
	    
	   

}
