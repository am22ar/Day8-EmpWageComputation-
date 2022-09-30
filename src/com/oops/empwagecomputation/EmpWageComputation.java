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
		Random random = new Random();
		for(int i=1; i<totalWorkingDays; i++)
		{
			int empCheck = random.nextInt(3);
			switch(empCheck)
			{
				case 0: System.out.println("Employee is Absent.");
						break;	
				case 1: System.out.println("Employee is Present.");
						salary = empWagePerHour * fullDayHour ;
						break;
				case 2: System.out.println("Present for Half Day");
						salary = empWagePerHour * halfDayHour ;
			}
				//System.out.println("random: "+empCheck);
				System.out.println("Salary is: "+salary);
				totalSalary = totalSalary + salary;
		}
		System.out.println("Total Salary: "+totalSalary);
	}
}
