package sevenKyu;

/**
 * 7 kyu - Beginner Series #3 Sum of Numbers.
 * @author Jiayu Zhang
 * @version 2020-04-25
 *
 * 
 * Given two integers a and b, which can be positive or negative, 
 * find the sum of all the numbers between including them too and return it. 
 * If the two numbers are equal return a or b.
 * Note: a and b are not ordered!
 * 
 * Examples
 * GetSum(1, 0) == 1   // 1 + 0 = 1
 * GetSum(1, 2) == 3   // 1 + 2 = 3
 * GetSum(0, 1) == 1   // 0 + 1 = 1
 * GetSum(1, 1) == 1   // 1 Since both are same
 * GetSum(-1, 0) == -1 // -1 + 0 = -1
 * GetSum(-1, 2) == 2  // -1 + 0 + 1 + 2 = 2
 * 
 * 	Math abs() --> https://www.geeksforgeeks.org/java-math-abs-method-examples/
 *
 */
public class Sum {
	public static int GetSum(int a, int b) {
		int sum = 0;
		if(a == b) return a;
	      for(int i = a; i <= b; i++) {
	        if(a < b)
	          sum += i;
	      }
	      
	      for(int j = a; j >= b; j--) {
	       if(a > b)
	         sum += j;
	      }     
	     return sum;
	 }
	
	public static int BetterSolutionGetSum(int a, int b) {
	    return (a + b) * (Math.abs(a - b) + 1) / 2;
	}
	
	
	public static void main(String[] args) {
		System.out.println(GetSum(-5,7));
		System.out.println(BetterSolutionGetSum(-5,7));
		System.out.println(GetSum(3,-8));
		System.out.println(BetterSolutionGetSum(3,-8));

		
		//lesson - Math.abs()
		System.out.println(Math.abs(-5.23));
		System.out.println(Math.abs(Integer.MIN_VALUE));
	}
	
}
