package week3day2.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

//Here is the input
		//int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		//       output= 7;

		/*
		 * Pseudo Code: 
		 * a) Create a empty Set Using TreeSet
		 * b) Declare for loop iterator from 0 to data.length and add into Set 
		 * c) converted Set into List
		 * d) Print the second last element from List
		 * 
		 * 
		 */

public class FindSecondLargest {

	public static void main(String[] args) {
		
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		Set<Integer> dataSet = new TreeSet<Integer>();
		for(int i=0; i<data.length;i++) {
			
			dataSet.add(data[i]);
		}
		List<Integer> dataList = new ArrayList<Integer>(dataSet);
		int size = dataList.size();
		System.out.println("Second largest element in array is "+dataList.get(size-2));
		
	

	}

}
