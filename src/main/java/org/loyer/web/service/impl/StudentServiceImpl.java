package org.loyer.web.service.impl;

import org.loyer.web.beans.Student;
import org.loyer.web.dao.IstudentDao;
import org.loyer.web.service.IstudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements IstudentService {

    @Autowired
    private IstudentDao dao;

    public void setDao(IstudentDao dao) {
        this.dao = dao;
    }

    @Override
    public List<Student> getAllStudents() {
        return dao.selectAllStudents();
    }

    @Override
    public void addStudent(Student stu) {
        dao.insertStudent(stu);
    }

    @Override
    public void modifyOne(Student stu) {
        dao.updateOne(stu);
    }
}
