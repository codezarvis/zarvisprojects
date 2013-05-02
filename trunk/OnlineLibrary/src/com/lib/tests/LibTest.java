package com.lib.tests;


import java.util.List;

import com.lib.domain.sub.LibUserImpl;
import com.lib.service.impl.LibService;
import com.lib.service.impl.LibServiceImpl;

public class LibTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        
		LibUserImpl user1 = new LibUserImpl();
		user1.setId(111);
		user1.setName("anu");
		user1.setAdress("vizag");
		user1.setPno(6521604);

		LibUserImpl user2 = new LibUserImpl();
		user2.setId(222);
		user2.setName("rani");
		user2.setAdress("hyd");
		user2.setPno(875649249);

		LibUserImpl user3 = new LibUserImpl();
		user3.setId(333);
		user3.setName("ram");
		user3.setAdress("rajmandry");
		user3.setPno(907654532);

		LibUserImpl user4 = new LibUserImpl();
		user4.setId(444);
		user4.setName("siva");
		user4.setAdress("kolkatta");
		user4.setPno(786969);

		LibUserImpl user5 = new LibUserImpl();
		user5.setId(555);
		user5.setName("rao");
		user5.setAdress("vishakhaptnam");
		user5.setPno(908654321);

		LibService libService = new LibServiceImpl();
		libService.create(user1);
		libService.create(user2);
		libService.create(user3);
		libService.create(user4);
		libService.create(user5);
		
	    List<LibUserImpl> libuserList = libService.getAll();
		
		for(int i = 0; i <libuserList.size(); i++) {
			System.out.println(libuserList.get(i));
		}
		
		

	}

}
