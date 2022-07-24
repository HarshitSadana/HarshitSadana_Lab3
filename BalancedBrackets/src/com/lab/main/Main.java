package com.lab.main;

import java.util.Scanner;

import com.lab.service.balancingImplementation;

public class Main {

	public static void main(String[] args) {
		balancingImplementation bi = new balancingImplementation();

		String expression;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the expression:");
		expression = sc.next();

		if (bi.areBracketsBalanced(expression))
			System.out.println("The entered String has Balanced Brackets ");
		else
			System.out.println("The entered Strings do not contain Balanced Brackets ");
			sc.close();
	}

}
