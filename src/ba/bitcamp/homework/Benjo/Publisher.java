package ba.bitcamp.homework.Benjo;

import java.util.Comparator;
import java.util.LinkedList;


public class Publisher {

	 private String name;
	 private String contact;
	 
	 private LinkedList<Book> booksPublisher;

	/**
	 * Constructor for Publisher.
	 * @param name - name of Publisher.
	 * @param contact - contact of Publisher.
	 * @param booksPublisher  - list of books this Publisher had publish.
	 */
	public Publisher(String name, String contact) {
		super();
		this.name = name;
		this.contact = contact;
		this.booksPublisher = new LinkedList<Book>();
	}
	
	

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	public void addBook(Book book){
		this.booksPublisher.add(book);
		this.booksPublisher.sort(new YearSort());
	}
	
	/**
	 * Converts all parameters to String.
	 */
	@Override
	public String toString() {
		return " " + name + ", contact=" + contact
				+ ", booksPublisher=" + booksPublisher + "\n";
	}
	
	
	/**
	 * Inner class YearSort imlements Comparator.
	 * Sorts books by year of publishing using method compare form interface Comparator.
	 * 
	 * @author Amra
	 *
	 */
	public class YearSort implements Comparator<Book> {

		@Override
		public int compare(Book book1,Book book2) {
			if ( book1.getYear() < book2.getYear()){
				return 1;
			} else if ( book1.getYear() > book2.getYear()) {
				return -1;
			} else {
				return 0;
			}
		}
		
	}
	 
	 
}
