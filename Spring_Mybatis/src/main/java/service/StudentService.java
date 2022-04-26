package service;

import mybatis.pojo.Student;

import java.util.List;

/**
 * @Author Mi
 * @Date 2022/3/23 23:07
 * @Version 1.0
 */
public interface StudentService {
    int addStudent(Student student);
    List<Student> queryStudent();
}
