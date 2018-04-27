package hu.nyirszikszi;

import hu.nyirszikszi.classes.Decrypt;
import hu.nyirszikszi.classes.Encrypt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		System.out.println("1 - Encrypt\n2 - Decrypt\n\n");
		
		System.out.print("Item of menu: ");
    	int n = new Scanner(System.in).nextInt();
  
		try {
			switch (n) {
				case 1:
					Encrypt encrypt = new Encrypt();
					break;
				case 2:
					Decrypt decrypt = new Decrypt();
					break;
			}
		}
		catch (RuntimeException e) {
			System.out.println(e);
		}
	}
}