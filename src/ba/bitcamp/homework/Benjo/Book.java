package ba.bitcamp.homework.Benjo;

import java.util.Comparator;

public class Book {

	private String name;
	private Autor autor;
	private int year;
	private Publisher publisher;

	private Book prevEdition;
	private Book nextEdition;

	/**
	 * @param name
	 * @param autor
	 * @param year
	 * @param publisher
	 */
	public Book(String name, Autor autor, int year, Publisher publisher) {
		super();
		this.name = name;
		this.autor = autor;
		this.year = year;
		this.publisher = publisher;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * @return the autor
	 */
	public Autor getAutor() {
		return autor;
	}

	/**
	 * @return the publisher
	 */
	public Publisher getPublisher() {
		return publisher;
	}

	

	/**
	 * Converts all parameters of class to String.
	 * 
	 * @return String of all paremeters from class.
	 */
	@Override
	public String toString() {
		return "\nBook \nname=" + name + ", \nautor=" + autor + ", \nyear="
				+ year + ", \npublisher=" + publisher + ", \nprevEdition="
				+ prevEdition + ", \nnextEdition=" + nextEdition + "\n";
	}

	
	public class AutorSort implements Comparator<Book> {

		@Override
		public int compare(Book book1, Book book2) {
			if (book1.getAutor().getName()
					.compareTo(book2.getAutor().getName()) > 0) {
				return 1;
			} else if (book1.getAutor().getName()
					.compareTo(book2.getAutor().getName()) < 0) {
				return -1;
			} else {
				return 0;
			}

		}
	}

}
