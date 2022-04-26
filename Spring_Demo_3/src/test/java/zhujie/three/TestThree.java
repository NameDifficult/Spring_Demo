package zhujie.three;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author Mi
 * @Date 2022/3/19 21:26
 * @Version 1.0
 */
public class TestThree {
    @Test
    public void test(){
        ApplicationContext atc = new ClassPathXmlApplicationContext("applicationContext3.xml");
        Student bean = atc.getBean(Student.class);
        System.out.println(bean);
    }
}
