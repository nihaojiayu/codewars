package sixKyu;

import java.util.Arrays;

/**
 * 6 kyu - Break camelCase
 * @author Jiayu Zhang @version 2020-05-09
 *
 * Complete the solution so that the function will break up camel casing, using a space between words.
 * Example
 *   solution("camelCasing")  ==  "camel Casing"
 */
public class BreakCamelCase {
	
	public static String camelCase(String input) {
		return input.replaceAll("(?=[A-Z])", " $1");
	}
	
	public static String camelCase1(String input) {
       String output = "";
       for(int i = 0; i < input.length(); i++) {
    	   //checking if the char is upper case or not. 
    	   output = Character.isUpperCase(input.charAt(i)) ? output + " " + input.charAt(i) : output + input.charAt(i);
       }
       
       return output;
	}
	
	public static void main(String[] args) {
		System.out.println(camelCase1("camelCasing"));
	}

}
