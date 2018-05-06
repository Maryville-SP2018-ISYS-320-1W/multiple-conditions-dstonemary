import java.util.Scanner;

/*
	ISYS 320
	Name(s): Derek Stone
	Date:    April-16-2018
*/

/*  What was the error?
 Error at line : if(name == "blue")
  
 */

public class P1_FavoriteColor {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		System.out.print("What is your favorite color? ");
		String name = console.nextLine();
		
		if( name.equalsIgnoreCase("blue")) {
			System.out.println("Mine too!");
		}

	}

}
