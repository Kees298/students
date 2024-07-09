package nl.Kees298;


import java.util.Objects;
import java.util.Scanner;
import java.util.HashMap;

class Students {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		HashMap<String, Integer> person = new HashMap<>();
		String nameStudent = "";
		int ageStudent = 0;
		while (true) {
			System.out.println();
			System.out.println("Dit is een programma die de naam  en leeftijd van studenten opslaat.");
			System.out.println("Type '1' om een nieuwe student toe te voegen.");
			System.out.println("Type '2' om een student te verwijderen.");
			System.out.println("Type '3' om de lijst met studenten te tonen.");
			System.out.print("Wat wil je doen? ");
			int choice = input.nextInt();

			switch (choice) {
				case 1:
					System.out.print("Hoe heet de student die je wilt toevoegen? ");
					while (Objects.equals(nameStudent,
							"")) { //only run this when no name has been assigned yet.
						nameStudent = input.nextLine();
					}
					System.out.println("Naam: " + nameStudent);
					while (ageStudent == 0) { // only run when no age has been assigned yet
						System.out.print("Hoe oud is de student? ");
						ageStudent = input.nextInt();
						System.out.println("Leeftijd: " + ageStudent);
						person.put(nameStudent, ageStudent);
					}
					nameStudent = ""; // reset for further students
					ageStudent = 0; //reset for further students
					break;

				case 2:
					System.out.print("Hoe heet de student die je wilt verwijderen? ");
					while (Objects.equals(nameStudent,
							"")) // assign variable nameStudent to input, even if the name is not in the dict.
					{
						nameStudent = input.nextLine();
					}
					if (person.containsKey(nameStudent)) { //to prevent error if there's a typo.
						System.out.println(nameStudent + " is verwijderd uit de lijst.");
						person.remove(nameStudent);

					} else {
						System.out.println(nameStudent + " is niet gevonden in het bestand");
					}
					nameStudent = ""; // reset for further students

					break;
				case 3:
					System.out.println("Namen \t\t\t Leeftijden"); // heading for the list.
					for (String i : person.keySet()) {
						System.out.println(i + "\t\t\t" + person.get(i));
					}
					break;
			}
		}
	}
}


