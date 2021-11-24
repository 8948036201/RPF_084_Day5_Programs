package leapyear;

import java.util.Scanner;

public class LeapYear {
	
	public static void main(String[] args) {
		System.out.println("Enter the year which you want to check leap year" + "check for the LEAP YEAR");
		
		Scanner scYear = new Scanner(System.in);
		
		int year = scYear.nextInt();
		scYear.close();
		
		if (year > 999 && year < 10000) {
			
			LeapYear leapYear = new LeapYear();
			leapYear.checkLeapYear(year);
			
		} else {
			System.out.println("Invalid Input");
		}
	}
	
	public void checkLeapYear(int year) {
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println("Year " + year + " is the leap year");
		} else {
			System.out.println("year " + year + " is not leap year");
		}
	}
}
