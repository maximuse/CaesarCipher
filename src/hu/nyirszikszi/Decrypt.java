package hu.nyirszikszi;

import java.util.Scanner;

public class Decrypt extends Crypt {
	private String encodedText, decodedText;
	
	public Decrypt() {
		System.out.println("\nText:");
		encodedText = new Scanner(System.in).nextLine();
		
		System.out.println("\nKey:");
		key = new Scanner(System.in).nextInt();
		
		decode();
		show();
	}
	
	private String decode() {
		decodedText = "";
		
		for (int i = 0; i < encodedText.length(); i++) {
			char c = (char) (encodedText.charAt(i) - key);
			
			if (c > 'z') {
				decodedText += (char) (encodedText.charAt(i) + (26 + key));
			}
			else {
				decodedText += (char) (encodedText.charAt(i) - key);
			}
		}
		
		return decodedText;
	}
	
	@Override
	public void show() {
		System.out.println("\n\nInput:\n" + encodedText + "\n\nOutput:\n" + decodedText);
	}
}