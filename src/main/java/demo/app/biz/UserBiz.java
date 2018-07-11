package demo.app.biz;

import java.util.List;

import demo.app.bean.User;

public interface UserBiz {

	boolean add(User bean);
	List<User> findAll();
}
