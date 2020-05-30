package Assignment1;
import java.util.Scanner;

public class problem {
	
	public static void main(String[] Strings) {
		System.out.print("Input distance in miles");
		
		Scanner input = new Scanner (System.in);
		double miles = input.nextDouble();
		double kilometers = (miles*1.6);
		
		System.out.println(miles+"miles ="+kilometers+"kilometers.");
	}

}
