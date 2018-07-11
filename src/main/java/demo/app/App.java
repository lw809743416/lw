package demo.app;

import demo.app.bean.User;
import demo.app.biz.UserBiz;

public class App {
	private UserBiz userBiz;
	public void setUserBiz(UserBiz userBiz) {
		this.userBiz=userBiz;
	}
	public void run() {
		System.out.println("新增用户：");
		User bean=new User(new Integer(1),"张三","admin");
		userBiz.add(bean);
	}
}
