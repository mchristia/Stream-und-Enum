package com.example.streamsdemo.exercise;

import com.example.streamsdemo.model.Student;
import com.example.streamsdemo.model.StudentDto;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class StudentService {

   private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    // 1. Filter students by location using streams
    public List<Student> getStudentsByLocation(String location){
        return studentRepository.getStudents().stream().filter(student -> student.getLocation().equals(location)).collect(Collectors.toList());
    }

    // 2. Filter students by location and maximum age using streams
    public List<Student> getStudentsByLocationAndMaximumAge(String location, int maxAge){
        return studentRepository.getStudents().stream()
                .filter(student -> student.getLocation().equals(location))
                .filter(student -> student.getAge() <= maxAge).collect(Collectors.toList());
    }

    // 3. Get the oldest student
    public Student getOldestStudent(){
        return studentRepository.getStudents().stream()
                .max(Comparator.comparing(Student::getAge)).get();
    }

    // 4. Write a method that maps a Student to a StudentDto
    public List<StudentDto> createStudentDto(){
        return studentRepository.getStudents().stream()
                .map(student -> StudentDto.builder().location(student.getLocation()).name(student.getName()).build())
                .collect(Collectors.toList());
    }





}
