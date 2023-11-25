
///// JAVA Class 12 part 1.a: on June 3, 2023, Saturday with Instructor AP ////


package nb_cl12_RandomPractice_pkg;

import java.util.*;
import java.util.Random;
import java.io.File;
import java.io.IOException;
import java.lang.*;

public class NB_cl12notes_practiceQA {

	
	
	
	
	
	
	
	// ========== ============= ================= ================ ===============
	
	
	
	
// Exercise 4:	Generating a text file with unique random numbers to it?
	public static void main(String[] args) throws IOException {
		
		
		String f = "file1";
		
		File myObj = new File("data//" + f + ".txt");   // this will help to create a unique file every time by generating a random number files
			//
		
		myObj.createNewFile();
		System.out.println("File creation is done!");
			try {
				if (myObj.createNewFile()) {
					System.out.println("File created: " + myObj.getName());
				} 
				else {
					System.out.println("File already exists.");
				}
			}
			catch (IOException e) {
				System.out.println("Warning Nish!! An error occurred.");
				e.printStackTrace();
			}
	}
}
	
	
	/*
// Exercise 3:	Generating a random number between 100 to 1000

	public static void main(String[] args) {
			
		int max = 999;
		int min = 100;
		
		Random random = new Random();
		int answer = random.nextInt((max - min + 1) + min);
//		int answer = random.nextInt(10) + 1;
	
		System.out.println("Your random number this time is:---> " + answer);
	
	}
}
	*/

	/*
// Exercise 2: Creation of generic code for all dataTypes for static to static:	

	public static void main(String[] args) {

		// dataTypes have to begin with Uppercase for this generic code...remember Mapping?
		Integer[] a = {343, 232, 656, 21, 6, 56, 23,23};	
			
		String[] c = {"sdf", "sdf", "dfg", "dhywe", "wer"};
		
		Boolean[] b = {true, true, true, false, false, true};
		
		printArray(a);
		System.out.println("=========");
		printArray(c);
		System.out.println("=========");
		printArray(b);
		System.out.println("=========");

			
	}
		// Generic code for all array dataTypes using 
	public static <Nish> void printArray(Nish[] x) {  
		// Nish is just the new generic dataType name we are creating for all use.... you have to make it non-primitive by starting the dataType with uppercase
		// we have to go in front of the return type and insert <newDataType> for the computer to understand that new arrayType DataType
			
		for(Nish item : x) {
			System.out.println(item);
		}
	}
}
	*/ 
	
	/*
// Exercise 1: printing all the value inside all array dataTypes:	

	public static void main(String[] args) {
	
		// remember these are as usual lowercases
		int[] a = {343, 232, 656, 21, 6, 56, 23, 23};	
		
		String[] c = {"sdf", "sdf", "dfg", "dhywe", "wer"};
	
		boolean[] b = {true, true, true, false, false, true};
	
		printArray(a);
		printArray(c);
		
	}
	
	public static void printArray(int[] x) {
	
		for(int item : x) {
			System.out.println(item);
		}
	}
	
	public static void printArray(String[] x) {
		
		for(String item : x) {
			System.out.println(item);
		}
	}
}
	*/



