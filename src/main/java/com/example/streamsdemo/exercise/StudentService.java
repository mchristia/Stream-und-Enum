package com.example.streamsdemo.exercise;

import com.example.streamsdemo.model.Location;
import com.example.streamsdemo.model.Student;
import com.example.streamsdemo.model.StudentDto;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;


public class StudentService {

    private final List<Student> students = new ArrayList<>(List.of(
            Student.builder().name("Frank").location(Location.HAMBURG).age(42).build(),
            Student.builder().name("Maria").location(Location.COLOGNE).age(15).build(),
            Student.builder().name("Klaus").location(Location.FRANKFURT).age(22).build(),
            Student.builder().name("Frida").location(Location.COLOGNE).age(77).build(),
            Student.builder().name("Franziska").location(Location.MUNICH).age(45).build(),
            Student.builder().name("Anne").location(Location.FRANKFURT).age(50).build(),
            Student.builder().name("Hans").location(Location.HAMBURG).age(43).build(),
            Student.builder().name("Hugo").location(Location.HAMBURG).age(17).build(),
            Student.builder().name("Gerda").location(Location.MUNICH).age(31).build()
    ));

    // Always use Java Streams. Check StudentServiceTest.java for further explanation

    // 1. filter students by location
    public List<Student> getStudentsByLocation(Location location){// ... getStudentsByLocation("Hamburg")
        List<Student> result = students.stream()
                .filter(student -> student.getLocation().equals(location))
                .collect(Collectors.toList());
        return result;
    }

    // 2. filter students by location and maximum age
    public List<Student> getStudentsByLocationAndMaximumAge(Location location, int maxAge){
        List<Student> result = students.stream()
                .filter(student -> student.getLocation().equals(location) &&  (student.getAge() <= maxAge))
                .collect(Collectors.toList());
        return result;
    }

    // 3. map every Student to a StudentDto
    public List<StudentDto> createStudentDto(){
        List<StudentDto> result = students.stream()
                .map(student -> StudentDto.builder().name(student.getName()).location(student.getLocation()).build())
                .collect(Collectors.toList());
        return result;
    }

    // 4. return a list with all names starting with F in uppercase and alphabetically sorted
    public List<String> filterStudentsByName(){
        List<String> result = students.stream().filter(student ->  student.getName().startsWith("F"))
                .map(student -> student.getName().toUpperCase()).sorted()
                .collect(Collectors.toList());
        return result;
    }

}
