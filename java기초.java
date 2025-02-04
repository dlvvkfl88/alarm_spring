package com.example.wonjang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WonjangApplication {

	public static void main(String[] args) {
		SpringApplication.run(WonjangApplication.class, args);

		String lover = "이씨";
		int age = 27;
		System.out.println(lover);
	}

}
