package hr;

import java.util.*;
public class Hr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee emp1 = new Employee(101);
		System.out.println("Enter Employee Name, Experience, Salary, Project Name:");
		emp1.setEmpName(sc.next());
		emp1.setExp(sc.nextInt());
		emp1.setSalary(sc.nextInt());
		
		while(emp1.checkSalary() != 1)
		{
			emp1.setSalary(sc.nextInt());
		}
		sc.hasNextLine();
		emp1.setProjectName(sc.nextLine());
		sc.close();
		emp1.workingOnProject();
	}
}
