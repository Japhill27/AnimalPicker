package animal;

import java.util.Scanner;

public class AnimalPicker {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String animal;
		System.out.println("What animal would you like to see: dog, cat, fish, bear?");
		animal = input.nextLine();
		while (!animal.equals("dog") || !animal.equals("cat") || !animal.equals("fish") || !animal.equals("bear")) {
			if (animal.equals("dog")) {
				System.out.println(" __ _\no\'\')}____//\n `_/)\n (_(_/-(_/");
				break;
			} else if (animal.equals("cat")) {
				System.out.println(" ^~^ ,\n (\'Y\') )\n / \\/\n(\\|||/)");
				break;
			} else if (animal.equals("fish")) {
				System.out.println(" O o\n _\\_ o\n>(\'>\\\\/ o\\ .\n //\\___=\n \'\'");
				break;
			} else if (animal.equals("bear")) {
				System.out.println("     (()__(()\n     /       \\ \n    ( /    \\  \\\n     \\ o o    /\n     (_()_)__/ \\             \n    / _,==.____ \\\n   (   |--|      )\n   /\\_.|__|\'-.__/\\_\n  / (        /     \\ \n  \\  \\      (      /\n   )  \'._____)    /    \n(((____.--(((____/");
				break;
			} else {
				System.out.println("Please enter 'dog', 'cat', 'fish', or 'bear'");
				animal = input.nextLine();
			}
		}

	}
}