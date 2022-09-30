package com.oops.empwagecomputation;
import java.util.*;
public class EmpWageComputation {
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program using OOPS Concept");
		Random random = new Random();
		int empCheck = random.nextInt(2);
		if(empCheck == 1)
		{
			System.out.println("Employee is Present.");
		}
		else
		{
			System.out.println("Employee is Absent.");
		}
	}
}
