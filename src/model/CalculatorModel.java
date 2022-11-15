package model;

import java.util.ArrayList;

public class CalculatorModel {
	
	private ArrayList<String> array = new ArrayList<>();
	private Boolean firstNumber = true;
	private String number;
	
	public void addDot(String s) {
		if(firstNumber) {
			number = "0.";
		} else if(!number.contains(s)) {
			number += ".";
		}
	}
	
	public void addDigit(String s) {
		if(firstNumber) {
			number = s;
			firstNumber = false;
		}else {
			number += s;
		}
	}
	
	public String getValue() {
		return number;
	}
	
	public void calculate(String operator) {
		if(array.isEmpty()) {
			array.add(number);
			array.add(operator);
			firstNumber = true;
		}else if(array.size() == 2) {
			if(operator.equals("=")) {
				number = String.valueOf(operate(array.get(0), array.get(1), number));
				array.clear();
			}else {
				array.set(2, operator);
			}

		}
		
	}
	
	public float operate(String value1, String operator, String value2) {
		float result = 0;
		
		switch(operator) {
			case "+":
				result = Float.parseFloat(value1) + Float.parseFloat(value2);
				break;
			case "-":
				result = Float.parseFloat(value1) - Float.parseFloat(value2);
				break;
			case "/":
				result = Float.parseFloat(value1) / Float.parseFloat(value2);
				break;
			case "*":
				result = Float.parseFloat(value1) * Float.parseFloat(value2);
				break;
		}
		return result;
	}
	
	public void clearArray() {
		number = "";
		array.clear();
	}

}
