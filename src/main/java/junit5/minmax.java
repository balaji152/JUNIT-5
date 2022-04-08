package junit5;
import java.util.Arrays;
public class minmax {
	public static int[] findMinMax(int[] arr) {
		int[] as = new int[2];
		as[0] = (Arrays.stream(arr).min().getAsInt());
		as[1] = (Arrays.stream(arr).max().getAsInt());
		return as;
		
		
		
	}

}
