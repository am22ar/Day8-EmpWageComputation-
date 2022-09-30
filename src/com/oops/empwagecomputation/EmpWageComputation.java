package com.oops.empwagecomputation;

import java.util.*;

public class EmpWageComputation {
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program using OOPS Concept");

		int empWagePerHour = 20;
		int fullDayHour = 8;
		int halfDayHour = 4;
		int salary = 0;
		int totalSalary = 0;
		int totalWorkingDays = 20;
		int days =0;
		int totalWorkingHours = 0;
		Random random = new Random();
		while(days != totalWorkingDays && totalWorkingHours != 100)
		{
			
			int empCheck = random.nextInt(3);
			switch(empCheck)
			{
				case 0: System.out.println("Employee is Absent.");
						break;	
				case 1: System.out.println("Employee is Present.");
						salary = empWagePerHour * fullDayHour ;
						totalWorkingHours = totalWorkingHours + fullDayHour;
						break;
				case 2: System.out.println("Present for Half Day");
						salary = empWagePerHour * halfDayHour ;
						totalWorkingHours = totalWorkingHours + halfDayHour;
			}
				System.out.print("random: "+empCheck+"\t");
				System.out.print("Working Hours: "+totalWorkingHours+"\t");
				System.out.print("\tSalary is: "+salary+"\t");
				totalSalary = totalSalary + salary;
				days++;
		}
		System.out.println("Total Salary: "+totalSalary);
	}
}
