package org.loyer.web.utils;

import org.loyer.web.beans.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.util.Enumeration;

public class StudentUtils {

    private static final Logger logger = LoggerFactory.getLogger(StudentUtils.class);

    public static Student getStudentFromRequest(HttpServletRequest httpServletRequest) throws UnsupportedEncodingException {
        Student stu = new Student();
        httpServletRequest.setCharacterEncoding("UTF-8"); //post传值乱码时使用
        logger.info("请求头开始============================");
        Enumeration<String> enumeration = httpServletRequest.getHeaderNames();
        while (enumeration.hasMoreElements()) {
            String headName = enumeration.nextElement();
            logger.info(headName + "-->" + httpServletRequest.getHeader(headName));
        }
        logger.info("请求头结束============================");
        logger.info("缓存查询开始==========================");
        Cookie[] cookies = httpServletRequest.getCookies();
        for(Cookie c : cookies) {
            logger.info("缓存" + c.getName() + "-->" + c.getValue());
        }
        logger.info("缓存查询结束==========================");
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
