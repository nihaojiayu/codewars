package sevenKyu;

/**
 * 6 kyu - Sum of Digits / Digital Root
 * @author Jiayu Zhang
 * @version 2020-06-04
 * 
 * Digital root is the recursive sum of all the digits in a number.
 * Given n, take the sum of the digits of n. If that value has more than one digit, 
 * continue reducing in this way until a single-digit number is produced. 
 * This is only applicable to the natural numbers.
 * 
 * Examples
 * 16  -->  1 + 6 = 7
 * 942  -->  9 + 4 + 2 = 15  -->  1 + 5 = 6
 * 132189  -->  1 + 3 + 2 + 1 + 8 + 9 = 24  -->  2 + 4 = 6
 * 493193  -->  4 + 9 + 3 + 1 + 9 + 3 = 29  -->  2 + 9 = 11  -->  1 + 1 = 2
 *
 */
public class SumOfDigits {

	public static int digital_root(int n ) {
		return (n != 0 && n%9 == 0) ? 9 : n % 9;
 	}
	
	
	public static void main(String[] args) {
		System.out.println(digital_root(16));
		
	}
}

/*
 * import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DRootTest {
    @Test
    public void Tests() {
      assertEquals( "Nope!" , 7, DRoot.digital_root(16));
      assertEquals( "Nope!" , 6, DRoot.digital_root(195));
      assertEquals( "Nope!" , 2, DRoot.digital_root(992));
      assertEquals( "Nope!" , 9, DRoot.digital_root(99999999));
      assertEquals( "Nope!" , 9, DRoot.digital_root(167346));
      assertEquals( "Nope!" , 1, DRoot.digital_root(10));
      assertEquals( "Nope! Should work for 0" , 0, DRoot.digital_root(0));
    }
}
*/
