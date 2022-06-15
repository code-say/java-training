package com.sayan.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class java8Programs {

	public static void main(String[] args) {
		
		List<Employee> emplist = new ArrayList<>();
		emplist.add(new Employee(101, "sayan", 101, "active", 2000));
		emplist.add(new Employee(102, "gnedhu", 102, "active", 6000));
		emplist.add(new Employee(103, "podhu", 103, "active", 4500));
		emplist.add(new Employee(104, "lodhu", 104, "inactive", 2500));
		emplist.add(new Employee(105, "modhu", 105, "inactive", 7500));
		emplist.add(new Employee(106, "jodu", 106, "active", 6000));
		emplist.add(new Employee(107, "ram", 107, "inctive", 3000));
		
		
		// to print employee details based on dept
		Map<Integer, List<Employee>> empListBasedOnDept = emplist.stream().collect(Collectors.groupingBy(Employee::getDeptId, Collectors.toList()));
		
		empListBasedOnDept.entrySet().forEach(e -> {
			System.out.println(e.getKey()+"----"+ e.getValue());
		});
	}
	
}
