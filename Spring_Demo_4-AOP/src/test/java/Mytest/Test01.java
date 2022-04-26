package Mytest;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.*;
import service.pojo.Student;

/**
 * @Author Mi
 * @Date 2022/3/21 14:40
 * @Version 1.0
 */
public class Test01 {
    //前置切面测试
    @Test
    public void test1(){
        ApplicationContext atc = new ClassPathXmlApplicationContext("applicationContext.xml");
        SomeService someService = (SomeService) atc.getBean("someService");
//        System.out.println(someService.getClass().getName()); 对象变了，someService变成了代理对象$Proxy8
        someService.doSome("李四",23);
        someService.doSome("张三",34);
    }


    //前置切面测试：切面功能有参数
    @Test
    public void test2(){
        ApplicationContext atc = new ClassPathXmlApplicationContext("applicationContext.xml");
        SomeService someService = (SomeService) atc.getBean("someService");
//        System.out.println(someService.getClass().getName()); 对象变了，someService变成了代理对象$Proxy8
        someService.doSome("张三",34);
    }




    //后置切面测试
    @Test
    public void test3(){
        ApplicationContext atc = new ClassPathXmlApplicationContext("applicationContext2.xml");
        SomeService2 someService = (SomeService2) atc.getBean("someService2");
        Student s = someService.someService("李四", 23);
        System.out.println(s);

    }


    //环绕通知测试
    @Test
    public void test4(){
        ApplicationContext atc = new ClassPathXmlApplicationContext("applicationContext3.xml");
        SomeService3 someService = (SomeService3) atc.getBean("someService3");
        String s = someService.doSome("李四");
        System.out.println(s);

    }


    //
    @Test
    public void test5(){
        ApplicationContext atc = new ClassPathXmlApplicationContext("applicationContext4.xml");
        SomeService4 someService4 = (SomeService4) atc.getBean("someService4");
        someService4.doSome("张三");
    }



    //最终通知
    @Test
    public void test6(){
        ApplicationContext atc = new ClassPathXmlApplicationContext("applicationContext5.xml");
        SomeService5 someService4 = (SomeService5) atc.getBean("someService5");
        someService4.doAfter();
    }
}
