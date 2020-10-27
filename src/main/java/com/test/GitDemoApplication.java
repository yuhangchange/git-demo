package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitDemoApplication {

    private static final String GIT_TEST = "GitDemoApplication";

    public static void main(String[] args) {
        SpringApplication.run(GitDemoApplication.class, args);
        System.out.println("test01");
        System.out.println("test02");

    }

    public static String getStr(){
        return GIT_TEST;
    }

}
