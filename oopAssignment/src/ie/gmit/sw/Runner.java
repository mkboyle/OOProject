package ie.gmit.sw;

import java.io.IOException;
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) throws IOException {
		
		Scanner console = new Scanner(System.in);
		
		String input;
		String cypherText;
		
		System.out.println("Enter the message to be decrypted: ");
		System.out.println("Message should have no spaces and in upper case");
		input = console.nextLine();
		cypherText = encryptInput(input); 
		System.out.println("Encrypted Text: "+cypherText);
			
	
	    
	}

	private static String encryptInput(String input) {
		
		RailFence rf = new RailFence();
		String cypherText = rf.encrypt(input, 5);
		return cypherText;
		
	}
}
