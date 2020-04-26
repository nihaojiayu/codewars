package eightKyu;
/**
 * 8 kyu - Is n divisible by x and y?
 * @author Jiayu Zhang
 * @version 2020-04-26
 * 
 * Create a function that checks if a number n is divisible by two numbers x AND y.
 * All inputs are positive, non-zero digits.
 * 
 * Examples:
 *  n = 3, x = 1, y = 3 => true because 3 is divisible by 1 and 3
 *  n = 12, x = 2, y = 6 => true because 12 is divisible by 2 and 6
 *  n = 100, x = 5, y = 3 => false because 100 is not divisible by 3
 *  n = 12, x = 7, y = 5 => false because 12 is neither divisible by 7 nor 5
 *
 */
public class DivisibleNB {

	private static boolean isDivisibleNB(int n, int x, int y) {
		if(n % x == 0 && n % y == 0)
		 return true;
		else 
			return false;
		
		//return n % x == 0 && n % y == 0;
	}
	
	public static void main(String[] args) {
		System.out.println(isDivisibleNB(12,4,3)); //true
		System.out.println(isDivisibleNB(3,1,3)); //true

		System.out.println(isDivisibleNB(100,5,3));  //false
		System.out.println(isDivisibleNB(3,3,4));  //false
	}
}

/*
import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

public class DivisibleNbTests {

	@Test
	public void test1() {
		assertEquals(true, DivisibleNb.isDivisible(12,4,3));
	}
	@Test
	public void test2() {
		assertEquals(false, DivisibleNb.isDivisible(3,3,4));
	}	
		
}
*/

