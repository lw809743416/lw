package demo.app.biz.impl;

import java.util.List;

import demo.app.bean.User;
import demo.app.biz.UserBiz;
import demo.app.dao.UserDao;

public class UserBizImpl implements UserBiz{
	
	
	private UserDao userDao;
	public void setUserDao(UserDao userdao) {
		this.userDao=userdao;
	}
	public boolean add(User bean) {
		System.out.println("++++++UserBiz add+++++++");
		userDao.insert(bean);
		return true;
	}
	public List<User> findAll() {
		System.out.println("++++++UserBiz findAll+++++++");
		userDao.selectAll();
		return null;
	}
	
}
