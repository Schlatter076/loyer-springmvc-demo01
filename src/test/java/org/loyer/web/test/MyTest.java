package org.loyer.web.test;

import org.junit.Before;
import org.junit.Test;
import org.loyer.web.beans.Student;
import org.loyer.web.service.IstudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {

    ApplicationContext ac;

    @Before
    public void before() {
        ac = new ClassPathXmlApplicationContext("application.xml");
    }

    @Test
    public void test01() {
        IstudentService studentService = (IstudentService) ac.getBean("studentServiceImpl");
        List<Student> list = studentService.getAllStudents();
        for (Student stu : list) {
            System.out.println(stu);
        }
    }
}
