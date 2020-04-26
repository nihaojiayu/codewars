package sevenKyu;

/**
 * 7 kyu - Sum of odd numbers
 * @author Jiayu Zhang @version 2020-04-26
 * 
 * Given the triangle of consecutive odd numbers:
 *
 *            1
 *         3     5
 *       7     9    11
 *   13    15    17    19
 * 21    23    25    27    29
 * ...
 * Calculate the row sums of this triangle from the row index (starting at index 1) e.g.:
 * 
 * rowSumOddNumbers(1); // 1
 * rowSumOddNumbers(2); // 3 + 5 = 8
 *
 * create pyramid -> https://www.programiz.com/java-programming/examples/pyramid-pattern
 */
public class RowSumOddNumbers {

	/**
	 * @param n the number of row 
	 * @return
	 */
	public static int rowSumOddNumbers(int n) {
		return n * n * n;
	}
}

/*
 * 
import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Random;

public class RowSumOddNumbersTest {

    @Test
    public void test1() {
        assertEquals(1, RowSumOddNumbers.rowSumOddNumbers(1));
        assertEquals(74088, RowSumOddNumbers.rowSumOddNumbers(42));
    }
    
    @Test
    public void test2() {
      Random rnd = new Random();
      for(int i=0;i<50;i++){
        int n = rnd.nextInt(500)+1; //random number between 0 and 499+1
        assertEquals((int) Math.pow(n,3), RowSumOddNumbers.rowSumOddNumbers(n));
      }
    }
}
*/
