package zhujie.four;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author Mi
 * @Date 2022/3/20 16:37
 * @Version 1.0
 */
public class Test4 {
    @Test
    public void test4(){
        ApplicationContext atc = new ClassPathXmlApplicationContext("applicationContext4.xml");
        Student bean = atc.getBean(Student.class);
        System.out.println(bean);
    }
}
