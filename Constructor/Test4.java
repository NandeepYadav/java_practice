package Constructor;

public class Test4 {

	public static void main(String[] args) {
		Bike b1 = new Bike("Honda","black");
		System.out.println(b1.color);
		System.out.println(b1.brand);
	}

}

class Bike {
	String color;
	String brand;
	Bike(String b){
		brand = b;
	}
	Bike(String b, String c){
		new Bike(b);
		color = c;
	}
}
