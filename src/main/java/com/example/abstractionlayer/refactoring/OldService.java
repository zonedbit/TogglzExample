package com.example.abstractionlayer.refactoring;

import org.springframework.stereotype.Component;

@Component("OldServiceRefactroing")
public class OldService {
	
	public String abstractionLayer(){
		return "Old stuff Abstraction Layer (Refactoring)";
	}

}
