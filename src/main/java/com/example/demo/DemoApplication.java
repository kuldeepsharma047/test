package com.example.demo;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    @Autowired
    private JavaMailSender javaMailSender;
    public static void main(String[] args) {

        SpringApplication.run(DemoApplication.class, args);
    }
    public void run(String... args) throws Exception {
        //sendEmail();

    }


}
