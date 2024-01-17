package com.test.SpringCRUDDEMO.service.impl;

import com.test.SpringCRUDDEMO.entity.Student;
import com.test.SpringCRUDDEMO.repository.StudentRepository;
import com.test.SpringCRUDDEMO.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void addStudent(Student student){
        studentRepository.save(student);
    }

    @Override
    public List<Student> getStudentList() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudent(Integer StudentId) {
        Student student = studentRepository.findById(StudentId).get();

        return student ;
    }

    @Override

    public void updateStudent(Integer StudentId, Student student) {

        studentRepository.findById(StudentId).get();
        student.setStudentId(StudentId);
      studentRepository.save(student);

    }

    @Override
    public void deleteStudent(Integer StudentId) {
       Student student = studentRepository
                .findById(StudentId).get();

        studentRepository.delete(student);
    }


}
