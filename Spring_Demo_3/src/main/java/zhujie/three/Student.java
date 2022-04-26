package zhujie.three;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author Mi
 * @Date 2022/3/19 20:35
 * @Version 1.0
 *
 */
 @Component("student")
public class Student {

    @Value("${name}")
    private String name;
    @Value("${age}")
    private Integer age;

    //引用类型
    /**
     * @Autowired: spring框架提供的，给引用类型赋值，使用自动注入。默认byType
     *          有属性值，默认是true
     *          true：赋值失败会报错 （推荐）
     *          false:赋值失败不会报错
     *
     * @@Qualifier(value = "bean的ID") ：从容器中找到指定名称的对象，把这个对象赋给引用类型 byName
     */
    @Autowired(required = true)
    private School school;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
}
