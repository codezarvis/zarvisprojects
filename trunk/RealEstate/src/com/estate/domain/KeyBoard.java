package com.estate.domain;
import java.util.Scanner;

public class KeyBoard {

	private static Scanner SCANNER = new Scanner(System.in);

	public static int readInt(String message) {
		System.out.print(message);
		return SCANNER.nextInt();
	}

	public static String readString(String message) {
		System.out.print(message);
		return SCANNER.next();
	}

}
