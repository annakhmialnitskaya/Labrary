package by.htp.library;

public class Library {

	private Book[] books = new Book[0];
	int lastIndex;

	public Book[] getBooks() {
		return books;
	}
	
	public void setBooks(Book[] books) {
		this.books = books;
	}


	public void addBook(Book book) {
		Book[] list = this.getBooks();
		Book[] newArray = new Book[list.length + 1];
		// array - �������� ������
		// 0 - ��������� ������� ��������� �������
		// newArray - ����� ������
		// 0 - ��������� ������� ������ �������
		// array.length - ���������� ��������� ������� ����� ����������� � �����
		// ������
		System.arraycopy(list, 0, newArray, 0, list.length);
		newArray[list.length] = book;
		this.setBooks(newArray);
	}
}
