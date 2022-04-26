package MyAspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

/**
 * @Author Mi
 * @Date 2022/3/21 15:59
 * @Version 1.0
 */
@Aspect
public class MyAspectAround {
    /**
     * 环绕通知方法的定义
     *      1. 方法时public
     *      2. 方法有返回值，推荐object
     *      3. 方法名称自定义
     *      4. 方法必须有ProceedingJoinPoint参数
     *
     *   返回值object：表示调用目标方法希望得到的执行结果(不一定是目标方法自己的返回值)
     *   proceedingJoinPoint: 相当于反射中的method
     *   作用：执行目标方法，等同于method.invoke();
     *
     *  特点：
     *      1. 在目标方法的前和后都能增强功能
     *      2. 控制目标方法是否执行
     *      3. 修改目标方法的执行结果
     *
     *   此方法一定是最先执行的，它如果没有执行业务方法，其他的前置，后置等方法不会执行
     */
    @Around(value = "execution(* *..SomeService3Impl.*(..))")
     public Object myAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("执行了环绕通知方法" + proceedingJoinPoint);

        //执行目标方法,接收目标方法返回值   等同于method.invoke();
        Object proceed = proceedingJoinPoint.proceed();


        return proceed;
//        return "hello";
     }
}
