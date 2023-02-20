package Constructor;

public class Test1 {

	public static void main(String[] args) {
		Z c1 = new Z(10);
		D d1 = new D();
		d1.m1(c1);
		d1.m1(new Z(20));
		
	}

}

class Z {
	int i;
	Z(int i){
		this.i=i;
	}
}

class D {
	void m1(Z arg) {
		System.out.println("m1() of class B starts");
		System.out.println(arg.i);
		System.out.println("m1() of class B ends");
	}
}
