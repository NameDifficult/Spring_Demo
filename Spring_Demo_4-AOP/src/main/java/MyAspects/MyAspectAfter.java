package MyAspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @Author Mi
 * @Date 2022/3/23 16:44
 * @Version 1.0
 */
@Aspect
public class MyAspectAfter {

    /**
     * @Pointcut : 定义和管理切入点，不是通知注解
     *              定义在一个方法的上面，看做是这个方法的别名
     *              一般写成私有的比较合适
     */
    @Pointcut(value = "execution(* *..SomeService5Impl.doAfter(..))")
    private void myPointcut(){
        //没有代码，表示用这个方法和用方法上面的切入点是一个意思
    }



    /**
     * 最终通知方法的定义
     *      1. 方法时public
     *      2. 方法是void
     *      3. 方法名称自定义
     *      4. 方法可以有参数
     *
     *
     *  @After :
     *          特点：1. 在目标方法之后执行
     *               2. 总是会被执行
     *               3. 可以用来做程序最后的收尾工作
     *
     * 即使业务方法有异常也会执行
     * 可以看做是放在finally中
     *
     */

    @After(value = "myPointcut()")
    public void myAfter(){
        System.out.println("最终通知，业务方法之后执行。即使业务方法有异常也会执行");
    }



    @Before(value = "myPointcut()")
    public void myBefore(){
        System.out.println("前置通知");
    }
}
