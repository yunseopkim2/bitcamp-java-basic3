package com.example.basic;

import com.example.basic.phone.controller.PhoneController;
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
		PhoneController phoneController = new PhoneController();
		QuizController quizController = new QuizController();
		MemberController memberController = new MemberController();
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
					System.out.println("### Algorithm ###");break;

				default: System.out.println("Wrong Number");break;
			}
		}

	}

}
