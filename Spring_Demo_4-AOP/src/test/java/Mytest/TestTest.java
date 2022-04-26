package Mytest;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @Author Mi
 * @Date 2022/3/23 17:55
 * @Version 1.0
 */
public class TestTest {
    @Test
    public void test0(){
        ApplicationContext atc = new ClassPathXmlApplicationContext("Test.xml");
        service.Test bean = atc.getBean(service.Test.class);
        String s = bean.doSome(99);
        System.out.println(s);
    }
}
