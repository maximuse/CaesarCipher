package hu.nyirszikszi.classes;

import java.util.Scanner;

public class Encrypt extends Crypt {
	private String plainText, encodedText;
	
	public Encrypt() {
		System.out.println("\nText:");
		plainText = new Scanner(System.in).nextLine();
		
		System.out.println("\nKey:");
		key = new Scanner(System.in).nextInt();
		
		encode();
		show();
	}
	
	private String encode() {
		encodedText = "";
		
		for (int i = 0; i < plainText.length(); i++) {
			char c = (char) (plainText.charAt(i) + key);
			
			if (c > 'z') {
				encodedText += (char) (plainText.charAt(i) - (26 - key));
			}
			else {
				encodedText += (char) (plainText.charAt(i) + key);
			}
		}
		
		return encodedText;
	}
	
	@Override
	public void show() {
		System.out.println("\n\nInput:\n" + plainText + "\n\nOutput:\n" + encodedText);
	}
}