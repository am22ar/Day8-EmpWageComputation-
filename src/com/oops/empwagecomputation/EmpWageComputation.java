package com.oops.empwagecomputation;
import java.util.*;
public class EmpWageComputation {
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program using OOPS Concept");
		int empWagePerHour = 20;
		int fullDayHour = 8;
		int salary = 0;
		Random random = new Random();
		int empCheck = random.nextInt(2);
		if(empCheck == 1)
		{
			System.out.println("Employee is Present.");
			salary = empWagePerHour * fullDayHour ;
		}
		else
		{
			System.out.println("Employee is Absent.");
		}
		System.out.println("Salary is: "+salary);
	}
}
