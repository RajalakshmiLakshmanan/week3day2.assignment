package week3day2.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class PrintUniqueChar {

	public static void main(String[] args) {
		String input = "Harini";
		char[] charArray = input.toLowerCase().toCharArray();

		Set <Character> charSet= new HashSet<Character>();
		for(int i=0;i<charArray.length;i++) {

			charSet.add(charArray[i]);
		}
		List<Character> charList = new ArrayList<Character>(charSet);


		System.out.println(charArray);
		System.out.println(charList);
		for(int i=0; i<charList.size() ;i++) {
			int count=0;
			for(int j=0;j<charArray.length;j++) {

				if(charList.get(i)==charArray[j]) {
					count++;
				}

			}
			if(count==1) {
				System.out.println(charList.get(i));

			}
		}

	}
}