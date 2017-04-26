package chapter02;

public class GoodsApp {

	public static void main(String[] args) {
		int z = 0;
		System.out.println(z); //지역변수는 반드시 초기화
		
		Goods goods = new Goods();
		goods.name = "nikkon";
		goods.price = 200000;
		goods.countSold = 10;
		goods.countStock = 20;

		System.out.println(
				"이름:" + goods.name +
				",가격:" + goods.price +
				",재고:" + goods.countStock +
				",판매:" + goods.countSold);
		
		Goods goods1 = new Goods();
		Goods goods2 = new Goods();
		Goods goods3 = new Goods();
		
		double PI = 3 * Math.PI; //상수
		int a = 10; //변수
		final int B = 20; //상수(값  대입은 여기서 끝)
		//B = 30; //상수이기 때문에 error
		
		System.out.println(Goods.countOfGoods);
	}

}
