package demo.app.dao;

import java.util.List;

import demo.app.bean.User;

public interface UserDao {
	
	int insert(User bean);
	List<User> selectAll();
	
}
