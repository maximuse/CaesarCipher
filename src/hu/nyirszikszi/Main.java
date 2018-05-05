package hu.nyirszikszi;

import hu.nyirszikszi.classes.Decrypt;
import hu.nyirszikszi.classes.Encrypt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		List l = new ArrayList<>();
		l.add("Encrypt");
		l.add("Decrypt");
	
		for (int i = 0; i < l.size(); i++) {
			System.out.println((i+1) + " - " + l.get(i));
		}
		
		System.out.print("\nItem of menu: ");
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