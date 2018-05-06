import java.util.Scanner;

/*
ISYS 320
Name(s): Derek Stone
Date:    April-16-2018
*/

public class P6_Quadrant {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("What is X-Coordinate? ");
		double coordinateX = console.nextDouble();
		System.out.print("What is Y-Coordinate? ");
		double coordinateY = console.nextDouble();
		if(coordinateX > 0 && coordinateY > 0){
			System.out.println("Quadrant I");
		} else if(coordinateX < 0 && coordinateY > 0){
			System.out.println("Quadrant II");
		} else if(coordinateX < 0 && coordinateY < 0){
			System.out.println("Quadrant III");
		} else if(coordinateX > 0 && coordinateY < 0){
			System.out.println("Quadrant IV");
		} 
	}

}
