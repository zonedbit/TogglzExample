package com.example.abstractionlayer.refactoring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.MyFeatures;

@RestController
public class ServiceAbstractionLayer {
	
	@Autowired
	@Qualifier("OldServiceRefactroing")
	private OldService oldService;
	
	@Autowired
	private NewService newService;

	@RequestMapping("/abstractionLayerRefactoring")
	public String helloProxyFeature(){
		
		if(MyFeatures.FEATURE_ABSTRACTION_LAYER.isActive()){
			return newService.abstractionLayer();
		}
		
		return oldService.abstractionLayer();
	}
	
}
