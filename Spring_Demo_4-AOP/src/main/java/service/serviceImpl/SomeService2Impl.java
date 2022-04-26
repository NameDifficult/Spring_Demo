package service.serviceImpl;

import service.SomeService2;
import service.pojo.Student;

/**
 * @Author Mi
 * @Date 2022/3/21 15:23
 * @Version 1.0
 */
public class SomeService2Impl implements SomeService2 {
    @Override
    public Student someService(String name , Integer age) {
        System.out.println("someService2Impl中的中心业务方法" + "name=" + name + "  age=" + age);
        Student student = new Student(name,age);
        return student;
    }
}
