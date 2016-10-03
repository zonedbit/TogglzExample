package com.example.featureproxy;

import org.springframework.stereotype.Component;

@Component
public class InternalServiceImpl implements InternalServiceApi {

	@Override
	public String togglzFeatureProxy() {
		return "Togglz Feature Proxy";
	}

}
