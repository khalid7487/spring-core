package aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class EMpAspect {

    @Before("allGetters()")
    public void beforeAdvice(){
        System.out.println("Aspect run");
    }

    @Before("allGetters()")
    public void secondAdvice(){
        System.out.println("Second run");
    }

    @Pointcut("execution(public * get*(..))")
    public void allGetters(){}

}
