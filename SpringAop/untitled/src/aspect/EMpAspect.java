package aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class EMpAspect {

    @Before("execution(public *  get*())")
    public void beforeAdvice(){
        System.out.println("Aspect run");
    }
}
