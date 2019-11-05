package org.loyer.web.service;

import org.loyer.web.beans.Student;

import java.util.List;

public interface IstudentService {
    List<Student> getAllStudents();
    void addStudent(Student stu);
    void modifyOne(Student stu);
}
