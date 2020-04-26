package sixKyu;
import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 * 6 kyu - Duplicate Encoder
 * @author Jiayu Zhang
 * @version 2020-04-25
 * 
 * The goal of this exercise is to convert a string to a new string where each character in the new string
 * is "(" if that character appears only once in the original string, 
 * or ")" if that character appears more than once in the original string. Ignore capitalization 
 * when determining if a character is a duplicate.
 * 
 * Examples
 * "din"      =>  "((("
 * "recede"   =>  "()()()"
 * "Success"  =>  ")())())"
 * "(( @"     =>  "))((" 
 * 
 * Notes
 * Assertion messages may be unclear about what they display in some languages. If you read 
 * "...It Should encode XXX", the "XXX" is the expected result, not the input!
 *
 */
public class DuplicateEncoder {
	static String encode(String word) {
		word = word.toLowerCase();
		//char[] charArray = word.toCharArray();
		int count = 0;
		String result = "";
		
		for(int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			
			result += word.lastIndexOf(c) == word.indexOf(c) ? ")" : "(";
			System.out.println("last index: " + word.lastIndexOf(c) + "index of: " + word.indexOf(c));
		    }

		return result;
	}
	
	static String BetterSolution(String word) {
		return word.toLowerCase()
				   .chars()
				   .mapToObj(i -> String.valueOf((char) i))
				   .map(i -> word.indexOf(i) == word.lastIndexOf(i) ? "(" : ")")
				   .collect(Collectors.joining());
	}

	
	public static void main(String[] args) {
		System.out.println(encode("din"));
		System.out.println(encode("recede"));
		System.out.println(encode("Success"));
		System.out.println(encode("(( @"));
		
		System.out.println("better: " + BetterSolution("(( @"));
	}
}

/*
 * JUnit test
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DuplicateEncoderTest {
  @Test
  public void test() {
    assertEquals(")()())()(()()(", DuplicateEncoder.encode("Prespecialized"));
    assertEquals("(((((", DuplicateEncoder.encode("<a(O/"));
    assertEquals("))))())))", DuplicateEncoder.encode("   ()(   "));
  }
}
*/

