package sixKyu;

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
		if(text.charAt(0) == text.charAt(1));
		count++;
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(duplicateCount("aAbbcde")); //2

	}

}
