package mybatis.mapper;

import mybatis.pojo.Student;

import java.util.List;

/**
 * @Author Mi
 * @Date 2022/3/23 23:01
 * @Version 1.0
 */
public interface StudentMapper {

    int insertStu(Student student);

    List<Student> selectStu();
}
