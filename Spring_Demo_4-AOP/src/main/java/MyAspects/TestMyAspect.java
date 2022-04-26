package MyAspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;

/**
 * @Author Mi
 * @Date 2022/3/23 17:53
 * @Version 1.0
 */

@Aspect
public class TestMyAspect {
    @Pointcut(value = "execution(public String service.serviceImpl.TestImpl.doSome(..))")
    private void pointCut(){}

    //前置通知
    @Before(value = "pointCut()")
    public void myBefore(JoinPoint joinPoint){
        System.out.println("前置通知" + Arrays.toString(joinPoint.getArgs()));
    }

    //后置通知
    @AfterReturning(value = "pointCut()",returning = "obj")
    public void myAfterReturning(Object obj){
        System.out.println("后置通知" + obj);
    }

    //环绕通知
    @Around("pointCut()")
    public Object myAround(ProceedingJoinPoint proceedingJoinPoint){
        Object proceed = null;
        try {
            System.out.println("环绕通知,设置此通知之后执行业务方法");
            Thread.sleep(2000);
            proceed = proceedingJoinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return proceed;
    }


    //最终通知
    @After("pointCut()")
    public void myAfter(){
        System.out.println("最终通知");
    }
}
