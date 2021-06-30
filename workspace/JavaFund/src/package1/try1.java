package package1;

import java.util.Arrays;
import java.util.stream.Collectors;


public class try1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] inputList = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul",
				"aug", "Sep", "Oct", "nov", "Dec" };
		java.util.List<String> lst= (java.util.List<String>) Arrays.asList(inputList);
		java.util.List<String>lst2=lst.stream().sorted().collect(Collectors.toList());
		System.out.println(lst2);
	}

}
