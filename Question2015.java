// @author sophiesacks

import java.util.Scanner;

public class Question2015 
{
	public static void main(String [] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int numCases = keyboard.nextInt();
		
		for(int c = 1; c <= numCases; c++)
		{
			int seconds = keyboard.nextInt();
			int minutes = seconds / 60;
			seconds %= 60;
			int hours = minutes / 60;
			minutes %= 60;
			int days = hours / 24;
			hours %= 24;
			
			System.out.println("Days: " + days);
			System.out.println("Hours: " + hours);
			System.out.println("Minutes: " + minutes);
			System.out.println("Seconds: " + seconds);
		}
	}
}
