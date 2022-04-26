package MyAspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import service.pojo.Student;

/**
 * @Author Mi
 * @Date 2022/3/21 15:14
 * @Version 1.0
 */
@Aspect
public class MyAspectAfterReturning {
    /**
     * 后置通知方法的定义
     *      1. 方法时public
     *      2. 方法名称自定义
     *      3. 方法有参数,推荐object
     *
     *   @AfterReturning : 后置通知
     *          属性：value 切入点表达式
     *              returning 自定义的变量，表示目标方法的返回值的
     *                      自定义变量名称必须和通知方法的形参名一样
     *
     *   特点：
     *      1. 在目标方法后执行
     *      2. 能够获取目标方法的执行结果
     *      3. 不会影响目标方法的执行
     *
     *   方法的参数：
     *      object res ： 表示目标方法的返回值，使用res来接收someService的调用结果
     *      Object res = someService();
     * 在后置通知中修改返回值，不会影响目标方法最终的返回结果
     *
     */
    @AfterReturning(value = "execution(* *..SomeService2Impl.*(..))",returning = "res")
    public void myAfterReturning(JoinPoint joinPoint ,Object res){
        if (res!=null){
            res = new Student("张三",24);
        }
        System.out.println("后置通知，在目标方法执行后执行 ：  " + "执行结果为=" + res);

    }
}
