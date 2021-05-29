package com.example.streamsdemo.exercise;

import com.example.streamsdemo.model.Student;
import com.example.streamsdemo.model.StudentDto;

import java.util.ArrayList;
import java.util.List;


public class StudentService {

    private final List<Student> students = new ArrayList<>(List.of(
            Student.builder().name("Frank").location("Hamburg").age(42).build(),
            Student.builder().name("Maria").location("Köln").age(15).build(),
            Student.builder().name("Klaus").location("Frankfurt").age(22).build(),
            Student.builder().name("Frida").location("Köln").age(77).build(),
            Student.builder().name("Franziska").location("München").age(45).build(),
            Student.builder().name("Anne").location("Frankfurt").age(50).build(),
            Student.builder().name("Hans").location("Hamburg").age(43).build(),
            Student.builder().name("Hugo").location("Hamburg").age(17).build(),
            Student.builder().name("Gerda").location("München").age(31).build()
    ));

    // Always use Java Streams. Check StudentServiceTest.java for further explanation

    // 1. filter students by location
    public List<Student> getStudentsByLocation(String location){
        return null;
    }

    // 2. filter students by location and maximum age
    public List<Student> getStudentsByLocationAndMaximumAge(String location, int maxAge){
        return null;
    }

    // 3. map every Student to a StudentDto
    public List<StudentDto> createStudentDto(){
        return null;
    }

    // 4. return a list with all names starting with F in uppercase and alphabetically sorted
    public List<String> filterStudentsByName(){
        return null;
    }

}
