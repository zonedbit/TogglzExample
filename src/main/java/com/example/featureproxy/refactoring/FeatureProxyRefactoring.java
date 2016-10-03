package com.example.featureproxy.refactoring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeatureProxyRefactoring {
	
	@Autowired
	@Qualifier("togglzFeatureProxy")
	private InternalServiceRefactoringApi internalService;
	
	@RequestMapping("/featureProxyRefactoring")
	public String methodDelegation(){
		return internalService.togglzFeatureProxy();
	}

}
