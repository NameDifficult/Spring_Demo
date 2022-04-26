package zhujie.two;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author Mi
 * @Date 2022/3/19 21:08
 * @Version 1.0
 */
public class TestTwo {
    @Test
    public void TestTwo(){
        ApplicationContext atc = new ClassPathXmlApplicationContext("applicationContext2.xml");
        Student bean = atc.getBean(Student.class);
        System.out.println(bean);
    }
}
