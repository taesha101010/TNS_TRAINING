package com.example.beans;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Scope;

import static org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_PROTOTYPE;

public class ScopeConfiguration {

    @Bean
    public SingletonBean singletonBean(){
        return new SingletonBean();
    }

    @Bean
    @Scope(SCOPE_PROTOTYPE)
    public PrototypeBean prototypeBean(){
        return new PrototypeBean();
    }
}
