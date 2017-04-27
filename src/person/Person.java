package person;

public class Person {
	
	Person() {
		System.out.println("Person()");
	}
	
	Person(String s) {
		System.out.println(s);
	}
	
	private String name;
	protected int age;
	int height;
	public int weight;
}
