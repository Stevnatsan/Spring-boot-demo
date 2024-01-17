package com.test.SpringCRUDDEMO.service;

import com.test.SpringCRUDDEMO.entity.Student;

import java.util.List;

public interface StudentService {
    void addStudent(Student student);

    List<Student> getStudentList();

    Student getStudent(Integer StudentId);

    void updateStudent(Integer StudentId, Student student);

    void deleteStudent(Integer StudentId);

}
