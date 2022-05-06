package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "mariam",
                        "mariam@gmail.com",
                        LocalDate.of(2000, Month.JANUARY, 5),
                        21
                ),
                new Student(
                        2L,
                        "mariam2",
                        "mariam@gmail.com2",
                        LocalDate.of(2000, Month.JANUARY, 5),
                        212
                )
        );
    }
}
