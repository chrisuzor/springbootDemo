package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
          Student chris =  new Student(
                    "Chris",
                    LocalDate.of(1993, Month.SEPTEMBER, 10),
                    "c.uzor@yahoo.com"

            );

            Student mariam =  new Student(
                    "Mariam",
                    LocalDate.of(1995, Month.AUGUST, 7),
                    "mariam@yahoo.com"

            );

            repository.saveAll(List.of(chris, mariam));
        };
    }
}
