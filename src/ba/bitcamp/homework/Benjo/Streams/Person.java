package ba.bitcamp.homework.Benjo.Streams;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Class that creates Person ( with two parameters name and age).
 * Class person implements Seriazable.
 * @author Amra
 *
 */

public class Person implements Serializable {

	private String name;
	private int age;
	
	/**
	 * Constructor for Person
	 * @param name
	 * @param age
	 */
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void writeObject( ObjectOutputStream oos) throws IOException{
		ObjectOutputStream newOos = new ObjectOutputStream(oos);
		newOos.writeObject(this);
		newOos.flush();
	}
	
	public void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException{
		ObjectInputStream newOis = new ObjectInputStream(ois);
		Person person =  (Person)newOis.readObject();
		this.name = person.name;
		this.age = person.age;
		
	}

	/**
	 * Converts all parameters of class to String.
	 */
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
}
