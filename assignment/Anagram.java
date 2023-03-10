package week3day2.assignment;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1 = "stops";
		String text2 = "potss";
		char[] text1Array = text1.toCharArray();
		char[] text2Array = text2.toCharArray();
		int length1 = text1Array.length;
		int length2 = text2Array.length;
		boolean flag = false;
		Arrays.sort(text1Array);
		System.out.println(text1Array);
		Arrays.sort(text2Array);
		System.out.println(text2Array);
		
		if(length1==length2) {
			for(int i=0;i<length1;i++) {
				if(!((text1Array[i]==(text2Array[i])))) {
					System.out.println("given text is not Anagram");
					flag=true;
					break;
                   }
		}
		
	}else {
		flag=true;
		System.out.println("given text is not Anagram");
	}
    if (flag) {
    	System.out.println("given text is not Anagram");
    }
    else {
    	System.out.println("given text is Anagram");
    }
		
}
}