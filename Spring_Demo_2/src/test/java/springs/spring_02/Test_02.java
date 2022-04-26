package springs.spring_02;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author Mi
 * @Date 2022/3/18 23:51
 * @Version 1.0
 */
public class Test_02 {
    @Test
    public void test1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring_02/applicationContext.xml");
        Student bean = applicationContext.getBean(Student.class);
        System.out.println(bean);
    }
}
