package test;

import mybatis.pojo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.StudentService;

/**
 * @Author Mi
 * @Date 2022/3/26 20:55
 * @Version 1.0
 */
public class myTest {
    public static void main(String[] args) {
        ApplicationContext atc = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println(atc);
        StudentService bean = atc.getBean(StudentService.class);
        Student student = new Student(null,"小高",23);
        int i = bean.addStudent(student);
        System.out.println(i);

    }
}
