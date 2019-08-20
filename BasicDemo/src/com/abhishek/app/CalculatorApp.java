package com.abhishek.app;

import java.util.Scanner;

import com.abhishek.func.Calculator;
import com.abhishek.func.CalculatorImpl;

public class CalculatorApp extends CalculatorImpl{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two numbers");
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		Calculator calc = new CalculatorImpl();
		boolean flag = true;
		while(flag) {
			System.out.println("Option:\n 1 for addition\n 2 for substraction\n 3 for multiplication\n 4 for division");
			int opt = sc.nextInt();
			switch(opt) {
			case 1:{
				System.out.println(calc.add(a,b));
				break;
			}
			case 2:{
				System.out.println(calc.substract(a, b));
				break;
			}
			case 3:{
				System.out.println(calc.multiply(a, b));
				break;
			}
			case 4:{
				System.out.println(calc.divide(a, b));
				break;
			}
			case 5:{
				flag = false;
				break;
			}
			default:{
				System.out.println("Invalid choice");
				break;
			}
			}
		}
	}

}
