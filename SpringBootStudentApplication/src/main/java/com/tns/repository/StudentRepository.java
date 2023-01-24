package com.tns.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tns.entity.Student;

public interface StudentRepository  extends JpaRepository<Student,Integer > {

}
