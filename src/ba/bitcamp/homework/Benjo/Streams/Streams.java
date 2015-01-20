package ba.bitcamp.homework.Benjo.Streams;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Streams {
	public static void main(String[] args) {
		
		System.out.println("Unesi podatke: ");
		
		// binary data
		InputStream dis = new DataInputStream(System.in);
		// text data
		Reader isr = new InputStreamReader(System.in);
		
//		byte[] byteBuffer = new byte[8];
//		int numByte = 0;
//		
//		try {
//			while ( (numByte = dis.read(byteBuffer)) >= 0  ){
//				System.out.println("Binary data: " + new String(byteBuffer) );
//		        byteBuffer = new byte[8];
//			}
//			
//			System.out.println("Kraj");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		char [] charByte = new char[8];
		try {
			while ( isr.read(charByte) >= 0){
				System.out.println("Text data: " + new String(charByte));
		        charByte = new char[8];
			}
			
			System.out.println("Kraj");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		BufferedReader buffer = new BufferedReader(isr);
//		
//		try {
//			String line = buffer.readLine();
//			while  (line != null){
//				System.out.println("Napisano: " + line);
//				line = buffer.readLine();
//			}
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
	}
}
