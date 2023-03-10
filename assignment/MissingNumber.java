package week3day2.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/*
 * Psuedocode
 * 
 * a) Remove the duplicates using Set
 * b) Make sure the set is in the ascending order
 * c) Iterate from the starting number and verify the next number is + 1
 * d) If did not match, that is the number
 * 
 */


public class MissingNumber {

	public static void main(String[] args) {
		int[] data = {5,3,7,8,1,9,2,3,6,10};
		Set<Integer> dataSet = new TreeSet<Integer>();
        for(int i=0;i<data.length;i++) {
        	dataSet.add(data[i]);
        }
        System.out.println(dataSet);
        List<Integer> dataList = new ArrayList<Integer>(dataSet);
        for(int j=0;j<dataList.size();j++) {
            if(!(dataList.get(j)==(j+1))) {
            	System.out.println("missing number is " +(j+1));
            	break;
            }
        	
        }
	}

}
