import java.util.Scanner;


public class MyConditionalProblem {
	/*
	 	Choose tourist place in terms of expenses
	 */
	
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("What continents regions would you like to choose for travel? ");
		String country = console.next();
		if(country.equalsIgnoreCase("South Asia")){
			System.out.println("low expensive");
		} else if(country.equalsIgnoreCase("North Africa")){
			System.out.println("low expensive");
		} else if(country.equalsIgnoreCase("Europe")){
			System.out.println("high expensive");
		} else if(country.equalsIgnoreCase("South America")){
			System.out.println("medium expensive");
		}
	}

}
