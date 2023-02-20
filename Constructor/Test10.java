package Constructor;

public class Test10 {

	public static void main(String[] args) {
		B b1 = new B();
		b1.i = 10;
		b1.j = 20;
		B b2 = new B();
		b2.i = 30;
		b2.j = 40;
		b1.m2();
		b2.m2();
		
	}

}

class B{
	int i;
	int j;
	void m1() {
		System.out.println(i);
	}
	void m2() {
		m1();
		System.out.println(j);
	}
}
