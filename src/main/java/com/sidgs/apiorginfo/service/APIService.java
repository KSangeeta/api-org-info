package com.sidgs.apiorginfo.service;

import java.util.List;

import com.sidgs.apiorginfo.bean.API;

public interface APIService {
	public List<API> findAllAPIs();
	public API findByAPIName(String apiName);
	public List<API> findByOrg(String orgName);
}
