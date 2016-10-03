package com.example.methoddelegation;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MethodDelegation {
	
	@RequestMapping("/methodDelegation")
	public String methodDelegation(){
		return "Method Delegation";
	}
}
