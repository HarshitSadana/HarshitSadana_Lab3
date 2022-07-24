package com.lab.service;

import java.util.Stack;

public class balancingImplementation {
	public boolean areBracketsBalanced(String expression) {
		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < expression.length(); i++) {
			char x = expression.charAt(i);

			if (x == '(' || x == '[' || x == '{') {
				stack.push(x);
				continue;
			}

			if (stack.isEmpty())
				return false;
			char check;
			switch (x) {
			case ')':
				check = stack.pop();
				if (check == '{' || check == '[')
					return false;
				break;

			case '}':
				check = stack.pop();
				if (check == '(' || check == '[')
					return false;
				break;

			case ']':
				check = stack.pop();
				if (check == '(' || check == '{')
					return false;
				break;
			}
		}
		return (stack.isEmpty());
	}
}
