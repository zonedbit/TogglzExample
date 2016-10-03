package com.example.abstractionlayer;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OldService {
	
	@RequestMapping("/abstractionLayer")
	public String abstractionLayer(){
		return "Abstraction Layer";
	}

}
