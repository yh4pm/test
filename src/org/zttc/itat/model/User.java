package org.zttc.itat.model;

public class User {
	private int id;
	private String username;
	private String nickname;
	private Department dep;
	
	public int sum(int a,int b){
		return a+b;
	}
	
	public String hello(String word){
		return "hello"+word;
	}
	
	public Department getDep() {
		return dep;
	}
	public void setDep(Department dep) {
		this.dep = dep;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public User(int id, String username, String nickname) {
		super();
		this.id = id;
		this.username = username;
		this.nickname = nickname;
	}
	public User() {
	}
	
}
