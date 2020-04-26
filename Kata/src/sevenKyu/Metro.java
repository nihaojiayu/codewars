package sevenKyu;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 7 kyu - Number of People in the Bus
 * 
 * @author Jiayu Zhang
 * @version 2020-04-25
 * 
 * There is a bus moving in the city, and it takes and drop some people in each bus stop.
 * You are provided with a list (or array) of integer arrays (or tuples). 
 * Each integer array has two items which represent number of people get into bus 
 * (The first item) and number of people get off the bus (The second item) in a bus stop.
 * 
 * Your task is to return number of people who are still in the bus after the 
 * last bus station (after the last array). Even though it is the last bus stop, 
 * the bus is not empty and some people are still in the bus, and they are probably sleeping there :D
 * 
 * Take a look on the test cases.
 * Please keep in mind that the test cases ensure that the number of people in the bus
 * is always >= 0. So the return integer can't be negative.
 * The second value in the first integer array is 0, since the bus is empty in the first bus stop.
 *
 *
 * .stream().mapToInt --> https://www.geeksforgeeks.org/stream-maptoint-java-examples/
 */
public class Metro {
	
	public static int countPassengers(ArrayList<int[]> stops) {
	//Code here!
		int getIn = 0;
		int getOff = 0;
		int rest = 0;
		for(int[] e: stops) {
			getIn += e[0]; //sum up the number of people get into the bus
			//System.out.print("get in: " + getIn + ", ");
			getOff += e[1]; //sum up the number of people get off from  the bus
			//System.out.println("get off: " + getOff + ", ");
		}
		
		rest = getIn - getOff;
		//System.out.printf("rest = %d getIn: %d - getOff: %d%n", rest, getIn, getOff);
		return rest;

	}
	
	public static int BetterSolution(ArrayList<int[]> stops) {
		return stops.stream()
			    .mapToInt(x -> x[0] - x[1])
			    .sum();
	}
	
	
	public static void main(String[] args) {
		ArrayList<int[]> list = new ArrayList<int[]>();
		  list.add(new int[] {10,0,103});
		  list.add(new int[] {3,5,102});
		  list.add(new int[] {2,5,101});
      
		System.out.println(countPassengers(list));
		System.out.println(BetterSolution(list));
	}
}

/**
 * JUnit test
  
 import java.util.ArrayList;
 import org.junit.Test;
 import static org.junit.Assert.assertEquals;
 import org.junit.runners.JUnit4;
 
 public class MetroTest {
 Metro metro = new Metro();
 @Test
 public void test1() {
   ArrayList<int[]> list = new ArrayList<int[]>();
   list.add(new int[] {10,0});
   list.add(new int[] {3,5});
   list.add(new int[] {2,5});
   assertEquals(5, metro.countPassengers(list));
  }
 }
 */

