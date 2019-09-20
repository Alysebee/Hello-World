package carrier_p2;

import java.util.Scanner;

public class example_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		
		String type;
		double weight;
		double height;
		double BMI;
		
		System.out.println("Would you like to calculate your BMI in \"lbs\" or \"kg\"?");
		type = scnr.next();
		
		switch(type) {
			case "lbs":
				System.out.println("What is you weight in pounds?");
				weight = scnr.nextDouble();
				System.out.println("What is your height in inches?");
				height = scnr.nextDouble(); 
				
				BMI = (703.0 * weight)/(height * height);
				System.out.printf("BMI: %.2f", BMI);
				System.out.println("");
				
				if (BMI < 18.5) {
					System.out.println("You are underweight");
				}
				if (BMI >= 18.5 && BMI <25) {
					System.out.println("You are a normal weight");
				} 
				if (BMI >= 25 && BMI < 30) {
					System.out.println("You are overweight");
				}
				if (BMI >= 30) {
					System.out.println("You are obese");
				}
				
				break;
			case "kg":
				System.out.println("What is you weight in kilograms?");
				weight = scnr.nextDouble();
				System.out.println("What is your height in meters?");
				height = scnr.nextDouble();
				
				BMI = (weight * 1.0)/(height * height);
				System.out.printf("BMI: %.2f", BMI);
				System.out.println("");
				
				if (BMI < 18.5) {
					System.out.println("You are underweight");
				}
				if (BMI >= 18.5 && BMI <25) {
					System.out.println("You are a normal weight");
				}
				if (BMI >= 25 && BMI < 30) {
					System.out.println("You are overweight");
				}
				if (BMI >= 30) {
					System.out.println("You are obese");
				}
				
				break;
			default : 
				System.out.println("Invalid option. Please enter \"lbs\" or \"kg\"");
				break;
		}
		 
	}
}
