package com.xenon.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(IStudentRepository repository) {
        return args -> {
            Student bob = new Student("Bob Marley",
                    "marley@gmail.com",
                    LocalDate.of(2002, Month.APRIL, 3),
                    20);

            Student alice = new Student("Alice Root",
                    "aroot@gmail.com",
                    LocalDate.of(2003, Month.DECEMBER, 25),
                    19);

            repository.saveAll(List.of(bob, alice));
        };
    }

}
