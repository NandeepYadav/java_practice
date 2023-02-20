package Constructor;

class Book {
	String title, author;
	double price;
	Book(String t, String a, double p) {
		title = t;
		author = a;
		price = p;
	}	
	Book(Book obj){
		title = obj.title;
		author = obj.author;
		price = obj.price;
	}
	void display() {
		System.out.println("[Book : "+ title + ", "+author+", "+"price"+" ]");
	}
}

public class Test6 {

	public static void main(String[] args) {
		Book b1 = new Book("java","james",340);
		Book b2 = new Book(b1);
	}

}
