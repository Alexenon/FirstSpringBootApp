package com.xenon.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents(){
        return List.of(
                new Student(1L,
                        "Bob Marley",
                        "marley@gmail.com",
                        LocalDate.of(2002, Month.APRIL, 3),
                        20),

                new Student(2L,
                        "Alice Root",
                        "aroot@gmail.com",
                        LocalDate.of(2003, Month.DECEMBER, 25),
                        19)
        );
    }

}
