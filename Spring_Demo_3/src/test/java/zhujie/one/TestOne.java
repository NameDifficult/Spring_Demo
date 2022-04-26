package zhujie.one;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author Mi
 * @Date 2022/3/19 20:44
 * @Version 1.0
 */
public class TestOne {
    @Test
    public void test1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student bean = applicationContext.getBean(Student.class);
        System.out.println(bean);
    }
}
