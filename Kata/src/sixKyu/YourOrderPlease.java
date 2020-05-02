package sixKyu;


import java.util.Arrays;
import java.util.Comparator;

/**
 * 6 kyu - Your order, please
 * @author Jiayu Zhang @version 2020-05-01
 * 
 * Your task is to sort a given string. Each word in the string will contain a single number. 
 * This number is the position the word should have in the result.
 * Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).
 * If the input string is empty, return an empty string. The words in the input String will 
 * only contain valid consecutive numbers.
 * 
 * Examples
 * "is2 Thi1s T4est 3a"  -->  "Thi1s is2 3a T4est"
 * "4of Fo1r pe6ople g3ood th5e the2"  -->  "Fo1r the2 g3ood 4of th5e pe6ople"
 * ""  -->  ""
 */
public class YourOrderPlease {

	public static String order(String words) {
		String[] arr = words.split(" ");
		StringBuilder result = new StringBuilder();
		
		for(int i = 0; i < 10; i++) {
			for(String e : arr) {
				if(e.contains(String.valueOf(i))) {
					result.append(e + " ");
					//System.out.println(": " + result);
				}
			}
		}
		return result.toString();
	}
	
	public static String betterSolution(String words) {
		return Arrays.stream(words.split(" "))
			      .sorted(Comparator.comparing(s -> Integer.valueOf(s.replaceAll("\\D", ""))))
			      .reduce((a, b) -> a + " " + b).get();
	}
	
	
	public static void main(String[] args) {
	    System.out.println(order("is2 Thi1s T4est 3a"));
	    System.out.println(betterSolution("is2 Thi1s T4est 3a"));

	    System.out.println(order(""));
	}

}
