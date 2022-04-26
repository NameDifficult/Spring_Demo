package service.serviceImpl;

import mybatis.mapper.StudentMapper;
import mybatis.pojo.Student;
import service.StudentService;

import java.util.List;

/**
 * @Author Mi
 * @Date 2022/3/23 23:11
 * @Version 1.0
 */
public class StudentServiceImpl implements StudentService {

    private StudentMapper studentMapper;

    public void setStudentMapper(StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }

    @Override
    public int addStudent(Student student) {
        return studentMapper.insertStu(student);
    }

    @Override
    public List<Student> queryStudent() {
        List<Student> students = studentMapper.selectStu();
        return students;
    }
}
