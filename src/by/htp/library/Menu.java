package by.htp.library;

import java.util.Scanner;

public class Menu {

	public static void callMenu(Library library) {
		Scanner sc = new Scanner(System.in);
		String s;
		while (true) {
			System.out.println("1 Просмотреть список всех книг");
			System.out.println("2 Вывести книги по году издания");
			System.out.println("q Выход");
			s = sc.next();
			if ("1".equals(s)) {
				Librarian.printBooks(library);
			} else if ("2".equals(s)) {
				Librarian.sortBooks(library);
				Librarian.printBooks(library);
			} else if ("q".equals(s)) {
				System.out.println("quit");
				break;
			} else {
				System.out.println("error: incorrect symbol");
			}
		}
	}
}
