package com.example.spring_class;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import com.example.spring_class.student.Student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class SpringClassApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringClassApplication.class, args);
	}

	@GetMapping
	public List<Student> print()
	{
		return List.of(
			new Student(
				1L,
				"Pranta Palit",
				"ppalit.cghs@gmail.com",
				LocalDate.of(1996, Month.OCTOBER, 12),
				26
			)
		);
	}
}
