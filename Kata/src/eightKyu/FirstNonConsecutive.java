package eightKyu;

import java.lang.reflect.Array;

/**
 * 8 kyu - Find the first non-consecutive number
 * @author Jiayu Zhang @version 2020-04-28
 * 
 * Your task is to find the first element of an array that is not consecutive.
 * By not consecutive we mean not exactly 1 larger than the previous element of the array.
 * E.g. If we have an array [1,2,3,4,6,7,8] then 1 then 2 then 3 then 4 are all consecutive 
 * but 6 is not, so that's the first non-consecutive number.
 * 
 * If the whole array is consecutive then return null.
 * The array will always have at least 2 elements and all elements will be numbers. 
 * The numbers will also all be unique and in ascending order. 
 * The numbers could be positive or negative and the first non-consecutive could be either too!
 * 
 * If you like this Kata, maybe try this one next: 
 * https://www.codewars.com/kata/represent-array-of-numbers-as-ranges
 * 1 Can you write a solution that will return null2 for both [] and [ x ] though? 
 * (This is an empty array and one with a single number and is not tested for, 
 * but you can write your own example test. )
 * 
 */
public class FirstNonConsecutive {
	
	public static Integer find(final int[] array) {
		for(int i = 1; i < array.length; i++) {
			if(array[i] - array[i-1] != 1)
				return array[i];
		}
		return null;
	}
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,6,7,8}; //6
		for(int i = 0; i < arr1.length; i++) {
			int x = Array.getInt(arr1, i);
			System.out.printf("%d ", x);
		}
		System.out.println();
		System.out.println("first consective number in the array is: " + find(arr1));
	}
}

/*
 * import java.util.Arrays;
import java.util.Random;
import java.util.Set;
import java.util.HashSet;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public final class FirstNonConsecutiveTest {
    @Test public void basicTests() {
        assertEquals(Integer.valueOf(6), FirstNonConsecutive.find(new int[]{1, 2, 3, 4, 6, 7, 8}));
        assertEquals(null, FirstNonConsecutive.find(new int[]{1, 2, 3, 4, 5, 6, 7, 8}));
        assertEquals(Integer.valueOf(6), FirstNonConsecutive.find(new int[]{4, 6, 7, 8, 9, 11}));
        assertEquals(Integer.valueOf(11), FirstNonConsecutive.find(new int[]{4, 5, 6, 7, 8, 9, 11}));
        assertEquals(null, FirstNonConsecutive.find(new int[]{31, 32}));
        assertEquals(Integer.valueOf(0), FirstNonConsecutive.find(new int[]{-3, -2, 0, 1}));
        assertEquals(Integer.valueOf(-1), FirstNonConsecutive.find(new int[]{-5, -4, -3, -1}));
    }

    @Test public void randomTests() {
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            int length = random.nextInt(15) + 1;
            int[] array = new int[length];
            int start = random.nextInt(10000) - (10000/4); //25% should start less than zero
            for (int j=0; j<length; j++) {
              array[j] = start;
              start++;
              if (random.nextInt(100) > 90) start++;
            }
            assertEquals("For input \"" + Arrays.toString(array) + '"', kata(array), FirstNonConsecutive.find(array));
        }
    }

    private static Integer kata(final int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[i - 1] + 1) {
                return array[i];
            }
        }
        return null;
    }
}
 */


