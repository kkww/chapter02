package person;

public class Student extends Person {
	Student() {
		//자식이 기본 생성자이든 매개변수를 가진 생성자이든
		//자식 생성자에서 부모 클래스의 다른 생성자(매개변수 생성자)를 호출하지 않으면, 자동으로 부모의 기본 생성자가 호출 됨
		//super();
		super("Person(string) constructor"); //명시하면 부모의 기본 생성자는 호출되지 않는다.
		System.out.println("sutdent()");
	}
	
	void test() {
		//protected는 자식 or 같은 package에서 접근 가능
		age = 10;
		
		//default는 같은 package에서만 접근 가능
		height = 140;
		
		//public은 모든 곳에서 접근 가능
		weight = 30;
	}
}
