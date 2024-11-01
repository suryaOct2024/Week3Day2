package week3.day2.HomeAssignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargestNum {

	public static void main(String[] args) {
		
		int[] input = {3,2,11,4,6,7};
		List <Integer> output = new ArrayList<Integer>();
		
		for(int i=0;i<input.length;i++)
			output.add(input[i]);
		Collections.sort(output);
		System.out.println("2nd largest number:"+output.get(output.size()-2));
		

	}

}
