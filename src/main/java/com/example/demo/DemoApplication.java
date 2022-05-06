package com.example.demo;

import com.example.demo.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping
	public List<Student> hello() {
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
