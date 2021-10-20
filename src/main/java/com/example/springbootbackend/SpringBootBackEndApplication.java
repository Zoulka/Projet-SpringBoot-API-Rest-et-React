package com.example.springbootbackend;

import com.example.springbootbackend.Repository.UserRepository;
import com.example.springbootbackend.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootBackEndApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootBackEndApplication.class, args);
    }
@Autowired
private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        this.userRepository.save(new User("Aminata", "Assahalou","aminata@gmail.com"));
        this.userRepository.save(new User("Salihou", "Badiara","salihou@gmail.com"));
        this.userRepository.save(new User("Djibrilla", "Assahalou","djibrilla@gmail.com"));
    }
}
