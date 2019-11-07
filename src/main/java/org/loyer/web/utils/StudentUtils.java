package org.loyer.web.utils;

import org.loyer.web.beans.Student;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;

public class StudentUtils {

    public static Student getStudentFromRequest(HttpServletRequest httpServletRequest) throws UnsupportedEncodingException {
        Student stu = new Student();
        httpServletRequest.setCharacterEncoding("UTF-8"); //post传值乱码时使用
        //String name = URLDecoder.decode(httpServletRequest.getParameter("name"), "ISO-8859-1");
        String name = httpServletRequest.getParameter("name");
        //System.err.println("姓名=====================" + name);
        String age = httpServletRequest.getParameter("age");
        String score = httpServletRequest.getParameter("score");
        stu.setName(name);
        stu.setAge(Integer.parseInt(age));
        stu.setScore(Double.parseDouble(score));
        return stu;
    }

}
