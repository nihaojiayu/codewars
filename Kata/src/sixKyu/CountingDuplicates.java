package sixKyu;

import java.util.Arrays;

/**
 * 6 kyu - Counting Duplicates
 * @author Jiayu Zhang @version 2020-04-26
 * 
 * Write a function that will return the count of distinct case-insensitive alphabetic characters and 
 * numeric digits that occur more than once in the input string. The input string can be assumed to 
 * contain only alphabets (both upper-case and lower-case) and numeric digits.
 * Example
 * "abcde" -> 0 # no characters repeats more than once
 * "aabbcde" -> 2 # 'a' and 'b'
 * "aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
 * "indivisibility" -> 1 # 'i' occurs six times
 * "Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice
 * "aA11" -> 2 # 'a' and '1'
 * "ABBA" -> 2 # 'A' and 'B' each occur twice
 *
 */
public class CountingDuplicates {
	
	public static int duplicateCount(String text) {
		int count = 0;
		text = text.toLowerCase();
		
		while(text.length() > 0) {
			String firstletter = text.substring(0,1);  //get the first letter of text. ex,a
			text = text.substring(1); //the rest of letters. ex,abbcde

			if(text.contains(firstletter)) //if the rest letters has the first letter, count++
				 count++;

			text = text.replace(firstletter, ""); //replace the original text. ex, bbcde
		}
		
		return count;
	}

	public static void main(String[] args) {
		System.out.println(duplicateCount("aAbbcde")); //2
	}

}

/*
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class SolutionTest {
    @Test
    public void emptyReturnsZero() {
        assertEquals(0, CountingDuplicates.duplicateCount(""));
    }
    
    @Test
    public void abcdeReturnsZero() {
        assertEquals(0, CountingDuplicates.duplicateCount("abcde"));
    }
    
    @Test
    public void abcdeaaReturnsOne() {
        assertEquals(1, CountingDuplicates.duplicateCount("abcdeaa"));
    }
    
    @Test
    public void abcdeaBReturnsTwo() {
        assertEquals(2, CountingDuplicates.duplicateCount("abcdeaB"));
    }
    
    @Test
    public void IndivisibilitiesReturnsTwo() {
        assertEquals(2, CountingDuplicates.duplicateCount("Indivisibilities"));
    }
    
    @Test
    public void abcdefghijklmnopqrstuvwxyzReturnsZero() {
        assertEquals(0, CountingDuplicates.duplicateCount("abcdefghijklmnopqrstuvwxyz"));
    }
    
    @Test
    public void abcdefghijklmnopqrstuvwxyzaaAbReturnsTwo() {
        assertEquals(2, CountingDuplicates.duplicateCount("abcdefghijklmnopqrstuvwxyzaaAb"));
    }
    
    @Test
    public void abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzReturnsTwentySix() {
        assertEquals(26, CountingDuplicates.duplicateCount("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz"));
    }
    
    @Test
    public void abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZReturnsTwentySix() {
        assertEquals(26, CountingDuplicates.duplicateCount("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"));
    }
}
*/
