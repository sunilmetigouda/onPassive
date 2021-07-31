package com.java.programs;

import java.util.Scanner;

public class RemoveStringSpace {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String- ");

		String str = sc.nextLine();
		System.out.println("old String:::" + str);
		str = str.replaceAll("\\s", "");
		System.out.println("new String:::" + str);

	}
}
