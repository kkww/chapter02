package chapter02;

public class ArrayUtilTest {

	public static void main(String[] args) {
		int[] intArray = {10, 20, 30, 40, 50};
		
		double[] dArray = ArrayUtils.intToDouble(intArray);
		
		for(double value : dArray) {
			System.out.println(value);
		}
	}

}
