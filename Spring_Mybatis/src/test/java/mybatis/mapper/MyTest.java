package mybatis.mapper;

import mybatis.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.StudentService;

import java.util.Arrays;
import java.util.List;

/**
 * @Author Mi
 * @Date 2022/3/23 23:32
 * @Version 1.0
 */
public class MyTest {
    @Test
    public void test1(){
        ApplicationContext atc = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentService bean = atc.getBean(StudentService.class);
        Student student = new Student(null,"七七",777);
        int i = bean.addStudent(student);
        System.out.println(i);

    }


    @Test
    public void test2(){
        ApplicationContext atc = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentService bean = atc.getBean(StudentService.class);
        List<Student> students = bean.queryStudent();
        students.forEach(student-> System.out.println(student));

    }

}
