package com.bridgelabz;

//Calculate Daily Employee Wage.
public class DailyEmployee {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage");
		int IS_FULL_TIME = 1;
		int EMP_RATE_PER_HOUR = 20;
		int empHrs = 0;
		int empWage = 0;

		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == IS_FULL_TIME) {
			empHrs = 8;
			empWage = empHrs * EMP_RATE_PER_HOUR;
			System.out.println("Employee wage : " + empWage);
		} else {
			System.out.println("Employee wage not found");
		}
	}
}
