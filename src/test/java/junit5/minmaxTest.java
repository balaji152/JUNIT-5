package junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class minmaxTest {

	@Test
	void minmax1() {
		minmax obj=new minmax();
		int[]array= {12,13,14,15};
		int[] expected= {12,15};
		int[]actual= obj.findMinMax(array);
		
		assertArrayEquals(expected,actual);
		
	}
	@Test
	void minmax2() {
		minmax obj=new minmax();
		int[]array= {18,19,22,15};
		int[] expected= {15,22};
		int[]actual= obj.findMinMax(array);
		
		assertArrayEquals(expected,actual);
		
	}
	@Test
	void minmax3() {
		minmax obj=new minmax();
		int[]array= {121,113,114,115};
		int[] expected= {113,121};
		int[]actual= obj.findMinMax(array);
		
		assertArrayEquals(expected,actual);
		
	}

}
