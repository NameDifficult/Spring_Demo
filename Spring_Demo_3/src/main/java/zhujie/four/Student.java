package zhujie.four;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

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


    /**
     * 引用类型注解：
     * @Resource ： 来自jdk中，给引用类型赋值的，支持byName和byType
     *              默认是byName
     *    规则：先使用byName去赋值，如果赋值失败，再使用byType
     */
    @Resource
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
