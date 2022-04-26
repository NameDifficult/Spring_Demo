package service;

import mybatis.pojo.Student;

/**
 * @Author Mi
 * @Date 2022/3/26 20:24
 * @Version 1.0
 */
public interface StudentService {
    int addStudent(Student student);

    Student queryStudentById(Integer id);
}
