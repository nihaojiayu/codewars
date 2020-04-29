package eightKyu;

/**
 * 8 kyu - Array plus array
 * @author Jiayu Zhang @version 2020-02-29
 * 
 * I'm new to coding and now I want to get the sum of two arrays...actually the sum of all their elements. 
 * I'll appreciate for your help.
 * 
 * P.S. Each array includes only integer numbers. Output is a number too.
 *
 */
public class ArrayPlusArray {

	public static int arrayPlusArray(int[] a, int[] b) {
		int sum1 = 0;
		int sum2 = 0;
		for(int e: a) {
			sum1 += e;
		}
		
	    for(int e1: b) {
			sum2 += e1;
		}	
		return sum1 + sum2;
		//return IntStream.of(arr1).sum() + IntStream.of(arr2).sum();
	}
	
	public static void main(String[] args) {
		int[] a = {1,2,3};
		int[] b = {4,5,6};
		System.out.println(arrayPlusArray(a,b));
	}

}

/*
 * import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;
import java.util.stream.*;
import java.util.concurrent.ThreadLocalRandom;

public class SolutionTest {

    @Test
    public void basicTests() {
        assertEquals(21, Sum.arrayPlusArray(new int[]{1,2,3}, new int[]{4,5,6}));
        assertEquals(-21, Sum.arrayPlusArray(new int[]{-1,-2,-3}, new int[]{-4,-5,-6}));
        assertEquals(15, Sum.arrayPlusArray(new int[]{0,0,0}, new int[]{4,5,6}));
        assertEquals(2100, Sum.arrayPlusArray(new int[]{100,200,300}, new int[]{400,500,600}));
    }
    
    
    private int check(int[] arr1, int[] arr2) {
      return IntStream.of(arr1).sum() + IntStream.of(arr2).sum();
    }
    
    private int randomInt(int min, int max) {
      return ThreadLocalRandom.current().nextInt(min, max + 1);
    }
    
    @Test
    public void randomTests() {
      for(int i = 0; i< 20; i++) {
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        for(int j = 0; j < 5; j++) {
          arr1[j] = this.randomInt(-10000, 10000);
          arr2[j] = this.randomInt(-10000, 10000);
        }
        
        assertEquals(this.check(arr1, arr2), Sum.arrayPlusArray(arr1, arr2));
      }
    }
}
*/
