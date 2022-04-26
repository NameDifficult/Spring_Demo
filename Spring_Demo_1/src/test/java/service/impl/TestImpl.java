package service.impl;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.SomeService;

import java.util.Arrays;

/**
 * @Author Mi
 * @Date 2022/3/18 22:52
 * @Version 1.0
 */
public class TestImpl {
    /**
     * spring根据ID，class创建对象，把对象放入spring的一个map集合中。map.put(id,对象)
     * 在创建容器对象时，会把配置文件中所有的对象都创建出来
     * 一个bean可以看成是一个对象
     */
    @Test
    public void testSomeService(){
        //读取配置文件，创建容器对象applicationContext，通过它来获取java对象
        //对象在这一步就已经创建好了
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        //根据bean的id获取对象
        SomeService someService = applicationContext.getBean(SomeService.class);
        someService.doSome();
    }

    /**
     * 获取容器中的对象信息
     */
    @Test
    public void test1(){
        //读取配置文件，创建容器对象applicationContext，通过它来获取java对象
        //对象在这一步就已经创建好了
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        //获取容器中的对象数量
        int beanDefinitionCount = applicationContext.getBeanDefinitionCount();
        System.out.println(beanDefinitionCount);
        //获取容器中对象的名称
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        System.out.println(Arrays.toString(beanDefinitionNames));
    }
}
