package com.privalia.presentation;

public class Principal {

	public static void main(String[] args) 
	{
		ICalculator calculator = new Calculator();
		System.out.println(calculator.add(4,4));
	}
}
