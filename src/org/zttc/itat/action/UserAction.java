package org.zttc.itat.action;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.ServletActionContext;
import org.zttc.itat.model.User;

import com.opensymphony.xwork2.ActionContext;

public class UserAction {
	
	String username;
	String password;
	
	
	public String getUserName() {
		return username;
	}

	public void setUserName(String userName) {
		username = userName;
	}

	public String getPassWord() {
		return password;
	}

	public void setPassWord(String passWord) {
		password = passWord;
	}

	public String addInput(){
		System.out.println("add input");
		System.out.println(username +"  "+password);
		return "success";
	}
	
	public String add(){
		System.out.println("add");
		return "r_list";
	}
	
	public String list(){
		System.out.println("list");
		this.setUserName("����");
		this.setPassWord("123");
		ActionContext.getContext().put("a", 10);
		ActionContext.getContext().put("b", 100);
		
		User u = new User(1,"����","ls");
		ActionContext.getContext().getValueStack().push(u);
		
		ServletActionContext.getRequest().setAttribute("c", 120);
		ServletActionContext.getRequest().setAttribute("d", 300);
		return "success";
	}
	
	public String show(){
		
		ActionContext.getContext().put("age", 20);
		
		List<User> users = new ArrayList<User>();
		users.add(new User(1,"wk","���"));
		users.add(new User(2,"bj","�˽�"));
		users.add(new User(3,"ss","ɳɮ"));
		ActionContext.getContext().put("users", users);
		
		this.setUserName("����");
		this.setPassWord("123");
		
		return "success";
	}
}
