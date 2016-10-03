package com.example.featureproxy.refactoring;

import org.springframework.stereotype.Component;

@Component
public class InternalServiceOldImpl implements InternalServiceRefactoringApi {

	@Override
	public String togglzFeatureProxy() {
		return "Old stuff Togglz Feature Proxy (Refactoring)";
	}

}
