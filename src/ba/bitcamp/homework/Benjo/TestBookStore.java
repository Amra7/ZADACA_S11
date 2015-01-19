package ba.bitcamp.homework.Benjo;

public class TestBookStore {

	public static void main(String[] args) {

		BookStore bs = new BookStore("Nema knjiga kod nas");
		Book b1 = new Book("The Great Gatsby",
				  new Autor("F. Scott"," Fitzgerald", "konatkt"), 
				  1925,
			      new Publisher("Best publisher", "kontakt"));
		
		Book b2 = new Book("Invisible man",
				  new Autor("Ralph"," Elison", "konatkt"), 
				  1947,
			      new Publisher("Best publisher ", "kontakt"));
		
		Book b3 = new Book("Jane Eyre",
				  new Autor("Charoltte "," Bronte", "konatkt"), 
				  1925,
			      new Publisher("Best publisher England", "kontakt"));
		
		Book b4 = new Book("Pride and Prejudice",
				  new Autor("Jane "," Austen", "konatkt"), 
				  1913,
			      new Publisher("Best publisher England", "kontakt"));
		

		bs.addBook(b1);
		bs.addBook(b2);
		bs.addBook(b3);
		bs.addBook(b4);
		
//		System.out.println(bs.toString());
		
		bs.sellBook(b4);
		
//		bs.sortByAutor();
		
		System.out.println(bs.toString());
		
		
	}
}
