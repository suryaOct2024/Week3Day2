package week3.day2.HomeAssignments;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfNumbers {

	public static void main(String[] args) {
		
		int[] input1 = {3,2,11,4,6,7};
		int[] input2 = {1,2,8,4,9,7};
		List <Integer> output = new ArrayList <Integer> ();
		
		for(int i=0;i<input1.length;i++)
		{
			for(int j=0;j<input2.length;j++)
			{
				if(input1[i] == input2[j])
					output.add(input1[i]);
					
			}
		}
		System.out.println("Intersection of numbers:");
		System.out.println(output);

	}

}
