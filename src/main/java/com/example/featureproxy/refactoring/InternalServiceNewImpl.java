package com.example.featureproxy.refactoring;

import org.springframework.stereotype.Component;

@Component
public class InternalServiceNewImpl implements InternalServiceRefactoringApi {

	@Override
	public String togglzFeatureProxy() {
		return "New fancy stuff Togglz Feature Proxy (Refactoring)";
	}

}
