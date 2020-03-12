package com.nga.rockschoolscheduler.service;

import com.nga.rockschoolscheduler.dao.StudentRepository;
import com.nga.rockschoolscheduler.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student findById(int id) {

        Optional<Student> result = studentRepository.findById(id);

        Student student;

        if (result.isPresent()) {
            student = result.get();
        } else {
            //if we didn't find the student
            throw new RuntimeException("Did not find student id - " + id);
        }

        return student;
    }

    @Override
    public void save(Student student) {
        studentRepository.save(student);
    }

    @Override
    public void deleteById(int id) {
        studentRepository.deleteById(id);
    }
}
