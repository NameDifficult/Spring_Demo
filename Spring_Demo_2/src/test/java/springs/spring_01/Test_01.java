package springs.spring_01;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author Mi
 * @Date 2022/3/18 23:30
 * @Version 1.0
 */
public class Test_01 {
    @Test
    public void test1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring_01/applicationContext.xml");
        Student bean = applicationContext.getBean(Student.class);
        System.out.println(bean);
    }
}
