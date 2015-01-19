package ba.bitcamp.homework.Benjo;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

public class BookStore {

	private String nameBookstore;
	private LinkedList<Employee> listEmployee;
	private LinkedList<User> listUser;
	private LinkedList<Book> listBook;

	/**
	 * @param listEmployee
	 * @param listUser
	 * @param listBook
	 */
	public BookStore(String nameBookstore) {
		this.nameBookstore = nameBookstore;
		this.listEmployee = new LinkedList<Employee>();
		this.listUser = new LinkedList<User>();
		this.listBook = new LinkedList<Book>();
	}

	public void addBook(Book book) {
		this.listBook.add(book);

	}

	public void addUser(User user) {
		this.listUser.add(user);
	}

	public void addEmployee(Employee e) {
		this.listEmployee.add(e);
	}
	
	
	public void sortByName(){
		this.listBook.sort(new NameSort());
	}
	
	public void sortByAutor(){
		this.listBook.sort(new AutorSort());
	}
	
	public void sortByYear(){
		this.listBook.sort(new YearSort());
	}
	
	public void sortByPublisher(){
		this.listBook.sort(new PublisherSort());
	}
	

	public void sellBook(Book book){		
		int i = listBook.indexOf(book);
		listBook.remove(i);
		
	}

	/**
	 * Converts all elements to String.
	 */
	@Override
	public String toString() {
		return "BookStore name:  \n" + nameBookstore + ", \n\nlistEmployee="
				+ listEmployee + ", \n\nlistUser=" + listUser + ", \n\nlistBook="
				+ listBook + "";
	}

	public void searchAutor(String name) {

		int index = 0;
		int size = listBook.size();
		while (index < size) {
			String nameFromList = listBook.get(index).getAutor().getName();
			if (name.equals(nameFromList)) {
				System.out.println(listBook.get(index).toString());
				

			}
		}
	}
	
	public class NameSort implements Comparator<Book> {

		@Override
		public int compare(Book book1, Book book2) {
			if ( (book1.getName())
					.compareTo(book2.getName()) > 0) {
				return 1;
			} else if ( (book1.getName())
					.compareTo(book2.getAutor().getName()) < 0) {
				return -1;
			} else {
				return 0;
			}

		}
	}
	
	/**
	 * Compare Books by Autor and sort.
	 * @author Amra
	 *
	 */
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
	
	/**
	 * Compare books by Year and sort.
	 * @author Amra
	 *
	 */
	public class YearSort implements Comparator<Book> {

		@Override
		public int compare(Book book1, Book book2) {
			if (book1.getYear() > book2.getYear()) {
				return 1;
			} else if (book1.getYear() < book2.getYear()) {
				return -1;
			} else {
				return 0;
			}

		}
	}
	
	/**
	 * Inner class PublisherSort implements Comparator <Book>.
	 * Compare name of the Publishers.
	 * @author Amra
	 *
	 */
	public class PublisherSort implements Comparator<Book> {

		@Override
		public int compare(Book book1, Book book2) {
			if ( (book1.getPublisher().getName()).compareTo(book2.getPublisher().getName()) > 0  ) {
				return 1;
			} else if ((book1.getPublisher().getName()).compareTo(book2.getPublisher().getName()) < 0) {
				return -1;
			} else {
				return 0;
			}

		}
	}

}
