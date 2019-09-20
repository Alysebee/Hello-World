package carrier_p1;

import java.util.Scanner;

public class Example_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		
		int num1;
		int num2;
		int num3;
		int num4;
		
		System.out.println("What is the first digit?");
			num1 = scnr.nextInt();
		System.out.println("What is the second digit?");
			num2 = scnr.nextInt();
		System.out.println("What is the third digit?");
			num3 = scnr.nextInt();
		System.out.println("What is the fourth digit?");
			num4 = scnr.nextInt();					
		
		System.out.println("You entered:" + num1 + " " + num2 + " " + num3 + " " + num4); 
		
		num1 += 7; //edit the digits 
		num1 %= 10;
		num2 += 7;
		num2 %=10;
		num3 += 7;
		num3 %=10;
		num4 += 7;
		num4 %=10;
		
		//System.out.println("new code:" + num1 + num2 + num3 + num4);
		
		System.out.print("Encrypted code: ");
		System.out.print(num3 + " "); //switches the digits places
		System.out.print(num4 + " "); // & gives encrypted code
		System.out.print(num1 + " ");
		System.out.println(num2 + " ");
		

		//PART TO DECRYPT CODE
		if (num1 <= 6) {
			num1 += 10;
			num1 -= 7;
		}
		if (num1 > 6) {
			num1 -= 7;
		}
						
		if (num2 <= 6) {
			num2 += 10;
			num2 -= 7;
		}
		if (num2 > 6) {
			num2 -= 7;
		}
		
		if (num3 <= 6) {
			num3 += 10;
			num3 -= 7;
		}
		if (num3 > 6) { 
			num3 -= 7;
		}
		if (num4 <= 6) {
			num4 += 10;
			num4 -= 7;
		}
		if (num4 > 6) {
			num4 -= 7;
		}
		
		System.out.print("Decrypted Number is: ");
		System.out.print(num1 + " ");
		System.out.print(num2 + " ");
		System.out.print(num3 + " ");
		System.out.println(num4 + " ");
	}
		
}


