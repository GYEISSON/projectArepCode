package edu.escuelaing.arsw.projecDesign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;

@SpringBootApplication
public class ProjectDesign
{
    public static void main( String[] args ) {

        SpringApplication app = new SpringApplication(ProjectDesign.class);
        app.setDefaultProperties(Collections.singletonMap("spring.data.mongodb.uri", "mongodb+srv://andresda1302:churrias123@cluster0.wloae.mongodb.net/ProjectDesign?retryWrites=true&w=majority"));
        app.run(args);
    }
}
