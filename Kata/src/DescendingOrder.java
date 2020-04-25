import static java.util.Comparator.reverseOrder;
import static java.util.stream.Collectors.joining;
/**
 * 7 kyu - Descending Order
 * @author Jiayu Zhang
 * @version 2020-04-25
 * 
 * Your task is to make a function that can take any non-negative integer as 
 * a argument and return it with its digits in descending order. 
 * Essentially, rearrange the digits to create the highest possible number.
 * 
 * Examples:
 *   Input: 21445 Output: 54421
 *   Input: 145263 Output: 654321
 *   Input: 123456789 Output: 987654321
 *   
 * Integer.parseInt() --> https://www.javatpoint.com/java-integer-parseint-method
 * Collectors.joining() --> https://www.geeksforgeeks.org/java-8-streams-collectors-joining-method-with-examples/
 */
public class DescendingOrder {
	public static int sortDesc(final int num) {
		return Integer.parseInt(("" + num) //Stream
			          .chars() //IntStream
			          .mapToObj(i -> "" + (char) i)
			          .sorted(reverseOrder())
			          .collect(joining())
			          );
	}
}

/**
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DescendingOrderTest {

    @Test
    public void test_01() {
        assertEquals(0, DescendingOrder.sortDesc(0));
    }    

    @Test
    public void test_02() {
        assertEquals(51, DescendingOrder.sortDesc(15));
    }
   
    @Test
    public void test_03() {
        assertEquals(987654321, DescendingOrder.sortDesc(123456789));
    }
}
*/
