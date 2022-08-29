package com.capgemini.lesson4;

enum Months {

	// instances defined with name of month and number of days
	Jan(31), Feb(28), Mar(31), Apr(30), May(31), Jun(30), Jul(31), Aug(31), Sep(30), 
	Oct(31), Nov(30), Dec(31);

	// constructor to accept a integer value to represent number of days in
	// months
	Months(int days) {
		this.days = days;
	}

	// property to hold the days in a month
	private int days;

	// getter and setter
	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

}

public class EnumMonths {

	public static void main(String[] args) {
		System.out.println("Days in the month of November are :"+ Months.Nov.getDays());
		System.out.println("Days in the month of December are :"+ Months.Dec.getDays());
		;

	}
}
