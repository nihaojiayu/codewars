package sixKyu;

import java.util.Arrays;
import static java.util.stream.IntStream.of;
/**
 * 6 kyu - Are they the "same"?
 * @author Jiayu Zhang @version 2020-05-13
 * 
 * Given two arrays a and b write a function comp(a, b) (compSame(a, b) in Clojure) that checks whether the two arrays have the "same" elements, 
 * with the same multiplicities. "Same" means, here, that the elements in b are the elements in a squared, regardless of the order.
 * 
 * Examples
 * Valid arrays
a = [121, 144, 19, 161, 19, 144, 19, 11]  
b = [121, 14641, 20736, 361, 25921, 361, 20736, 361]
comp(a, b) returns true because in b 121 is the square of 11, 14641 is the square of 121, 
20736 the square of 144, 361 the square of 19, 25921 the square of 161, and so on. 
It gets obvious if we write b's elements in terms of squares:

a = [121, 144, 19, 161, 19, 144, 19, 11] 
b = [11*11, 121*121, 144*144, 19*19, 161*161, 19*19, 144*144, 19*19]

 * Invalid arrays
If we change the first number to something else, comp may not return true anymore:

a = [121, 144, 19, 161, 19, 144, 19, 11]  
b = [132, 14641, 20736, 361, 25921, 361, 20736, 361]
comp(a,b) returns false because in b 132 is not the square of any number of a.

a = [121, 144, 19, 161, 19, 144, 19, 11]  
b = [121, 14641, 20736, 36100, 25921, 361, 20736, 361]
comp(a,b) returns false because in b 36100 is not the square of any number of a.

 * Remarks
 * a or b might be [] (all languages except R, Shell).
 * a or b might be nil or null or None or nothing (except in Haskell, Elixir, C++, Rust, R, Shell, PureScript).
 * If a or b are nil (or null or None), the problem doesn't make sense so return false.
 * 
 */
public class AreTheyTheSame {
	
	public static boolean comp(int[] a, int[] b) {
		if(a == null || b == null) return false;
		else {
			for(int i = 0; i < a.length; i++) {
				a[i] = (int) Math.pow((a[i]), 2.0);
				//System.out.println(Arrays.toString(a));
		    }
            Arrays.sort(a);
               System.out.println("int[] a: " + Arrays.toString(a));
            Arrays.sort(b);
               System.out.println("int[] b: " + Arrays.toString(b));
            return Arrays.equals(a, b);
		}
	}
	
	 static boolean comp1(int[] a, int[] b) {
		 return b != null &&
			       Arrays.equals(of(a).map(n -> n*n).sorted().toArray(),
			                     of(b).sorted().toArray()
			                     );
     }
	
	public static void main(String[] args) {
		
		int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
		int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
		//System.out.println(Arrays.toString(a));
		System.out.println(comp(a,b)); // should be true
		
		
		int[] c = new int[] {121, 144, 19, 161, 19, 144, 19, 11};
		int[] d = new int[] {132, 14641, 20736, 36100, 25921, 361, 20736, 361};
		System.out.println(comp(c,d)); // should be false, 132 is not the square of any number of a.
	}

}

/*
 * import static org.junit.Assert.*;
import org.junit.Test;


public class AreSameTest {

  @Test
  public void test1() {
    int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
    int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
    assertEquals(true, AreSame.comp(a, b)); 
  }
  @Test
  public void test2() {
    int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
    int[] b = new int[]{11 * 11, 121 * 121, 144 * 144, 190 * 190, 161 * 161, 19 * 19, 144 * 144, 19 * 19};
    assertEquals(false, AreSame.comp(a, b)); 
  }
  @Test
  public void test3() {
    int[] a = new int[]{};
    int[] b = new int[]{1};
    assertEquals(false, AreSame.comp(a, b)); 
  }
  @Test
  public void test4() {
    int[] a = new int[]{};
    int[] b = new int[]{};
    assertEquals(true, AreSame.comp(a, b)); 
  }
  @Test
  public void test5() {
    int[] a = new int[]{};
    int[] b = null;
    assertEquals(false, AreSame.comp(a, b)); 
  }
  @Test
  public void test6() {
    int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11, 1008};
    int[] b = {11 * 11, 121 * 121, 144 * 144, 190 * 190, 161 * 161, 19 * 19, 144 * 144, 19 * 19};
    assertEquals(false, AreSame.comp(a, b)); 
  }
  @Test
  public void test7() {
    int[] a = new int[]{121, 1440, 191, 161, 19, 144, 195, 11};
    int[] b = {11 * 11, 121 * 121, 1440 * 1440, 191 * 191, 161 * 161, 19 * 19, 144 * 144, 195 * 195};
    assertEquals(true, AreSame.comp(a, b)); 
  }
  @Test
  public void test8() {
    int[] a = new int[]{0, -14, 191, 161, 19, 144, 195, 1};
    int[] b = {1, 0, 14 * 14, 191 * 191, 161 * 161, 19 * 19, 144 * 144, 195 * 195};
    assertEquals(true, AreSame.comp(a, b)); 
  }
  @Test
  public void test9() {
    int[] a = new int[]{0, -14, 191, 161, 19, 144, 195, 1, 2};
    int[] b = {1, 0, 14 * 14, 191 * 191, 161 * 161, 19 * 19, 144 * 144, 195 * 195, 3};
    assertEquals(false, AreSame.comp(a, b)); 
  }
  @Test
  public void test10() {
    int[] a = new int[]{2, 2, 3};
    int[] b = {4, 9, 9};
    assertEquals(false, AreSame.comp(a, b)); 
  }
  @Test
  public void test1a() {
    int[] a = new int[]{2, 2, 3};
    int[] b = {4, 4, 9};
    assertEquals(true, AreSame.comp(a, b)); 
  }
  @Test
  public void test2a() {
    int[] a = new int[]{4, 4};
    int[] b = {1, 31};
    assertEquals(false, AreSame.comp(a, b)); 
  }
  @Test
  public void test3a() {
    int[] a = new int[]{3, 4};
    int[] b = {0, 25};
    assertEquals(false, AreSame.comp(a, b)); 
  }
}
*/
