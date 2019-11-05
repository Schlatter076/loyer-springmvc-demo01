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
        //studentService.addStudent(new Student("hahaha", 25, 99));
        List<Student> list = studentService.getAllStudents();
        for (Student stu : list) {
            System.err.println(stu);
        }
    }
}
