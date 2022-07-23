package com.nagarro.assignment1;

import java.util.Scanner;

import com.nagarro.assignment1.input.InputReader;
import com.nagarro.assignment1.model.CarSchema;
import com.nagarro.assignment1.output.OutputWriter;

public class InsuranceCalculator {
	
	private static final Scanner SCANNER = new Scanner(System.in);
			
	public static void main(String[] args) {
		char choice='y'; //menu control variable, by default 'y'
		while(Character.compare(choice, 'y')==0 ) {
			CarSchema newCar = new CarSchema(); 
			CarSchema.entryMessage();
			newCar = InputReader.inputDetails();
			OutputWriter.displayDetails(newCar);
			System.out.println("Do you want to enter details of any other car (y/n)");
			choice = SCANNER.next().toLowerCase().charAt(0);
		}
	}
}
