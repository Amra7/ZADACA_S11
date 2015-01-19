package ba.bitcamp.homework.Benjo;

public class Employee extends User {

	public Employee(String name, String surname, String contact, String pasword) {
		super( name,surname, contact,pasword);
	}
	
	public boolean hasPrivilege (){
		return true;
	}
}
