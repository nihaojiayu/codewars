package sixKyu;
import static java.util.stream.Collectors.joining;
import static java.util.stream.IntStream.iterate;
/**
 * 6 kyu - Give me a Diamond
 * @author Jiayu Zhang @version 2020-05-13
 * 
 * Jamie is a programmer, and James' girlfriend. She likes diamonds, and wants a diamond string from James. 
 * Since James doesn't know how to make this happen, he needs your help.
 * 
 * Task
 * You need to return a string that looks like a diamond shape when printed on the screen, using asterisk (*) characters. 
 * Trailing spaces should be removed, and every line must be terminated with a newline character (\n).
 * Return null/nil/None/... if the input is an even number or negative, as it is not possible to print a diamond of even or negative size.
 * 
 * Examples
 * A size 3 diamond:
 *  *
 * ***
 *  *
 *  ...which would appear as a string of " *\n***\n *\n"
 *  
 *  A size 5 diamond:
  *
 ***
*****
 ***
  *
 *...that is: " *\n ***\n*****\n ***\n *\n"
 */
public class GiveMeADiamond {

	public static String print(int n) {
		//if n is even or negative, return null
		if((n % 2 == 0) || (n < 1))
			return null;
		
		StringBuilder diamond = new StringBuilder();
		for(int i = 1; i <= n; i += 2) {
			appendLine(diamond, i, n);
		}
		
		for(int i = n-2; i > 0; i -= 2) {
			appendLine(diamond, i, n);
		}
			return diamond.toString();
	}
	
	public static void appendLine(StringBuilder diamond, int size, int totalSize) {
		int spaces = (totalSize - size) / 2;  //if n=5, spaces are 2 or 1
		for(int j = 0; j < spaces; j++) {
			diamond.append(" ");
		}
		
		for(int j = 0; j < size; j++) {
			diamond.append("*");
		}
		diamond.append("\n");
	}
	
	public static String betterPrint(int n) {
		if (n < 1 || n % 2 == 0) return null;
	    return iterate(1, i -> i < 2 * n, i -> i + 2)
	        .map(i -> i > n ? 2 * n - i : i)
	        .mapToObj(i -> " ".repeat((n - i) / 2) + "*".repeat(i) + "\n")
	        .collect(joining());
	}
	
	public static void main(String[] args) {
		
		System.out.println(print(3));
		System.out.println(print(5));
		System.out.println(betterPrint(3));
		
	}

}

/*
 * 
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class DiamondTest {
    @Test
    public void testNull() {
      assertNull(Diamond.print(0));
    }
    
    @Test
    public void testNegativeInput() {
      assertNull(Diamond.print(-7));
    }
    
    @Test
    public void testEvenInput() {
      assertNull(Diamond.print(6));
    }
    
    @Test
    public void testDiamond3() {
      StringBuffer expected = new StringBuffer();
      expected.append(" *\n");
      expected.append("***\n");
      expected.append(" *\n");
      
      assertEquals(expected.toString(), Diamond.print(3));
    }
    
    @Test
    public void testDiamond5() {
      StringBuffer expected = new StringBuffer();
      expected.append("  *\n");
      expected.append(" ***\n");
      expected.append("*****\n");
      expected.append(" ***\n");
      expected.append("  *\n");
      
      assertEquals(expected.toString(), Diamond.print(5));
    }
    
    @Test
    public void testDiamond15() {
      StringBuffer expected = new StringBuffer();
      expected.append("       *\n");
      expected.append("      ***\n");
      expected.append("     *****\n");
      expected.append("    *******\n");
      expected.append("   *********\n");
      expected.append("  ***********\n");
      expected.append(" *************\n");
      expected.append("***************\n");
      expected.append(" *************\n");
      expected.append("  ***********\n");
      expected.append("   *********\n");
      expected.append("    *******\n");
      expected.append("     *****\n");
      expected.append("      ***\n");
      expected.append("       *\n");
      
      assertEquals(expected.toString(), Diamond.print(15));
    }
    
}
*/