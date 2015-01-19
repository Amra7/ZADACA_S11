package ba.bitcamp.homework.Benjo;

import java.util.LinkedList;

public class Buyer extends User {
	
	private LinkedList bougthBooks;

	public Buyer(String name, String surname, String contact, String pasword) {
		super( name,surname, contact,pasword);
		this.bougthBooks = new LinkedList();
	}
	
	public boolean hasPrivilege (){
		return false;
	}
	
	
}
