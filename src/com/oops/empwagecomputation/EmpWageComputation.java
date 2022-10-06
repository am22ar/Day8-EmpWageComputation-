package com.oops.empwagecomputation;

import java.util.*;
public class EmpWageComputation {
	public static final int halfDayHours = 4;
	public static final int fullDayHours = 8;

	private final String companyName;
	private final int empWagePerHour;
	private final int workingHours;
	private final int workingDays;
	int totalSalary;
	static Random random = new Random();

	public EmpWageComputation(String companyName, int empWagePerHour, int workingHours, int workingDays) {
		this.companyName = companyName;
		this.empWagePerHour = empWagePerHour;
		this.workingDays = workingDays;
		this.workingHours = workingHours;
	}

	public void calculateWage() {
		int salary = 0;
		totalSalary = 0;
		int totalWorkingHours = 0;
		int days = 0;

		while (totalWorkingHours <= workingHours && days <= workingDays) {
			days++;

			int empCheck = random.nextInt(3);

			switch (empCheck) {
			case 1:
				
				 System.out.println("Present Fullday.");
				 salary = empWagePerHour * fullDayHours;
				 totalWorkingHours = totalWorkingHours + fullDayHours;
				break;
			case 2:
				
				 System.out.println("Present HalfDay.");
				 salary = empWagePerHour * halfDayHours;
				 totalWorkingHours = totalWorkingHours + halfDayHours;
				break;
			default:
				System.out.println("Employee Abscent");
			}
			
			System.out.print("Day: "+days+"\t random: "+empCheck+"\t");
			System.out.print("Working Hours: "+totalWorkingHours+"\t");
			System.out.print("Salary is: "+salary+"\t");
			totalSalary = totalSalary + salary;
			
		}
		
		//return totalWorkingHours * empWagePerHour;
	}
	public String toString() {
		return "Total Wage for Company: "+companyName+" is "+totalSalary;
		
	}

	public static void main(String[] args) {
		
		 EmpWageComputation netflix = new EmpWageComputation("netflix", 23, 90, 21);
		 EmpWageComputation jio = new EmpWageComputation("jio", 24, 109, 22);
		 netflix.calculateWage();
		 System.out.println(netflix);
		 jio.calculateWage();
		 System.out.println(jio);
		 
		 //System.out.println("Total employee's wage of Company: " + dmart.companyName + ": " + dmart.calculateWage());
		 //System.out.println("Total employee's wage of Company: " + walmart.companyName + ": " + walmart.calculateWage());
		
		
	}
}
