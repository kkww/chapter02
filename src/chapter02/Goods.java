package chapter02;

public class Goods {
	static int countOfGoods; //class 변수는 자동으로 초기화(0)가 된다.
	
	public Goods() {
		countOfGoods++;
		////
	}
	
	//인스턴스 변수는 자동으로 초기화된다.
	String name;
	int price;
	int countStock;
	int countSold;
}
