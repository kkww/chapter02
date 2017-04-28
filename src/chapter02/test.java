package chapter02;

import java.util.Date;
import java.util.Scanner;

class Myclass {
	String str;
	public Myclass(String s) {
		str = s;
	}
}

public class test {
	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		Scanner s = new Scanner(System.in);
		
		Myclass t = new Myclass("TEST");
		System.out.println(t);
		
		String s1 = new String("hello");
		System.out.println(s1);
		
		String s2 = new String("hello");
		System.out.println(s2);
		
		//s1=s2;
		System.out.println(s1==s2); //주소값비교
		
		System.out.println(s1.equals(s2)); //내용비교
		
		
	}
}