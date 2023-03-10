package week3day2.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortUsingCollection {

	public static void main(String[] args) {
		String[] name= {"HCL", "Wipro",  "Aspire Systems", "CTS"};
		String output = "";
		List <String> strList = new ArrayList<String>();
		for(int i=0;i<name.length;i++) {
			strList.add(name[i]);
		}
        Collections.sort(strList);
        System.out.println(strList);
        int size = strList.size();
        //for(String reverse:strList) {
        	//strList.get(size-1); 
        	//System.out.println(reverse);
       //}
        for(int i=size-1;i>=0;i--) {
        	output=strList.get(i);
        	System.out.print(" " +output);
        }
        
}
}