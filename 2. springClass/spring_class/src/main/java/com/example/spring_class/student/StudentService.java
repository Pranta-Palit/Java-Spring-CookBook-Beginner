package com.example.spring_class.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
    public List<Student> getStudents()
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
