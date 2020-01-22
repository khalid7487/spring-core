package jdbctest;

import dao.EmployeeDao;
import jdbcmodel.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("jdbctest/spring-jdbc.xml");
        EmployeeDao employeeDao = (EmployeeDao) context.getBean("employeeDao");
//        System.out.println(employeeDao.saveEmployee(new Employee("khalid",5000.32)));
//        System.out.println(employeeDao.saveEmployeePS(new Employee("roxy1",5000000.320)));
//        System.out.println(employeeDao.getEmployeebyId(10));
//        System.out.println(employeeDao.getAllEmployee(2).getName());
//        System.out.println(employeeDao.getAllEmployee(2).getSalary());
//        System.out.println(employeeDao.getAllEmployeeList(1).get(0).getName());
        System.out.println(employeeDao.saveEmployee(new Employee("shuvo",5000.32)));
    }
}
