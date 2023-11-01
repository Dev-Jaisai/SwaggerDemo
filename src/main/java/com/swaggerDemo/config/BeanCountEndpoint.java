package com.swaggerDemo.config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id = "bean-count")
public class BeanCountEndpoint {
    private final ApplicationContext applicationContext;

    @Autowired
    public BeanCountEndpoint(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @ReadOperation
    public int getBeanCount() {
        return applicationContext.getBeanDefinitionCount();
    }
}
