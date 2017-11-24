package com.java4u.dp.state.test;

import com.java4u.dp.state.Context;
import com.java4u.dp.state.StartState;
import com.java4u.dp.state.StopState;

public class StatePatternDemo {

	public static void main(String[] args) {
		Context context= new Context();
		
		StartState startState= new StartState();
		startState.doAction(context);
		
		System.out.println(context.getState().toString());
		
		StopState stopState= new StopState();
		stopState.doAction(context);
		
		System.out.println(context.getState().toString());

	}

}
