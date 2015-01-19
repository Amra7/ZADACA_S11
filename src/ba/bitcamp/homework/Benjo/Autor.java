package ba.bitcamp.homework.Benjo;

import java.util.Comparator;
import java.util.LinkedList;

public class Autor {

	private String name;
	private String surname;
	private String contact;
	private LinkedList<Book> books;
	
	
	
	
	/**
	 * @param name
	 * @param surname
	 * @param contact
	 * @param books
	 */
	public Autor(String name, String surname, String contact) {
		super();
		this.name = name;
		this.surname = surname;
		this.contact = contact;
		this.books = new LinkedList<Book>();
	}
	
	public void addBook(Book book){
		this.books.add(book);
		this.books.sort(new YearSort());
	}
	

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return " " + name + surname + ", contact="
				+ contact + "\nbooks=" + books;
	}


	private class YearSort implements Comparator<Book> {

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
