import java.util.Scanner;

/*
ISYS 320
Name(s):
Date: 
*/

/*  What was the error?
 Error at line : if(name == "blue")
  
 */

public class P1_FavoriteColor {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		System.out.print("What is your favorite color? ");
		String name = console.next();
		
		if( name.equalsIgnoreCase("blue")) {
			System.out.println("Mine too!");
		}

	}

}
