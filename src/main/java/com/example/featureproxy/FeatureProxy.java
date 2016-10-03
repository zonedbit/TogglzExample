package com.example.featureproxy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeatureProxy {
	
	@Autowired
	private InternalServiceApi internalService;
	
	@RequestMapping("/featureProxy")
	public String methodDelegation(){
		return internalService.togglzFeatureProxy();
	}

}
