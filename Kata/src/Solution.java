import java.util.ArrayList;

/**
 * 8 kyu - String repeat
 * 
 * @author Jiayu Zhang
 * @version 2020-04-25
 * 
 * Write a function called repeatString which repeats the given String src exactly count times.
 * 
 * repeatStr(6, "I") // "IIIIII"
 * repeatStr(5, "Hello") // "HelloHelloHelloHelloHello"
 *
 */
public class Solution {
	
	public static String repeatStr(final int repeat, final String string) {
		StringBuilder s = new StringBuilder();
		
		for(int i = 0; i < repeat; i++) {
			s.append(string);
		}
		
		return s.toString();
	}
	
	//String.repeat, Collections.nCopies also work
	public static String BetterSolution(final int repeat, final String string) {
        return repeat <= 0 ? "" : string.repeat(repeat);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(repeatStr(2, "Hello"));
		System.out.println(repeatStr(0, "Hello"));
		System.out.println(repeatStr(-10, "Hello"));
	}
	
	/**
	 * JUnit test
	 import org.junit.Test;
	 import static org.junit.Assert.assertEquals;
     public class SolutionTest {
     @Test public void test4a() {
        assertEquals("aaaa", Solution.repeatStr(4, "a"));
      }
     @Test public void test3Hello() {
       assertEquals("HelloHelloHello", Solution.repeatStr(3, "Hello"));
      }
     @Test public void test5empty() {
       assertEquals("", Solution.repeatStr(5, ""));
      }
     @Test public void test0kata() {
       assertEquals("", Solution.repeatStr(0, "kata"));
      }
     @Test public void testNegativeRepeat() {
       assertEquals("", Solution.repeatStr(-10, "kata"));
      }
     }
	 */

}
