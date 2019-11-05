package org.loyer.web.controller;

import org.loyer.web.service.IstudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StudentController implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {

        ModelAndView mv = new ModelAndView();
        ApplicationContext springContext = new ClassPathXmlApplicationContext("application.xml");
        IstudentService service = (IstudentService) springContext.getBean("studentServiceImpl");
        mv.addObject("students", service.getAllStudents());
        mv.setViewName("/WEB-INF/jsp/stu.jsp");
        return mv;
    }
}
