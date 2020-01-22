
package test;

import dao.EmployeeDao;
import model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("test/spring-jdbc.xml");
        EmployeeDao employeeDao=(EmployeeDao)context.getBean("employeeDao");
        System.out.println(employeeDao.saveEmployee(new Employee("khalid",5000.32)));
        
    }
}
