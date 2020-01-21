package service;

import aspect.EMpAspect;
import model.Manager;

public class EmpServiceProxy extends EmpService{
    @Override
    public Manager getManager() {
        new EMpAspect().loggerAdvice();
        return super.getManager();
    }
}
