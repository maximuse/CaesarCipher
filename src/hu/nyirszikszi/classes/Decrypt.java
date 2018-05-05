package hu.nyirszikszi.classes;

import java.util.Scanner;

public class Decrypt extends Crypt {
	private String encodedText;
	private String decodedText;
	
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
			char x = encodedText.charAt(i);
			char alfa;
			int s = (int) x;
			int k;
			
			if((s>47) && (s<58)) {
				k = 10;
				alfa = '0';
			}
			else if((s>64) && (s<91)) {
				k = 26;
				alfa = 'A';
			}
			else {
				k = 26;
				alfa = 'a';
			}
			
			char c = (char) (x - key);
			
			if (c < alfa) {
				decodedText += (char) (encodedText.charAt(i) - key + k);
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