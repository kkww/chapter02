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
		
		//상속 관계에서 생성자 호출 테스트
		System.out.println("Student extneds Person-----------");
		Person p2 = new Student();
		
		//다운 캐스팅 : 명시적 캐스팅
		Student s1 = (Student)p2;
		//s1.test();
		((Student)p2).test();
		
		//업 캐스팅 : 암시적 캐스팅
		Student s2 = new Student();
		Person p3 = s2; //(Person)s; 라고 명시해주지 않아도 됨
	}

}
