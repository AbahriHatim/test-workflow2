package com.example.testomar;

import com.example.testomar.entities.ClientP;
import com.example.testomar.entities.ClientVIP;
import com.example.testomar.service.ClientServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.UUID;
import java.util.stream.Stream;

@SpringBootApplication
public class TestOmarApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestOmarApplication.class, args);
    }


    @Bean
    CommandLineRunner commandLineRunner(ClientServiceImpl clientService){
        return args -> {
            Stream.of("hatim","taha").forEach(name->{
                clientService.addClientVIP(new ClientVIP( UUID.randomUUID().toString(),name,UUID.randomUUID().toString()));
            });
            Stream.of("yns","sohayb").forEach(name->{
                clientService.addClientP(new ClientP( UUID.randomUUID().toString(),name,new Date()));
            });
        };
    }
}
