import java.util.Scanner;

public class String {

	public static void main(java.lang.String[] args) {

		java.lang.String korisnikovUnos;

		Scanner unos = new Scanner(System.in);

		int brojacVelikihSlova = 0, brojacMalihSlova = 0;

		System.out.print("Unesite string: ");
		korisnikovUnos = unos.nextLine();

		// Ispisivanje duzine stringa
		System.out.println("\nDuzina stringa: " + korisnikovUnos.length());

		// Ispisivanje karaktera sa parnim pozicijama
		System.out.println("Karakteri sa parnih pozicija: ");

		for (int i = 0; i < korisnikovUnos.length(); i++) {
			if (i % 2 == 0 && korisnikovUnos.charAt(i)!=' ') {
				System.out.print(korisnikovUnos.charAt(i) + " ");
			}
		}

		// Ispisivanje karaktera sa neparnim pozicijama
		System.out.println("\nKarakteri sa neparnih pozicija: ");

		for (int i = 0; i < korisnikovUnos.length(); i++) {
			if (i % 2 != 0 && korisnikovUnos.charAt(i)!=' ') {
				System.out.print(korisnikovUnos.charAt(i) + " ");
			}
		}

		// ispis uppercase karaktera
		System.out.println("\nBroj uppercase karaktera: ");
		for (int i = 0; i < korisnikovUnos.length(); i++) {
			if (Character.isUpperCase(korisnikovUnos.charAt(i))) {
				brojacVelikihSlova++;
			}
		}
		System.out.println(brojacVelikihSlova);

		// ispis lowercase karaktera
		System.out.println("Broj lowercase karaktera: ");
		for (int i = 0; i < korisnikovUnos.length(); i++) {
			if (Character.isLowerCase(korisnikovUnos.charAt(i))) {
				brojacMalihSlova++;
			}
		}
		System.out.println(brojacMalihSlova);

		// ispis karaktera koji nisu slova
		System.out.println("Karakteri koji nisu slova: ");
		for (int i = 0; i < korisnikovUnos.length(); i++) {
			if (!Character.isLetter(korisnikovUnos.charAt(i)) && korisnikovUnos.charAt(i)!=' ') {
				System.out.print(korisnikovUnos.charAt(i) + " ");
			}
		}

		unos.close();

	}

}
