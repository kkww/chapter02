package person;

public class Student extends Person {
	void test() {
		//protected는 자식 or 같은 package에서 접근 가능
		age = 10;
		
		//default는 같은 package에서만 접근 가능
		height = 140;
		
		//public은 모든 곳에서 접근 가능
		weight = 30;
	}
}
