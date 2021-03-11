package _00_Intro_To_Arrays;

import java.util.Random;

public class _01_IntroToArrays {
	public static void main(String[] args) {
		// 1. declare and Initialize an array 5 Strings
		String[] hu = new String[5];

		// 2. print the third element in the array
		System.out.println(hu[2]);
		// 3. set the third element to a different value
		hu[2] = "tao";

		hu[0] = "hu";
		hu[1] = "jean";
		hu[3] = "barba";
		hu[4] = "xianling";
		// 4. print the third element again
		System.out.println(hu[2]);
		// 5. use a for loop to set all the elements in the array to a string
		// of your choice
		int c = 0;
		while (c < 5) {
			hu[c] = "yayayyayayayaya";
			System.out.println(hu[c]);
			c++;
		}
		// 6. use a for loop to print all the values in the array
		// BE SURE TO USE THE ARRAY'S length VARIABLE
		// for (statement 1; statement 2; statement 3) {
		// code block to be executed
		// }
		for (int i = 0; i < 5; i++) {
			System.out.println(hu[i].length());
			System.out.println(hu[i]);
		}
		// 7. make an array of 50 integers
		int[] ints = new int[50];
		// 8. use a for loop to make every value of the integer array a random
		// number
		Random ran = new Random();
		for (int i = 0; i < 50; i++) {
			ints[i] = (ran.nextInt(100));
		}
		// 9. without printing the entire array, print only the smallest number
		// on the array
		int small = ints[0];
		for (int i = 0; i < 49; i++) {
			if (small > ints[i + 1]) {
				small = ints[i + 1];
			}

		}
		System.out.println("The smallest is " + small);
		// 10 print the entire array to see if step 8 was correct
		for (int i = 0; i < 50; i++) {
			System.out.println(ints[i]);
		}
		// 11. print the largest number in the array.
		int large = ints[0];
		for (int i = 0; i < 49; i++) {
			if (large < ints[i + 1]) {
				large = ints[i + 1];
			}
		}
		System.out.println("the largest is " + large);
		// 12. print only the last element in the array
		System.out.println(ints[49]);
	}
}
