package _01_Simple_Array_Algorithms;

import java.util.Random;

public class MoreArrayFun {
	// 1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		String[] tooo = { "dexter", "darcey", "cat", "goldfish", "chiken" };
		
		printArray(tooo);
		reverseArray(tooo);
		everyOther(tooo);
		randomPrint(tooo);
	}
	// 2. Write a method that takes an array of Strings and prints all the Strings
	// in the array.

	public static void printArray(String[] arr) {
		String total = "";
		for (int i = 0; i < arr.length; i++) {
			total += arr[i];
		}
		System.out.println(total);
	}

	// 3. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in reverse order.
	public static void reverseArray(String[] ee) {
		String reverse = "";
		// 12345
		// 01234
		// 4 > -1 -- 43210
		for (int x = ee.length - 1; x > -1; x--) {
			reverse += ee[x];
		}

		System.out.println(reverse); 
	}

	// 4. Write a method that takes an array of Strings and prints every other
	// String in the array.
	public static void everyOther(String[] oth) {
		String other = "";
		//12345
		for (int y = 0; y < oth.length; y += 2) {
			other += oth[y];
		}

		System.out.println(other);
	}

	// 5. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in a completely random order. Almost every run of the program should result
	// in a different order.
	public static void randomPrint(String[] norm) {
		String ra = "";
		int x = 0;
		while (x < norm.length) {
			//fix this
			if (ra.indexOf(norm[((int)( Math.random() * norm.length - 1))]) == -1) {
				ra += norm[((int)( Math.random() * norm.length - 1))];
				x++;
			}
			
		}

		System.out.println(ra);
	}

}
