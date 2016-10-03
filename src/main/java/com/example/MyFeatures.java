package com.example;

import org.togglz.core.Feature;
import org.togglz.core.annotation.EnabledByDefault;
import org.togglz.core.annotation.Label;
import org.togglz.core.context.FeatureContext;
public enum MyFeatures implements Feature{
	
	
    @EnabledByDefault
    @Label("Feature Method Delegation")
    FEATURE_METHOD_DELEGATION,
    
    @Label("Feature Abstraction Layer")
    FEATURE_ABSTRACTION_LAYER,
    
    @Label("Feature Togglz Proxy")
    FEATURE_TOGGLZ_PROXY;
    ;
    
    
    
    public boolean isActive() {
        return FeatureContext.getFeatureManager().isActive(this);
    }
    
//    @SuppressWarnings("unchecked")
//	@Bean
//    public FeatureProvider featureProvider() {
//        return new EnumBasedFeatureProvider(MyFeatures.class);
//    }

}
