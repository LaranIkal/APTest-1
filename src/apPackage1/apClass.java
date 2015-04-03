package apPackage1;

import java.util.Scanner;

public class apClass {

	static String one;

	public static void main(String[] args) {

		if (args.length == 0) {

			 leerNombreArchivo();

		}

		else {
			System.out.println("The file name is:  ");
			for (String elemento : args) {
				System.out.print(elemento + " ");
			}
		}

	}

	@SuppressWarnings("resource")
	public static void leerNombreArchivo() {

		System.out.print("Enter file name ");
		Scanner file = new Scanner(System.in);

		System.out.println("10 character minimum length: ");
		one = file.nextLine();

		while (one.length() <= 10) {
			System.out.print("The file name is not big enough ");
			one = file.nextLine();
		}

		System.out.println("The file name is: " + one);

	}

}
