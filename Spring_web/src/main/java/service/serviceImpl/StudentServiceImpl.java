package service.serviceImpl;

import mybatis.mappers.StudentMapper;
import mybatis.pojo.Student;
import service.StudentService;

/**
 * @Author Mi
 * @Date 2022/3/26 20:26
 * @Version 1.0
 */
public class StudentServiceImpl implements StudentService {

    private StudentMapper studentMapper;

    public void setStudentMapper(StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }

    @Override
    public int addStudent(Student student) {
        return studentMapper.insertStudent(student);
    }

    @Override
    public Student queryStudentById(Integer id) {
        return studentMapper.selectStudentById(id);
    }
}
