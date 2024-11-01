package week3.day2.HomeAssignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortUsingCollection {

	public static void main(String[] args) {
		
		List<String> inputOrg = new ArrayList<String>();
		inputOrg.add("HCL");
		inputOrg.add("Wipro");
		inputOrg.add("Aspire Systems");
		inputOrg.add("CTS");
		
		String temp;
		
		List<String> output = new ArrayList<String>();
		
		System.out.println("Input Strings:"+inputOrg);
		
		Collections.sort(inputOrg);
		
		for(int i=inputOrg.size()-1;i>=0;i--)
		{
			temp = inputOrg.get(i);
			output.add(temp);
		}

		System.out.println("Reverse Sort strings are:"+output);

	}

}
