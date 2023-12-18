package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Client {

	public static void main(String[] arg) {
		employelist list = {eId, eName, eSalar, eAge, email1, email2}
		int[] Arr = { 0, 1, 3, 42, 5, 2, 8 };
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(9);
		list.add(7);
		list.add(13);
		list.add(15);
		list.add(2);

		/*
		 * List<Integer> sortedList =
		 * list.stream().sorted().collect(Collectors.toList());
		 * System.out.println("Sorted list using sort in stream "+sortedList );
		 * 
		 * List<Integer> filterdList = list.stream().filter(l->
		 * (l%2==0)).collect(Collectors.toList());
		 * System.out.println("filtered list using filter in stream "+filterdList );
		 * List<Integer> modifiedList = list.stream().map(l->
		 * l+5).collect(Collectors.toList());
		 * System.out.println("filtered list using filter in stream "+modifiedList );
		 */

		/*
		 * List l1 = new ArrayList(); l1.add(2); l1.add(3); l1.add(5); List l = new
		 * ArrayList(); l.add(2); l.add(7); l.add(5);
		 * 
		 * List l3 = (List) l1.stream().filter(element ->
		 * l.contains(element)).collect(Collectors.toList());
		 * System.out.println(l3.toString());
		 */
		List l5=list.stream().map(x->x*2).toList();
		
	}

}
