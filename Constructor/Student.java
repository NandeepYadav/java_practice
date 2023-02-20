package Constructor;

class Test {
	String name;
	Test(String n){
		name=n;
	}
}

class Student{
	public static void main(String[] args) {
		Test s1 = new Test("Nandeep");
		System.out.println(s1.name);
		
	}
}
