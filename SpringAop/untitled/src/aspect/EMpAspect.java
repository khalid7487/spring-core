package aspect;

import model.Manager;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class EMpAspect {

    @Before("allManager()")
    public void beforeAdvice(JoinPoint joinPoint){
        System.out.println("Aspect run " );
        Manager manager=(Manager)joinPoint.getTarget();
    }

    @Before("args(name)")
    public void stringArgMethods(String name){
        System.out.println("Methods run with String args with value: "+name);
    }

//    @Before("allGetters()")
//    public void secondAdvice(){
//        System.out.println("Second run");
//    }

    @Pointcut("execution(public * get*(..))")
    public void allGetters(){}

    @Pointcut("within(model.Manager)")
    public void allManager(){}


}
