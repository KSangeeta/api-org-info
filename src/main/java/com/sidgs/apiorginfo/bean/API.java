package com.sidgs.apiorginfo.bean;

public class API {
	
	private String name;
	private String org;
	private String env;
	private String type;
	
	public String getApi_name() {
		return name;
	}
	public void setApi_name(String api_name) {
		this.name = api_name;
	}
	public String getOrg() {
		return org;
	}
	public void setOrg(String org) {
		this.org = org;
	}
	public String getEnv() {
		return env;
	}
	public void setEnv(String env) {
		this.env = env;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public API(String name, String org, String env, String type) {
		super();
		this.name = name;
		this.org = org;
		this.env = env;
		this.type = type;
	}
	public API() {
		super();
	}
	
	
}
