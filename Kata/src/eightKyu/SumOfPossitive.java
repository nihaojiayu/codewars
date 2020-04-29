package eightKyu;
import java.util.stream.IntStream;
import static java.util.stream.IntStream.of;

import java.util.Arrays;
/**
 * 8 kyu - Sum of positive
 * @author Jiayu Zhang @version 2020-04-28
 * 
 * You get an array of numbers, return the sum of all of the positives ones.
 * Example [1,-4,7,12] => 1 + 7 + 12 = 20
 * Note: if there is nothing to sum, the sum is default to 0.
 *
 */
public class SumOfPossitive {

	public static int sum(int[] arr) {
//		return IntStream.of(arr)
//				.filter(number -> number >= 0)
//				.sum();
		return Arrays.stream(arr).filter(v -> v > 0).sum();
	}
	
	public static void main(String[] args) {
		int[] a = {1,2,3,4,-5};
		System.out.println(sum(a));
	}

}

/*
 * import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;
import java.util.Arrays;

public class SolutionTest {

    @Test
    public void testSomething() {
        assertEquals(15, Positive.sum(new int[]{1,2,3,4,5}));
        assertEquals(13, Positive.sum(new int[]{1,-2,3,4,5}));
        assertEquals(0, Positive.sum(new int[]{}));
        assertEquals(0, Positive.sum(new int[]{-1,-2,-3,-4,-5}));
        assertEquals(9, Positive.sum(new int[]{-1,2,3,4,-5}));
    }
    
  private int random(int min, int max) {
    return min+(int)(Math.random()*(max-min));
  }
  
  private int[] randomArray() {
    int randomSize = random(10, 5000);
    int[] arr = new int[randomSize];
    for(int i=0;i<randomSize;i++) {
      arr[i] = random(-100, 100);
    }
    return arr;
  }
  
  private int sum(int[] arr){
    return Arrays.stream(arr).filter(elt->elt>0).reduce(0,(a,b)->a+b);
  }

  @Test
  public void randomArrayTest(){
    for(int i=0;i<100;i++){
      int[] arr = randomArray();
      assertEquals(sum(arr), Positive.sum(arr));
    }
  }
    
}
*/
