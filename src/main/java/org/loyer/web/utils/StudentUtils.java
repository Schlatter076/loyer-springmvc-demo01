package org.loyer.web.utils;

import org.loyer.web.beans.Student;

import javax.servlet.http.HttpServletRequest;

public class StudentUtils {

    public static Student getStudentFromRequest(HttpServletRequest httpServletRequest) {
        Student stu = new Student();
        String name = httpServletRequest.getParameter("name");
        String age = httpServletRequest.getParameter("age");
        String score = httpServletRequest.getParameter("score");
        stu.setName(name);
        stu.setAge(Integer.parseInt(age));
        stu.setScore(Double.parseDouble(score));
        return stu;
    }

}
