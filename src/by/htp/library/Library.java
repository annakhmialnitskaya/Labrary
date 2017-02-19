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
		// array - исходный массив
		// 0 - начальная позиция исходного массива
		// newArray - новый массив
		// 0 - начальная позиция нового массива
		// array.length - количество элементов которые нужно скопировать в новый
		// массив
		System.arraycopy(list, 0, newArray, 0, list.length);
		newArray[list.length] = book;
		this.setBooks(newArray);
	}
}
