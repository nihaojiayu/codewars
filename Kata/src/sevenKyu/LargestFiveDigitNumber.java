package sevenKyu;

import java.util.stream.IntStream;

/**
 * 7 kyu - Largest 5 digit number in a series
 * @author Jiayu Zhang
 * @version 2020-06-05
 * 
 * In the following 6 digit number:
 * 283910
 * 91 is the greatest sequence of 2 consecutive digits.
 * In the following 10 digit number:
 * 1234567890
 * 67890 is the greatest sequence of 5 consecutive digits.
 * 
 * Complete the solution so that it returns the greatest sequence of five consecutive digits found within the number given. 
 * The number will be passed in as a string of only digits. It should return a five digit integer. 
 * The number passed may be as large as 1000 digits.
 *
 */
public class LargestFiveDigitNumber {

	public static int solve(final String digits) {
		return IntStream.range(0, digits.length() - 4)
						.mapToObj(i -> digits.substring(i, i + 5))
						.mapToInt(Integer::parseInt)
						.max()
						.orElse(0);
	}
	
	
	public static int solveOther(final String digits) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i <= digits.length() - 5; i++) {
          int number = Integer.parseInt(digits.substring(i, i + 5));
          largest = Math.max(number, largest);
        }
        return largest;
    }
	
	
	public static void main(String[] args) {

		System.out.println(solveOther("283910"));
		System.out.println(solveOther("1234567890"));
	}

}

/*
 * 
 * import org.junit.Test;
import java.util.Random;

public class LargestFiveDigitNumberTest {
    @Test
    public void fixedTests() {
        Preloaded.doTest("283910", 83910);
        Preloaded.doTest("987654321", 98765);
        Preloaded.doTest("1234567890", 67890);
        Preloaded.doTest("1234567898765", 98765);
        Preloaded.doTest("7316717653133062491922511967442657474235534919493496983520368542506326"+
                         "2395783180169848018694788518438586156078911294949545950173795833195285"+
                         "3208805511125406987471585238630507156932909632952274430435576689664895"+
                         "0445244523161731856403098711121722383113622298934233803081353362766142"+
                         "8280644448664523874930358907296290491560440772390713810515859307960866"+
                         "7017242712188399879790879227492190169972088809377665727333001053367881"+
                         "2202354218097512545405947522435258490771167055601360483958644670632441"+
                         "5722155397531234579778461740649551492908625693219784686224828397224137"+
                         "5657056057490261407972968652414535100474821663704844031998900088952434"+
                         "5065854122758866688116427171479924442928230863465674813919123162824586"+
                         "1786645835912456652947654568284891288314260769004224219022671055626321"+
                         "1111093705442175069416589604080719840385096245544436298123098787992724"+
                         "4284909188845801561660979191338754992005240636899125607176060588611646"+
                         "7109405077541002256983155200055935729725716362695618826704282524836008"+
                         "23257540920752963450", 99890);
    }
    @Test
    public void randomTests() {
        final Random rand = new Random();
        for (int trial = 1; trial <= 100; trial++) {
            final char[] arr = new char[rand.nextInt(996)+5];
            for (int i = 0; i < arr.length; i++)
                arr[i] = "0123456789".charAt(rand.nextInt(10));
            final String digits = new String(arr);
            Preloaded.doTest(digits, solution(digits));
        }
    }
    private int solution(final String digits) {
        String max = "", x;
        for (int i = 0; i < digits.length()-4; i++)
            if ( max.compareTo(x = digits.substring(i, i+5)) < 0 )
                max = x;
        return Integer.valueOf(max);
    }
}
*/
