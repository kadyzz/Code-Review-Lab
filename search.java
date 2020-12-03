package searchFile;
/*
 * Program that searches a specified text file where a specified word occurs and prints out the whole line.
 * 
 * @author Kadriye Yildiz 
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class search {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string: ");
		String str = sc.nextLine(); // takes in the user input in the form "search [word] [file]"

		String[] arr = str.split(" "); // splits the whole string into single words in an array to pinpoint file and
										// given word separately

		String word = arr[1]; // the specified word to search for
		String file = arr[2]; // the specified file to search the word in

		BufferedReader br = new BufferedReader(new FileReader(file)); // start reading of file
		String line;
		while ((line = br.readLine()) != null) // read every line until text ends
		{
			if (line.indexOf(word) != -1) // if the word matches in a line
			{
				System.out.println(line); // print the whole line
			}
		}
		br.close();
	}
}
