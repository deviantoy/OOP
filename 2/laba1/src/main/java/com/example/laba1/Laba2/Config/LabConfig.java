package com.example.laba1.Laba2.Config;

import com.example.laba1.Laba2.*;
import com.example.laba1.Laba2.Interfaces.Gender;
import com.example.laba1.Laba2.Interfaces.PlaceOfResidence;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class LabConfig {

    @Bean
    public Gender getGender(){
        return new Man();
    }

    @Bean
    public PlaceOfResidence getApartment(){
        return new Apartment();
    }

    @Bean
    public Teacher getFirstWork() {
        return new Teacher();
    }

    @Bean
    @Scope("singleton")
    public Programmer getSecondWork() { return new Programmer(); }

    @Bean
    public Human getHuman() { return new Human(
            getApartment(),
            getFirstWork(),
            getSecondWork(),
            getGender()); }
}
