package sevenKyu;

/**
 * 7 kyu - String ends with?
 * @author Jiayu Zhang @version 2020-05-01
 * 
 * Complete the solution so that it returns true if the first argument(string) passed in 
 * ends with the 2nd argument (also a string).
 * Examples:
 * solution('abc', 'bc') // returns true
 * solution('abc', 'd') // returns false
 * 
 * String.endsWith() -> https://www.tutorialspoint.com/java/java_string_endswith.htm
 *
 */
public class StringEndsWith {

	public static boolean solution(String str, String ending) {
		if(str.length() < ending.length())
			return false;
		else {
			//System.out.println("SUBSTRING: " + str.substring(str.length() - ending.length()));
			return str.substring(str.length() - ending.length()).equals(ending);
		}
		
//		BetterSolution
		//return str.endsWith(ending);
	}
	
	public static void main(String[] args) {

		System.out.println(solution("abc", "bc")); //true
		System.out.println(solution("abc", "d")); //false
		System.out.println(solution("sumo", "omo")); //false
	}

}

/*
 * import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

// TODO: Replace examples and use TDD development by writing your own tests

public class SolutionTest {
    @Test
    public void staticTests() {
        check("samurai", "ai", true);
        check("sumo", "omo", false);
        check("ninja", "ja", true);
        check("sensei", "i", true);
        check("samurai", "ra", false);
        check("abc", "abcd", false);
        check("abc", "abc", true);
        check("abcabc", "bc", true);
        check("ails", "fails", false);
        check("fails", "ails", true);
        check("this", "fails", false);
        check("this", "", true);
        check(":-)", ":-(", false);
        check("!@#$%^&*() :-)", ":-)", true);
        check("abc\n", "abc", false);
    }
    
    private static void check(String str, String ending, boolean expected) {
      boolean result = Kata.solution(str, ending);
      assertEquals("Expected solution(\"" + str + "\", \"" + ending + "\") to return " + expected, expected, result);
    }
}
*/
