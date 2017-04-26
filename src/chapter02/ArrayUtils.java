package chapter02;

public class ArrayUtils {
	public static double[] intToDouble(int[] source) {
		if(source == null) {
			return null;
		}
		
		int length = source.length;
		double[] result = new double[length];
		
		for(int i = 0; i < length; i++) {
			result[i] = source[i];
		}
		
		return result;
	}
}
