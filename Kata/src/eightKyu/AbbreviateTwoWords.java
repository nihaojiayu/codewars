package eightKyu;

/**
 * 8 kyu - Abbreviate a Two Word Name
 * @author Jiayu Zhang @version 2020-04-26
 * 
 * Write a function to convert a name into initials. 
 * This kata strictly takes two words with one space in between them.
 * The output should be two capital letters with a dot separating them.
 * It should look like this:
 * 
 * Sam Harris => S.H
 * Patrick Feeney => P.F
 *
 */
public class AbbreviateTwoWords {

	public static String addrevName(String name) {
		name = name.toUpperCase();
		return name.charAt(0) + "." + name.charAt(name.indexOf(" ") + 1);
		//return name.toUpperCase().replaceAll("(.).*\\s(.).*", "$1.$2");
	}
	
	
	public static void main(String[] args) {
		System.out.println(addrevName("Sam Harris"));
		System.out.println(addrevName("Patrick Feeney"));
	}
}

/*
 * import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class SolutionTest {
 
    @Test
    public void testFixed() {
        assertEquals("S.H", AbbreviateTwoWords.abbrevName("Sam Harris"));
        assertEquals("P.F", AbbreviateTwoWords.abbrevName("Patrick Feenan"));
        assertEquals("E.C", AbbreviateTwoWords.abbrevName("Evan Cole"));
        assertEquals("P.F", AbbreviateTwoWords.abbrevName("P Favuzzi"));
        assertEquals("D.M", AbbreviateTwoWords.abbrevName("David Mendieta"));
        assertEquals("Z.K", AbbreviateTwoWords.abbrevName("Zenon Kapusta"));
        
        assertEquals("G.C", AbbreviateTwoWords.abbrevName("george clooney"));
        assertEquals("M.M", AbbreviateTwoWords.abbrevName("marky mark"));
        assertEquals("E.D", AbbreviateTwoWords.abbrevName("eliza doolittle"));
        assertEquals("R.W", AbbreviateTwoWords.abbrevName("reese witherspoon"));
    }
    
    @Test
    public void testRandom() {
      for(int i = 0; i < 200; i++){
        String testString = makeString();
        assertEquals(randomTest(testString), AbbreviateTwoWords.abbrevName(testString));
      }
    }
    
    private String makeString() {
        return makeWord(1, 20) + " " + makeWord(1, 20);
      }
    
    private String makeWord(int min, int max) {
      String word = "";
      String[] possible = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".split("");
      int length = (int) (Math.random() * max) + min;
    
      for(int i=0; i < length; i++) {
          int index = (int) (Math.random() * possible.length);
          word += possible[index];
      }
    
      return word;
    }
    
    private String randomTest(String name){
      String[] nameSplit = name.toUpperCase().split(" ");
      return nameSplit[0].substring(0, 1) + '.' + nameSplit[1].substring(0, 1);
    }
}
*/
