package controller;

import mybatis.pojo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import service.StudentService;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author Mi
 * @Date 2022/3/26 20:29
 * @Version 1.0
 */
public class AddStudentServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String stuName = req.getParameter("name");
        Integer stuAge = Integer.parseInt(req.getParameter("age"));

        //创建容器，调用service
//        ApplicationContext atc = new ClassPathXmlApplicationContext("applicationContext.xml");

        /**
         *  使用了监听器创建好了容器对象，从servletContext作用域中获取容器
         */
//        WebApplicationContext atc = null;
//        String key = WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE;
//        ServletContext servletContext = req.getServletContext();
//        Object attribute = servletContext.getAttribute(key);
//        if (attribute!=null){
//            atc = (WebApplicationContext) attribute;
//        }

        /**
         * 使用spring提供的工具方法，获取监听器容器对象
         */
        WebApplicationContext atc = WebApplicationContextUtils.getRequiredWebApplicationContext(req.getServletContext());
        System.out.println(atc);
        StudentService bean = (StudentService) atc.getBean("studentService");
        Student student = new Student(null,stuName,stuAge);
        bean.addStudent(student);
        req.getRequestDispatcher("/show.jsp").forward(req,resp);
    }
}
