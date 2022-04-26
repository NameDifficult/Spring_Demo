package springs.spring_04;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author Mi
 * @Date 2022/3/18 23:51
 * @Version 1.0
 */
public class Test_04 {
    @Test
    public void test1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring_04/applicationContext.xml");
        Student bean = (Student) applicationContext.getBean("student2");
        System.out.println(bean);
    }
}
