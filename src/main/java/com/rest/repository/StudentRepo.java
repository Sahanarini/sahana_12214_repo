package com.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rest.model.Student;
@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

}
