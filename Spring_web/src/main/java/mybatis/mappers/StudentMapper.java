package mybatis.mappers;

import mybatis.pojo.Student;

/**
 * @Author Mi
 * @Date 2022/3/26 19:55
 * @Version 1.0
 */
public interface StudentMapper {

    /**
     * 添加学生
     * @param student
     * @return
     */
    int insertStudent(Student student);

    /**
     * 查询学生
     * @param id
     * @return
     */
    Student selectStudentById(Integer id);

}
