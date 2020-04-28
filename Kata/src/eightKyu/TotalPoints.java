package eightKyu;

import java.util.Arrays;
import java.util.List;

/**
 * 8 kyu - Total amount of points
 * @author Jiayu Zhang @version 2020-04-28
 * 
 * Our football team finished the championship. The result of each match look like "x:y". Results of all matches are recorded in the collection.
 * For example: ["3:1", "2:2", "0:1", ...]
 * Write a function that takes such collection and counts the points of our team in the championship. Rules for counting points for each match:
 * if x>y - 3 points
 * if x<y - 0 point
 * if x=y - 1 point
 * 
 * Notes:
 * there are 10 matches in the championship
 * 0 <= x <= 4
 * 0 <= y <= 4
 *
 */
public class TotalPoints {
	
	public static int points(String[] games) {
		int sum = 0;
		for(String e: games) {
			char x = e.charAt(0);
			char y = e.charAt(2);
			
			sum += x > y ? 3 : x == y ? 1 : 0;
		}
		return sum;
	}
	
	public static int betterSolution(String[] games) {
		return Arrays.stream(games)
				.mapToInt(scores -> scores.charAt(0) - scores.charAt(2))
				.map(match -> match > 0 ? 3 : match == 0 ? 1 : 0)
				.sum();
	}

	public static void main(String[] args) {
		String[] championship1 = {"1:0","2:0","3:0","4:0","2:1","3:1","4:1","3:2","4:2","4:3"};
		System.out.println("chanpionship has total points of " + points(championship1)); //30
		System.out.println("chanpionship has total points of " + betterSolution(championship1)); //30

		
		String[] championship2 = {"0:1","0:2","0:3","0:4","1:2","1:3","1:4","2:3","2:4","3:4"};
		System.out.println("chanpionship has total points of " + points(championship2)); //0
	}

}

/*
 * import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

import java.util.Random;

public class SolutionTest {
    @Test
    public void basicTests() {
        assertEquals(30, TotalPoints.points(new String[]
                         {"1:0","2:0","3:0","4:0","2:1","3:1","4:1","3:2","4:2","4:3"}));
                     
        assertEquals(10, TotalPoints.points(new String[]
                         {"1:1","2:2","3:3","4:4","2:2","3:3","4:4","3:3","4:4","4:4"}));
                     
        assertEquals(0, TotalPoints.points(new String[]
                         {"0:1","0:2","0:3","0:4","1:2","1:3","1:4","2:3","2:4","3:4"}));
        
        assertEquals(15, TotalPoints.points(new String[]
                         {"1:0","2:0","3:0","4:0","2:1","1:3","1:4","2:3","2:4","3:4"}));
                     
        assertEquals(12, TotalPoints.points(new String[]
                         {"1:0","2:0","3:0","4:4","2:2","3:3","1:4","2:3","2:4","3:4"}));
    }
    
    private Random rnd = new Random();
    @Test
    public void randomTests() {
        String[] games = new String[10];
        
        for (int i = 0; i < 500; i++) {
            for (int match = 0; match < 10; match++)
              games[match] = rnd.nextInt(5)+":"+rnd.nextInt(5);
              
            System.out.println("Testing for:\n" + java.util.Arrays.toString(games) + "\n");
            assertEquals(solution(games), TotalPoints.points(games));
        }
    }
    
    private int solution(String[] games) {
        int sum = 0;
        
        for (String s : games) {
          char x = s.charAt(0), y = s.charAt(2);
          
          sum += x > y ? 3 : x == y ? 1 : 0;
        }
        
        return sum;
    }
}
*/
