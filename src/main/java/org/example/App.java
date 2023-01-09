package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        RoboFactory factory = (RoboFactory) context.getBean("factory");

        factory.runProduction();

        System.out.println("\ntotal beans count: " +context.getBeanDefinitionCount());
        System.out.println("\n bean names: " + Arrays.toString(context.getBeanDefinitionNames()));


    }
}
