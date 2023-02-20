package Constructor;

public class Test3 {

	public static void main(String[] args) {
		new C();
		new C(1);
	}

}

class C {
	C(){
		System.out.println("default constructor");
	}
	C(int i){
		System.out.println("parameterised constructor");
	}
}
