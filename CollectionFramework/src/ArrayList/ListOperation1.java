package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListOperation1 {

	public static<T> List<T> reverseList(List<T> list)
    {
        List<T> reverse = new ArrayList<>(list);
        Collections.reverse(reverse);
        return reverse;
    }
 
    public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(10, 25, 33, 28, 10, 12);
 
        System.out.println(list);
        List<Integer> reverse = reverseList(list);
        System.out.println(reverse);
        Collections.replaceAll(reverse, 28, 20);
        System.out.println(reverse);
    }

}
