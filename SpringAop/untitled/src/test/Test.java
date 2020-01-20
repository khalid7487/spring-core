package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.EmpService;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("test/spring_aop.xml");
        EmpService empService=context.getBean("empService",EmpService.class);
        System.out.println(empService.getManager().getName());

    }
}
