package springs.spring_02;

/**
 * @Author Mi
 * @Date 2022/3/18 23:27
 * @Version 1.0
 */
public class Student {

    private String name;
    private Integer age;
    private School school ;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
        System.out.println("已创建Student");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
