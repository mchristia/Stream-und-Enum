package com.example.streamsdemo.exercise;

import com.example.streamsdemo.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class StudentRepository {

    private ArrayList<Student> students = new ArrayList<>(List.of(
            Student.builder().name("Frank").location("Hamburg").age(42).build(),
            Student.builder().name("Maria").location("Köln").age(15).build(),
            Student.builder().name("Klaus").location("Frankfurt").age(22).build(),
            Student.builder().name("Franziska").location("München").age(45).build(),
            Student.builder().name("Anne").location("Frankfurt").age(50).build(),
            Student.builder().name("Hans").location("Hamburg").age(43).build(),
            Student.builder().name("Klaus").location("Hamburg").age(17).build(),
            Student.builder().name("Gerda").location("München").age(31).build(),
            Student.builder().name("Frida").location("Köln").age(77).build()
    ));

    public List<Student> getStudents(){
        return Collections.unmodifiableList(students);
    }
}
