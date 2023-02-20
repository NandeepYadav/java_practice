package Constructor;

public class Test5 {

	public static void main(String[] args) {
		Bike22 b1 = new Bike22("black");
		System.out.println(b1.color);
		setColor(b1);
		System.out.println(b1.color);
	}
	static void setColor(Bike22 b) {
		b.color = "red";
		System.out.println("set color is executed.");
	}
}

class Bike22 {
	String color;
	Bike22(String c){
		color = c;
	}
}
