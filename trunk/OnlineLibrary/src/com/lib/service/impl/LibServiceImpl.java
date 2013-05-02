package com.lib.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.lib.domain.sub.LibUserImpl;

public class LibServiceImpl implements LibService {

	List<LibUserImpl> libuserList = new ArrayList<LibUserImpl>();


		@Override
		public void create(LibUserImpl libuser) {
			
			
			
				libuserList.add(libuser);
			}


		@Override
		public List<LibUserImpl> getAll() {
			  
			return libuserList;
		}
}
