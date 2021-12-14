package com.myproject.laba3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MyConfig {

    @Bean
    public CanSendToStore getApple(){
        return new Apple("apple");
    }

    @Bean
    public CanSendToStore getPineapple(){
        return new Pineapple("pineapple");
    }

    @Bean
    public CanSendToStore getPen(){
        return new Pen("pen");
    }

    @Bean
    public CanSendToStore getMelon(){
        return new Melon("Melody");
    }

    @Bean
    @Scope("singleton")
    public Store getStore() {
        return new Store();
    }
}
