/**
 * 8 kyu - Century From Year
 * 
 * @author Jiayu Zhang
 * @version 2020-04-25
 * 
 * Introduction
 * The first century spans from the year 1 up to and including the year 100, 
 * The second - from the year 101 up to and including the year 200, etc.
 * 
 * Task :
 * Given a year, return the century it is in.
 * 
 * Input , Output Examples ::
 *   centuryFromYear(1705)  returns (18)
 *   centuryFromYear(1900)  returns (19)
 *   centuryFromYear(1601)  returns (17)
 *   centuryFromYear(2000)  returns (20)
 * Hope you enjoy it .. Awaiting for Best Practice Codes
 * Enjoy Learning !!!
 *
 */
public class SolutionCenturyFromYear {
	
	public static int century(int number) {
		return (number % 100 == 0) ? (number = (number / 100)) : (number = (number / 100) + 1);
		//return (number + 99) /100;
	}
	
	public static void main(String[] args) {
		System.out.println(century(1705)); //18
		System.out.println(century(1900)); //19
		System.out.println(century(1601)); //17
		System.out.println(century(2000)); //20
		System.out.println(century(89)); //1
	}
}
