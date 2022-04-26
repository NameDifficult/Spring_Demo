package springs.spring_05;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author Mi
 * @Date 2022/3/18 23:51
 * @Version 1.0
 */
public class Test_05 {
    @Test
    public void test1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring_05/applicationContext.xml");
        Student bean = applicationContext.getBean(Student.class);
        System.out.println(bean);
    }
}
