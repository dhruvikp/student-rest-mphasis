package com.simplilearn.service;

import java.util.List;

import com.simplilearn.model.Student;
import com.simplilearn.model.StudentDTO;

public interface StudentService {

    public Student createNewStudent(StudentDTO studentDto);

    public List<Student> getStudents();
}
