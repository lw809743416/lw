package demo.app.dao.impl.mysql;

import java.util.List;

import demo.app.bean.User;
import demo.app.dao.UserDao;


public class UserDaoImpl implements UserDao{

	public int insert(User bean) {
		System.out.println("====MySQL DAO 实现=====");
		System.out.print("模拟向数据库插入User数据:");
		System.out.println(bean);
		return 1;
	}

	public List<User> selectAll() {
		System.out.println("====MySQL DAO 实现=====");
		System.out.println("模拟从数据库查询User数据");
		return null;
	}



	

}
