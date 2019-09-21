package paredes_PA2;

import java.util.Scanner;

public class hollander_p1a_encrypt {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String integer;
		int integer_array[] = new int [4];
		int first, second, third, fourth;
		
		System.out.print("Enter integer to encrypt: ");
		integer = input.nextLine();
		
		first = Integer.parseInt((integer).substring(0, 1));
		second = Integer.parseInt((integer).substring(1, 2));
		third = Integer.parseInt((integer).substring(2, 3));
		fourth = Integer.parseInt((integer).substring(3, 4));
		
		/**Replace each digit with the result of adding 7 to the digit and getting the remainder 
		after dividing the new value by 10. Then swap the first digit with the third, and swap 
		the second digit with the fourth. Then print the encrypted integer. Write a separate 
		application that inputs an encrypted four-digit integer and decrypts it (by reversing the 
		encryption scheme) to form the original number.**/
		
		first = (first + 7) % 10;
		second = (second + 7) % 10;
		third = (third + 7) % 10;
		fourth = (fourth + 7) % 10;
		
		integer_array[0] = third;
		integer_array[1] = fourth;
		integer_array[2] = first;
		integer_array[3] = second;
		
		System.out.print("Encrypted integer: ");
		
		for (int i = 0; i < 4 ; i++) {
			System.out.printf("%d", integer_array[i]);
		}
	
	}
	
}