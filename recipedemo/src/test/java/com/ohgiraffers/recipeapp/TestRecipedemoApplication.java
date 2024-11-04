package com.ohgiraffers.recipeapp;

import org.springframework.boot.SpringApplication;

public class TestRecipedemoApplication {

    public static void main(String[] args) {
        SpringApplication.from(RecipedemoApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
