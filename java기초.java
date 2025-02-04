package com.example.wonjang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WonjangApplication {

	public static void main(String[] args) {
		SpringApplication.run(WonjangApplication.class, args);
		var test = new Test(); // test변수를 Test클래스를입힌 Object 라고 한다 
		System.out.println(test.name);
		test.hello();
	}

}

class Test {
	String name = "kim";
	void hello(){
		System.out.println("안녕");
	}
}
