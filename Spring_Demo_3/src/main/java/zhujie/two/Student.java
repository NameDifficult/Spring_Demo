package zhujie.two;

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

    /**
     * 使用注解给属性赋值
     * 1. 直接在属性上注解@Value("")
     * 2. 在set上注解。同样是@Value("")
     */

//    @Value("李四")
//    private String name;
//    @Value("39")
//    private Integer age;


    //使用外部属性配置文件中的数据（常用）
    @Value("${name}")
    private String name;
    private Integer age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
