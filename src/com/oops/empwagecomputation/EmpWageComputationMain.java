package com.oops.empwagecomputation;
public class EmpWageComputationMain {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
		EmpWageComputation ewc = new EmpWageComputation();
		EmpWageComputation.ComputeEmpWage();
		ewc.displayTotalSalary();

	}

}
