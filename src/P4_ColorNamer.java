import java.util.Scanner;

/*
ISYS 320
Name(s): Derek Stone
Date:    April-16-2018
*/

public class P4_ColorNamer {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("What color should be named? ");
		String abbreviat = console.next();
		if(abbreviat.equalsIgnoreCase("r")){
			System.out.println("The name is Red.");
		} else if(abbreviat.equalsIgnoreCase("g")){
			System.out.println("The name is Green.");
		} else if(abbreviat.equalsIgnoreCase("b")){
			System.out.println("The name is Blue.");
		} else {
			System.out.println("Error: I don't know what a "+abbreviat+" is.");
		}
	}

}
