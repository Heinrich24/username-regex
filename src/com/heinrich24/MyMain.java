package com.heinrich24;
import java.util.Scanner;

class UsernameValidator {
    /*
     * Breakdown of the Regex as follows:
     * 
     * ^[a-zA-Z]     = Means any a-z or A-Z at the start of a line
     * [a-zA-Z0-9_]  = * a-z (Range), Matches a character in the range "a" to "z" (char code 97 to 122).
     * 				   * A-Z (Range), Matches a character in the range "A" to "Z" (char code 65 to 90).
     * 				   * 0–9 (Range), Matches a character in the range "0" to "9" (char code 48 to 57).
     * {7,29}$		 = The limit the characters in username used. More than 7 character and less than 29 characters.
     * 
     */
    public static final String regularExpression = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";
}

public class MyMain {
	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }           
        }
    }

}
