package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.EmpService;
import service.FactoryService;

public class Test {
    public static void main(String[] args) {
//        ApplicationContext context=new ClassPathXmlApplicationContext("test/spring_aop.xml");
//        EmpService empService=context.getBean("empService",EmpService.class);
        FactoryService fservice=new FactoryService();
        EmpService empService=(EmpService) fservice.getBean("empService");
        empService.getManager();
//        System.out.println(empService.getManager().getName());

    }
}
