package com.example.methoddelegation.refactoring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.MyFeatures;


@RestController
public class MethodDelegationRefactoring {
	
	@RequestMapping("/methodDelegationRefactoring")
	public String methodDelegation(){
		
		final boolean isActive = MyFeatures.FEATURE_METHOD_DELEGATION.isActive();
		
		return isActive ? newFancyStuff() : oldFeature();
	}
	
	private String newFancyStuff(){
		return "New fancy stuff Method Delegation (Refactoring)";
	}
	
	private String oldFeature(){
		return "Old Feature Method Delegation (Refactoring)";
	}

}
