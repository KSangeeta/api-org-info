package com.sidgs.apiorginfo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sidgs.apiorginfo.bean.API;
import com.sidgs.apiorginfo.exception.APINotFoundException;
import com.sidgs.apiorginfo.service.APIService;

@RestController

public class APIController {
	
	@Autowired
	APIService service;	
	
	@GetMapping("/api-org-info/apis")
	public List<API> getAllAPIs(){
		return service.findAllAPIs();
	}
	
	@GetMapping("/api-org-info/api/{name}")
	public API findByAPIName(@PathVariable String name){
		API apiInfo = service.findByAPIName(name);
		if(apiInfo == null){
			throw new APINotFoundException("API: "+name+" not Found");			
		}
		return apiInfo;
	}
	
	@GetMapping("/api-org-info/org/{name}")
	public List<API> findByOrgName(@PathVariable String name){
		return service.findByOrg(name);
	}
		
}
