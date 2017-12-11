package com.java4u.dp.interpreter.test;

import com.java4u.dp.interpreter.AndExpression;
import com.java4u.dp.interpreter.Expression;
import com.java4u.dp.interpreter.OrExpression;
import com.java4u.dp.interpreter.TerminalExpression;

public class TestInterpreterPattern {

	public static Expression getMaleExpression() {
		Expression robert = new TerminalExpression("Robert");
		Expression john = new TerminalExpression("John");
		return new OrExpression(robert, john);
	}

	public static Expression getMarriedWomanExpression() {
		Expression julie = new TerminalExpression("Julie");
		Expression married = new TerminalExpression("Married");
		return new AndExpression(julie, married);
	}

	public static void main(String[] args) {
		Expression isMale= getMaleExpression();
		Expression isMarriedWoman= getMarriedWomanExpression();
		
		System.out.println("John is male? "+ isMale.interpret("John"));
		System.out.println("Julie is a married woman? "+ isMarriedWoman.interpret("Married Julie"));
	}

}
