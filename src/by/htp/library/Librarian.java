package by.htp.library;

import java.util.Arrays;

public class Librarian {
	
	private String name;
	
	public Librarian() {
	}

	public Librarian(String name) {
		this.name = name;
	}

	public Book createBook(String title, String auther, int yearOfPublishing, int numberOfPages) {
		Book book = new Book(title, auther, yearOfPublishing, numberOfPages);
		return book;
	}

	public void enrollBook(Book book, Library library) {
		library.addBook(book);
	}

	public static void printBooks(Library library) {
		Book[] list = library.getBooks();
		for (int i = 0; i < list.length; i++) {
			if (list[i] != null) {
				System.out.println(list[i]);
			}
		}
	}

	public void deleteBook(String title, Library library) {
		Book[] list = library.getBooks();
		for (int i = 0; i < list.length; i++) {
			if (title.equals(list[i].getTitle())) {
				list[i] = null;
			}
		}
	}

	/*
	 * public static void sortBooks(Library library) {
	 * System.out.println("Сортировка книг по году издания:"); Book[] list =
	 * library.getBooks(); Arrays.sort(list); }
	 */

	public static void sortBooks(Library library) {
		System.out.println("Сортировка книг по году издания:");
		Book[] list = library.getBooks();
		for (int i = list.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				/*
				 * Сравниваем элементы попарно, если они имеют неправильный
				 * порядок, то меняем местами
				 */
				if (list[j].getYearOfPublishing() > list[j + 1].getYearOfPublishing()) {
					Book tmp = list[j];
					list[j] = list[j + 1];
					list[j + 1] = tmp;
				}
			}
		}
	}
}
