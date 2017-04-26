package person;

public class PersonTest {

	public static void main(String[] args) {
		Person p = new Person();
		
		//private은 외부에서 접근 불가
		//p.name = "둘리";
		
		//protected는 자식 or 같은 package에서 접근 가능
		p.age = 10;
		
		//default는 같은 package에서만 접근 가능
		p.height = 140;
		
		//public은 모든 곳에서 접근 가능
		p.weight = 30;
	}

}
