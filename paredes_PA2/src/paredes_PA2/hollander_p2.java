package paredes_PA2;

import java.util.Scanner;

public class hollander_p2 {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	double weightInPounds, heightInInches;
	double weightInKilograms, heightInMeters;
	int option;
	
	System.out.println("Option 1: Weight in Pounds, Height in Inches");
	System.out.println("Option 2: Weight in Kilograms, Height in Meters");
	System.out.print("\nEnter 1 or 2 to select your option: ");
	
	option = input.nextInt();
	
	if (option == 1) {
		
		System.out.print("Enter Weight in Pounds: ");
		weightInPounds = input.nextDouble();
		System.out.print("Enter Height in Inches: ");
		heightInInches = input.nextDouble();
		
		double BMI_Pounds = (703.0 * weightInPounds) / Math.pow(heightInInches,2);
		
		System.out.printf("Your BMI is: %f\n", BMI_Pounds);
		
		System.out.println("\nBMI Categories: ");
		System.out.println("Underweight = <18.5");
		System.out.println("Normal weight = 18.5–24.9");
		System.out.println("Overweight = 25–29.9");
		System.out.println("Obesity = BMI of 30 or greater");
	}
	
	else if (option == 2) {
		
		System.out.print("Enter Weight in Kilograms: ");
		weightInKilograms = input.nextDouble();
		System.out.print("Enter Height in Meters: ");
		heightInMeters = input.nextDouble();
		
		double BMI_Kilograms = (703.0 * weightInKilograms) / Math.pow(heightInMeters,2);
		
		System.out.printf("Your BMI is: %f\n", BMI_Kilograms);
		
		System.out.println("\nBMI Categories: ");
		System.out.println("Underweight = <18.5");
		System.out.println("Normal weight = 18.5–24.9");
		System.out.println("Overweight = 25–29.9");
		System.out.println("Obesity = BMI of 30 or greater");
	}
	
	else {
		
		System.out.println("Invalid option, try again later.");
	}
	
	
	
	
	}
}
