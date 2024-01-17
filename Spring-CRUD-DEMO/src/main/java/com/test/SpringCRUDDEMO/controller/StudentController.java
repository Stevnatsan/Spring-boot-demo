package com.test.SpringCRUDDEMO.controller;

import com.test.SpringCRUDDEMO.entity.Student;
import com.test.SpringCRUDDEMO.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public String addStudent(@RequestBody Student student){
        studentService.addStudent(student);

        return "Succesfully add student";
    }

    @GetMapping
    public List<Student> getStudentList(){
        return studentService.getStudentList();

    }

    @GetMapping("/get")
    public Student getStudent(@RequestParam Integer StudentId){
        return studentService.getStudent(StudentId);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Void> updateStudent(@PathVariable Integer StudentId, @RequestBody Student student){
        studentService.updateStudent(StudentId, student);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable Integer StudentId){
        studentService.deleteStudent(StudentId);

        return ResponseEntity.noContent().build();
    }

}
