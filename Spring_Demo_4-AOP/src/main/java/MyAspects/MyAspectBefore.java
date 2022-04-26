package MyAspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.Arrays;
import java.util.Date;

/**
 * @Author Mi
 * @Date 2022/3/21 14:23
 * @Version 1.0
 */

/**
 * @Aspect ： 切面类的注解。
 *  作用：表示这个类是一个切面类
 *
 */
@Aspect
public class MyAspectBefore {
    //定义方法，表示切面的具体功能
    /**
     * 前置通知方法的定义
     *      1. 方法时public
     *      2. 方法是void
     *      3. 方法名称自定义
     *      4. 方法可以有参数 如果有时joinPoint
     *
     * @Before ：前置通知
     *      属性：value 切入点表达式，表示切面的执行位置。在这个方法时，会同时执行切面的功能
     *
     */
//    @Before(value = "execution(public void service.serviceImpl.SomeServiceImpl.doSome(String, Integer))")
//    public void myBefore(){
//        System.out.println("前置方法，在目标方法执行之前先执行" + new Date());
//    }
    //表示该包下的do开头的所有方法都加这个前置方法

    @Before(value = "execution(* *..SomeServiceImpl.do*(..))")
    public void myBefore(){
        System.out.println("前置方法，在目标方法执行之前先执行" + new Date());
    }


    /**
     * 切面类的通知方法，可以有参数
     * JoinPoint
     * 表示正在执行的业务方法，相当于反射中的method
     *      使用要求：必须是参数列表的第一个
     *      作用：获取方法执行时的信息，例如方法的名称，方法的参数集合等
     */
    @Before(value = "execution(* *..*(..))")
    public void myBefore1(JoinPoint joinPoint){
        System.out.println("------------------");
        System.out.println("获取方法执行时的参数" + Arrays.toString(joinPoint.getArgs()));
        System.out.println("前置通知，在目标方法执行之前先执行" + new Date());
    }
}
