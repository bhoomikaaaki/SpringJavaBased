package com.bhoomi.sprig.JavaBasedConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new AnnotationConfigApplicationContext(HelloWorldConfig.class);
    	
    	HelloWorld helloWorld=context.getBean(HelloWorld.class);
    	
    	helloWorld.setMessage("hello");
    	helloWorld.getMessage();
    	
    	
    	
    }
}
