package com.nga.rockschoolscheduler.dao;

import com.nga.rockschoolscheduler.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
