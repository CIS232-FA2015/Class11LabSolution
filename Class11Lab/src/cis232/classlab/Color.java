package cis232.classlab;

import java.util.Scanner;

public class Color {
	String color;

	public Color(String color) {
		switch (color.toUpperCase()) {
		case "RED":
		case "BLUE":
		case "GREEN":
			this.color = color;
			break;
		default:
			throw new UnsupportedColorException(color);
		}
	}

	public static void main(String[] args) {
		System.out.println("Input a color name");

		Scanner keyboard = new Scanner(System.in);
		try {
			Color c = new Color(keyboard.nextLine());
			System.out.println("That color is supported!");
		} catch (UnsupportedColorException e) {
			System.out.println(e.getMessage());
		}
		keyboard.close();
	}
}
