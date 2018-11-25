package com.app;

import com.app.config.MyConfig;
import com.app.entities.Animal;
import com.app.entities.Car;
import com.app.entities.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Animal animal =(Animal) context.getBean("getAnimal");
        Person person = (Person) context.getBean("getPerson");
        Car car = context.getBean(Car.class);
        System.out.println(context);
        System.out.println(animal);
        System.out.println(person);
        System.out.println(car);
    }
}
