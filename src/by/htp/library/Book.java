package by.htp.library;

public class Book {

	/*
	 * implements Comparable<Book> {
	 */
	private String title;
	private String auther;
	private int yearOfPublishing;
	private int numberOfPages;

	public String getTitle() {
		return title;
	}

	public String getAuther() {
		return auther;
	}

	public int getYearOfPublishing() {
		return yearOfPublishing;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public Book(String title, String auther, int yearOfPublishing, int numberOfPages) {
		this.title = title;
		this.auther = auther;
		this.yearOfPublishing = yearOfPublishing;
		this.numberOfPages = numberOfPages;
	}

	public String toString() {
		return " Название: " + title + " Автор: " + auther + " Год выпуска: " + yearOfPublishing
				+ " Количество страниц: " + numberOfPages;
	}

	/*
	 * @Override public int compareTo(Book anotherBooks) { return
	 * getYearOfPublishing().compareTo(anotherBooks.getYearOfPublishing()); }
	 */
}
