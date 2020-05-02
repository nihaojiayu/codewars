package sevenKyu;

/**
 * 7 kyu - You're a square!
 * @author Jiayu Zhang @version 2020-05-01
 * 
 * A square of squares
 * You like building blocks. You especially like building blocks that are squares. 
 * And what you even like more, is to arrange them into a square of square building blocks!
 * However, sometimes, you can't arrange them into a square. 
 * Instead, you end up with an ordinary rectangle! Those blasted things! 
 * If you just had a way to know, whether you're currently working in vain… Wait! 
 * That's it! You just have to check if your number of building blocks is a perfect square.
 * 
 * Task
 * Given an integral number, determine if it's a square number:
 * In mathematics, a square number or perfect square is an integer that is the square 
 * of an integer; in other words, it is the product of some integer with itself.
 * The tests will always use some integral number, so don't worry about that in dynamic typed languages.
 *  
 * Examples
 *  isSquare(-1) returns  false
 *  isSquare(0) returns   true
 *  isSquare(3) returns   false
 *  isSquare(4) returns   true
 *  isSquare(25) returns  true  
 *  isSquare(26) returns  false
 *
 */
public class YouAreSquare {

	public static boolean isSquare(int n) {
		double sr = Math.sqrt(n);
		  System.out.println(sr);
		return (sr - Math.floor(sr) == 0);
		//return Math.sqrt(n) % 1 == 0;
	}
	public static void main(String[] args) {
		  System.out.println(isSquare(25));

	}
}

/*
 * import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.Random;

public class SquareTest {
    @Test
    public void shouldWorkForSomeExamples() throws Exception {
      assertEquals("negative numbers aren't square numbers", false, Square.isSquare(-1));
      assertEquals("0 is a square number (0 * 0)",    true,   Square.isSquare(0));
      assertEquals("3 isn't a square number", false,  Square.isSquare(3));
      assertEquals("4 is a square number (2 * 2)",    true,   Square.isSquare(4));
      assertEquals("25 is a square number (5 * 5)",   true,   Square.isSquare(25));
      assertEquals("26 isn't a square number",false,  Square.isSquare(26));      
    }
    @Test
    public void shouldWorkForRandomSquareNumbers() throws Exception {
      Random rand = new Random();
      for(int i = 0; i < 100; ++i){
        int randomNum = rand.nextInt(0x0fff);
        int randomSq = randomNum * randomNum;
        assertEquals(String.format("%d is a square number (%d * %d)", randomSq, randomSq, randomSq), true, Square.isSquare(randomSq));
      }
    }
    @Test
    public void shouldWorkForRandomNumbers() throws Exception {
      Random rand = new Random();
      for(int i = 0; i < 100; ++i){
        int randomNum = rand.nextInt(0x0fffffff);        
        assertEquals(String.format("Didn't work on %d", randomNum), isSquare(randomNum), Square.isSquare(randomNum));
      }
    }
    private static boolean isSquare(int n) {        
      return n >= 0 && Math.pow(Math.round(Math.sqrt(n)),2) == n;
    }
} 
*/
