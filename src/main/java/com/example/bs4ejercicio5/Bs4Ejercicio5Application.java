package com.example.bs4ejercicio5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
class SpringPruebaApplication implements CommandLineRunner {

    @Autowired
    MisPropiedades propiedades;

    public static void main(String[] args) {

        SpringApplication app = new SpringApplication(SpringPruebaApplication.class);
        app.run(args);
    }

    @Override
    public void run(String... arg0) throws Exception {

//        System.out.println(propiedades.getNombre());
//        System.out.println(propiedades.getApellidos());

    }

}

