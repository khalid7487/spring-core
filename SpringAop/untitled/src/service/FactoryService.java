package service;

import model.Accountant;
import model.Manager;

public class FactoryService {
    public Object getBean(String beanType){
        if(beanType.equals("empService")) return new EmpServiceProxy();
        if(beanType.equals("employee")) return new Manager();
        if(beanType.equals("accountant")) return new Accountant();
        return null;
    }
}
