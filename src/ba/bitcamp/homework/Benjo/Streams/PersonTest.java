package ba.bitcamp.homework.Benjo.Streams;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Reader;

public class PersonTest {

	public static void main(String[] args) throws IOException {
		
		Person person = null;
		ObjectInputStream ois = new ObjectInputStream(System.in);
//		BufferedInputStream bufferI = new BufferedInputStream(ois);
		ObjectOutputStream oos = new ObjectOutputStream();
		
		try {
			person.readObject(ois);
			person.writeObject(oos);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
