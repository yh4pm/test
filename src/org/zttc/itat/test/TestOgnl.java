package org.zttc.itat.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ognl.Ognl;
import ognl.OgnlException;

import org.junit.Test;
import org.zttc.itat.model.Department;
import org.zttc.itat.model.Role;
import org.zttc.itat.model.User;

public class TestOgnl {
	
	@Test
	public void test01(){
		User u = new User(1,"ts","唐僧");
		Department dep = new Department("财务部");
		u.setDep(dep);
		try {
			System.out.println(Ognl.getValue("hello('abc')", u));
			System.out.println(Ognl.getValue("dep.name", u));
		} catch (OgnlException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void test02(){
		Map<String,Object> ctx = new HashMap<String,Object>();
		User u = new User(1,"ts","唐僧");
		Department dep = new Department("财务部");
		u.setDep(dep);
		
		Role r = new Role(1,"超级管理员");
		
		ctx.put("user", u);
		ctx.put("role", r);
		
		try {
//			System.out.println(Ognl.getValue("nickname", u));
//			System.out.println(Ognl.getValue("dep.name", u));
			System.out.println(Ognl.getValue("nickname", ctx, u));
			System.out.println(Ognl.getValue("#user.nickname", ctx, u));
			System.out.println(Ognl.getValue("#role.name", ctx, r));
			System.out.println(Ognl.getValue("role.name", ctx, ctx));
			System.out.println(Ognl.getValue("#root.nickname", ctx, u));
		} catch (OgnlException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void test04(){
		List<User> users = new ArrayList<User>();
		users.add(new User(1,"wk","悟空"));
		users.add(new User(2,"bj","八戒"));
		users.add(new User(3,"ss","沙僧"));
		try {
			System.out.println(Ognl.getValue("#root[2].nickname", users));
		} catch (OgnlException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void test05(){
		List<User> users = new ArrayList<User>();
		users.add(new User(1,"wk","悟空"));
		users.add(new User(2,"bj","八戒"));
		users.add(new User(3,"ss","沙僧"));
		try {
			System.out.println(Ognl.getValue("#root[2].nickname", users));
			System.out.println(Ognl.getValue("#root[2].sum(5,2)", users));
			System.out.println(Ognl.getValue("#root[2].hello('张三')", users));
			System.out.println(Ognl.getValue("get(0).sum(9,9)", users));
		} catch (OgnlException e) {
			e.printStackTrace();
		}
	}
}
