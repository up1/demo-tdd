package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class AddOperation { 

	public double calculate(int operand1, int operand2) {
		return operand1 + operand2;
	}

}
