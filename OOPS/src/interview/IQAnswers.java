package interview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class IQAnswers {
	public static void main(String args[]) {
	//Find the duplicate elements in a given integers list in java using Stream functions
	
	List<Integer> list = Arrays.asList(10,28,87,10,20,76,28,80,80,80);
	Set<Integer> set = new HashSet<>();
	list.stream().filter(x->!set.add(x)).collect(Collectors.toSet()).forEach(x->System.out.println(x));
}

}