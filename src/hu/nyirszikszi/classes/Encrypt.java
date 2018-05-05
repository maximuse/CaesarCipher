package hu.nyirszikszi.classes;

import java.util.Scanner;

public class Encrypt extends Crypt {
	private String plainText;
	private String encodedText;
	
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
			char x = plainText.charAt(i);
			char omega;
			int s = (int) x;
			int k;
			
			if((s>47) && (s<58)) {
				k = 10;
				omega = '9';
			}
			else if((s>64) && (s<91)) {
				k = 26;
				omega = 'Z';
			}
			else {
				k = 26;
				omega = 'z';
			}
			
			char c = (char) (x + key);
			
			if (c > omega) {
				encodedText += (char) (plainText.charAt(i) - (k - key));
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