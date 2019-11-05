package org.loyer.web.dao;

import org.loyer.web.beans.Student;

import java.util.List;

public interface IstudentDao {

    List<Student> selectAllStudents();
    void insertStudent(Student stu);
    void updateOne(Student stu);
}
