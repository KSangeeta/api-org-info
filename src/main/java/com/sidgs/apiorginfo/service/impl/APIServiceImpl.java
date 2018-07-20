package com.sidgs.apiorginfo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import com.sidgs.apiorginfo.bean.API;
import com.sidgs.apiorginfo.service.APIService;

@Component
public class APIServiceImpl implements APIService{

	private static List<API> apis = new ArrayList<>();
	
	static{
		API api1 = new API("lsd-secure", "bki_integrtion_dev", "lev_dev", "internal");
		apis.add(api1);
		API api2 = new API("lsd-unsecure", "bki_integrtion_dev", "lev_dev", "external");
		apis.add(api2);
	}
	
	@Override
	public List<API> findAllAPIs() {
		return apis;
	}

	@Override
	public API findByAPIName(String apiName) {
		if(StringUtils.isNotBlank(apiName)){
			for(API api:apis){
				if(api.getApi_name().equals(apiName))
					return api;
			}
		}
		return null;
	}
	
	public List<API> findByOrg(String orgName){
		List<API> list = new ArrayList<>();
		if(StringUtils.isNotBlank(orgName)){
			for(API api:apis){
				if(api.getOrg().equals(orgName))
					list.add(api);
			}
		}
		return list;
	}

}
