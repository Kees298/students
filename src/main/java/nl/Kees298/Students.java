package nl.Kees298;

import java.util.Scanner;
import java.util.HashMap;

class Students {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		HashMap<String, Integer> person = new HashMap<>();
		while (true) {

			// textblock at start of program.
			System.out.println();
			System.out.println("Dit is een programma die de naam  en leeftijd van studenten opslaat.");
			System.out.println("Type '1' om een nieuwe student toe te voegen.");
			System.out.println("Type '2' om een student te verwijderen.");
			System.out.println("Type '3' om de lijst met studenten te tonen.");
			System.out.print("Wat wil je doen? ");
			int choice = input.nextInt();

			switch (choice) {
				case 1:
					//declare local variables
					String nameStudent;
					int ageStudent;

					//assign name
					System.out.print("Hoe heet de student die je wilt toevoegen? ");
					nameStudent = input.next();

					System.out.println("Naam: " + nameStudent);

					// assign age

					System.out.print("Hoe oud is de student? ");
					ageStudent = input.nextInt();
					System.out.println("Leeftijd: " + ageStudent);
					person.put(nameStudent, ageStudent);

					break;

				case 2:
					//declare local variable
					String removeStudent = "";

					//ask for name
					System.out.print("Hoe heet de student die je wilt verwijderen? ");

					// assign variable nameStudent to input, even if the name is not in the dict.
					removeStudent = input.next();

					//if name is found
					if (person.containsKey(removeStudent)) { //to prevent error if there's a typo.
						System.out.println(removeStudent + " is verwijderd uit de lijst.");
						person.remove(removeStudent);

						// if name is not found
					} else {
						System.out.println(removeStudent + " is niet gevonden in het bestand");
					}

					break;

				case 3:
					// heading for the list.
					System.out.println("Namen \t\t\t Leeftijden");

					//loop through dict, print keys + values.
					for (String i : person.keySet()) {
						System.out.println(i + "\t\t\t" + person.get(i));
					}
					break;
			}
		}
	}
}


