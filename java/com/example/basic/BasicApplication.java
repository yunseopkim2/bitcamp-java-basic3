package com.example.basic;

import com.example.basic.oop.controller.OopController;
import com.example.basic.oop2.controller.OopController1;
import com.example.basic.quiz.controller.QuizController;
import com.example.basic.member.controller.MemberController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class BasicApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasicApplication.class, args);
		Scanner scanner = new Scanner(System.in);
		OopController phoneController = new OopController();
		QuizController quizController = new QuizController();
		MemberController memberController = new MemberController();
		OopController1 phoneController1 = new OopController1();
		while (true){
			System.out.println("Menu\n"+"0.Exit"+" 1.Member"+" 2.Phone"+" 3.Quiz"+" 4.Algorithm");
			switch (scanner.next()){
				case "0" : System.out.println("### Exit ###");return;
				case "1" :
					System.out.println("### Auth ###");
					memberController.execute(scanner);break;
				case "2" :
					System.out.println("### OOP ###");
					phoneController.execute(scanner);break;
				case "3" :
					System.out.println("### Quiz ###");
					quizController.execute(scanner);break;
				case "4" :
					System.out.println("### Algorithm ###");
					phoneController1.execute1(scanner);
					break;

				default: System.out.println("Wrong Number");break;
			}
		}

	}

}
