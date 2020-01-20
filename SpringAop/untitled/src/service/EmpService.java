package service;

import aspect.Logger;
import model.Accountant;
import model.Manager;



public class EmpService {
    private Manager manager;
    private Accountant accountant;

//    @Logger
    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public Accountant getAccountant() {
        return accountant;
    }

    public void setAccountant(Accountant accountant) {
        this.accountant = accountant;
    }
}
