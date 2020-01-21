package aspect;

import model.Manager;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

//@Component
//@Aspect
public class EMpAspect {
//
//    @Before("allManager()")
//    public void beforeAdvice(JoinPoint joinPoint){
//       System.out.println("Aspect run " );
////        Manager manager=(Manager)joinPoint.getTarget();
//    }

//    @AfterReturning("args(name)")
//    public void stringArgMethods(String name){
//        System.out.println("Methods run with String args with value: "+name );
//    }

//    @AfterThrowing("args(name)")
//    public void stringArgMethodsThrow(String name){
//        System.out.println("Methods run after throwing: "+name);
//    }

//    @Before("allGetters()")
//    public void secondAdvice(){
//        System.out.println("Second run");
//    }

//    @Pointcut("execution(public * get*(..))")
    public void allGetters(){}
//
//    @Pointcut("within(model.Manager)")
//    public void allManager(){}

 //   @Around("allGetters()")
    public  Object aroundAdvice(ProceedingJoinPoint proceedingJoinPoint){
        Object retobject=null;
        try{
            System.out.println("before advice");
            retobject =proceedingJoinPoint.proceed();
            System.out.println("after returning");
        }catch (Throwable e){
            System.out.println("after throwable");
        }
        System.out.println("finally");
        return retobject;
    }

    public void loggerAdvice(){
        System.out.println("Logger advice called");
    }

}
