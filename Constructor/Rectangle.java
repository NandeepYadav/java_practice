package Constructor;

// Here each object reference holds their respective values, but for static variable count holds only the latest value passed to it.
// why because each time we store the value into the static object, it rewrites the previous value. 

public class Rectangle {

	public static void main(String[] args) {
		Test2 t1 = new Test2(1,2);
		Test2 t2 = new Test2(3,4);
		System.out.println(t1.length);
		System.out.println(t1.breadth);
		System.out.println(t1.count);
	}

}

class Test2 {
	int length;
	int breadth;
	static int count;
	Test2(int l, int b){
		length=l;
		breadth=b;
		count++;
	}
}
