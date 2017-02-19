package by.htp.library;

public class Main {

	public static void main(String[] args) {
		Librarian librarian = new Librarian();

		Book book1 = new Book("����� � ���.", "�.�.�������", 1970, 1270);
		Book book2 = new Book("���� �� ���.", "�.�.���������", 1975, 316);
		Book book3 = new Book("451 ������ �� ����������.", "�.��������", 2004, 224);
		Book book4 = new Book("� ������ ����:100 ���������.", "�.��������", 2010, 1168);
		Book book5 = new Book("����� �� �����.", "�.��������", 2002, 640);
		Book book6 = new Book("������ �� �������.", "�.� �.����������", 2015, 300);
		Book book7 = new Book("������������ ������.", "�.����", 2002, 576);
		Library library = new Library();
		
		librarian.enrollBook(book1, library);
		librarian.enrollBook(book2, library);
		librarian.enrollBook(book3, library);
		librarian.enrollBook(book4, library);
		librarian.enrollBook(book5, library);
		librarian.enrollBook(book6, library);
		librarian.enrollBook(book7, library);
			
		Menu.callMenu(library);
	}
	

}
