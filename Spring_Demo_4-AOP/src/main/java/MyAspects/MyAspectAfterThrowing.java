package MyAspects;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

/**
 * @Author Mi
 * @Date 2022/3/21 16:53
 * @Version 1.0
 */
@Aspect
public class MyAspectAfterThrowing {

/**
 * 异常通知方法的定义
 *      1. 方法时public
 *      2. 方法名称自定义
 *      3. 方法有参数,Exception
 *      4. 没有返回值
 *
 *   AfterThrowing:
 *          属性:value 切入点表达式
 *              throwing 自定义变量，表示目标方法抛出的异常
 *                      变量名必须和通知方法的形参名一样
 *
 * 特点：
 *      1. 在目标方法抛出异常后执行的，没有异常不执行
 *      2. 能获得目标方法的异常信息
 *      3. 不是异常处理程序，可以得到异常发生的通知，可以发送邮件，短信通知开发人员
 *          可以看做是目标方法的监控程序
 *
 *     异常通知的执行
 *      try{
 *          目标方法
 *      }catch(){
 *          myThrowing（）
 *      }
 *
*/
    @AfterThrowing(value = "execution(* *..SomeService4Impl.*(..))",throwing = "ex")
    public void myThrowing(Exception ex){
        System.out.println("异常通知，在目标方法抛出异常时执行的，异常原因" + ex.getMessage());
        /**
         * 异常发生时可以做：
         *  1. 异常发生的时间，位置等信息
         *  2. 发送邮件，短信，通知开发人员
         */
    }

 }
