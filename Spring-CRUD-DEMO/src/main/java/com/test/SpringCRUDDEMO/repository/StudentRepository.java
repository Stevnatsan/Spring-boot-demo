package com.test.SpringCRUDDEMO.repository;

import com.test.SpringCRUDDEMO.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
