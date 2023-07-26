package com.simplilearn.service;

import com.simplilearn.model.Student;
import com.simplilearn.model.StudentDTO;
import com.simplilearn.repository.StudentRepository;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService, Serializable {

    private static final long serialVersionUID = 7746269188093200642L;

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student createNewStudent(StudentDTO studentDto) {

        Student student = new Student();

        BeanUtils.copyProperties(studentDto, student);

        studentRepository.saveAndFlush(student);

        return student;
    }

    @Override
    public List<Student> getStudents() {

        return studentRepository.findAll();
    }


}
