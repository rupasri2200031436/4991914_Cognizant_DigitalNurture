package com.spring.Country;

import com.spring.Country.Country;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        Country country = context.getBean("country", Country.class);

        System.out.println("Country Code: " + country.getCode());
        System.out.println("Country Name: " + country.getName());
    }
}
