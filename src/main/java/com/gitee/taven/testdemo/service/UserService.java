package com.gitee.taven.testdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gitee.taven.testdemo.entity.business.UserInformations;
import com.gitee.taven.testdemo.entity.system.Users;
import com.gitee.taven.testdemo.mapper.business.UserInformationsMapper;
import com.gitee.taven.testdemo.mapper.system.UsersMapper;

@Service
@Transactional
public class UserService {

	@Autowired private UsersMapper usersMapper;
	
	@Autowired private UserInformationsMapper userInformationsMapper;

	public void testJTA() {
		Users u = new Users();
		u.setUsername("hmj");
		u.setPassword("hmjbest");
		usersMapper.insertSelective(u);
		
		UserInformations ui = new UserInformations();
//		ui.setId(121);
		ui.setUserid(666l);
		ui.setEmail("dsb");
		userInformationsMapper.insertSelective(ui);
		
		int i = 10/0;
	}
	
}
