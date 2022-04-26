package zhujie.one;

import org.springframework.stereotype.Component;

/**
 * @Author Mi
 * @Date 2022/3/19 20:35
 * @Version 1.0
 *
 *
 *
 * Component：表示创建对象，对象放到容器中 作用是<bean></bean>
 *      属性value：就是bean中的id
 *
 *  还有以下几种同component一样有创建对象能力的注解；
 *  1. @Repository : 放在dao接口的实现类上面，表示创建dao对象，持久层对象，能访问数据库
 *  2. @Service ：放在业务层接口的实现类上面，表示创建的是业务层对象
 *  3. @Controller ：放在控制器上面，表示创建的是控制器对象
 */

// @Component 可以不加名称，默认是类的首字母小写
    //也可以这样，常用
 @Component("student")
//@Component(value = "student")
public class Student {
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
