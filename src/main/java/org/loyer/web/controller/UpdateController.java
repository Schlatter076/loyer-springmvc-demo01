package org.loyer.web.controller;

import org.loyer.web.beans.Student;
import org.loyer.web.service.IstudentService;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UpdateController implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {

        Student stu = new Student();
        ModelAndView mv = new ModelAndView();
        String name = httpServletRequest.getParameter("name");
        String age = httpServletRequest.getParameter("age");
        String score = httpServletRequest.getParameter("score");
        WebApplicationContext springContext = WebApplicationContextUtils.getWebApplicationContext(httpServletRequest.getSession().getServletContext());
        IstudentService service = (IstudentService) springContext.getBean("studentServiceImpl");
        stu.setName(name);
        stu.setAge(Integer.parseInt(age));
        stu.setScore(Double.parseDouble(score));
        service.modifyOne(stu);
        mv.setViewName("/WEB-INF/static/success.html");

        return mv;
    }
}
