package com.java4u.ds.stack.balancedparaenthesis;

import java.util.Stack;

public class BalancedParaenthesis {
	@SuppressWarnings("unchecked")
	public int isValid(String a) {
		Stack st = new Stack();
		char[] exp = a.toCharArray();

		for (int i = 0; i < exp.length; i++) {

			if (exp[i] == '{' || exp[i] == '(' || exp[i] == '[')
				st.push(exp[i]);

			if (exp[i] == '}' || exp[i] == ')' || exp[i] == ']') {

				if (st.isEmpty()) {
					return 0;
				}

				else if (!isMatchingPair((char) st.pop(), exp[i])) {
					return 0;
				}
			}

		}

		if (st.isEmpty())
			return 1;
		else {
			return 0;
		}
	}

	static boolean isMatchingPair(char character1, char character2) {
		if (character1 == '(' && character2 == ')')
			return true;
		else if (character1 == '{' && character2 == '}')
			return true;
		else if (character1 == '[' && character2 == ']')
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		System.out.println(new BalancedParaenthesis().isValid("])"));
	}
}
