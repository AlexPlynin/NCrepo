package com.app.config;

import com.app.entities.Animal;
import com.app.entities.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.app.entities")  //при конфигурации дополнительное сканирование области
public class MyConfig {

    @Bean                           //конфигурация бинов
    public Animal getAnimal(){
        return new Animal();
    }

    @Bean
    public Person getPerson(){
        return new Person();
    }
}
