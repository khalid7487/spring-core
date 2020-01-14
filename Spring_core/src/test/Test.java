/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("test/applicationContext.xml");
        Hello hello = (Hello) context.getBean("hello");
        hello.setMessage("Hello Spring");
        System.out.println(hello.getMessage());
        
        ApplicationContext context2=new AnnotationConfigApplicationContext(HelloConfig.class);
         Hello hello2 = (Hello) context2.getBean("hello");
        hello2.setMessage("Hello Spring 2");
        System.out.println(hello2.getMessage());
                
    }
}
