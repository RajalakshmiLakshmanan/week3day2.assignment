package week3day2.assignment;


import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {
	public static void main(String[] args) {
		 
		String input = "Paypal India";
		char[] charArray = input.toLowerCase().toCharArray();
		Set<Character> charSet  = new LinkedHashSet<Character>();
		Set<Character> dupCharset = new LinkedHashSet<Character>();
		for(int i=0; i<charArray.length;i++) {
			if(!(charSet.add(charArray[i]))){
				dupCharset.add(charArray[i]);
			}
			
		}
		System.out.println("duplicate set ouput: "+dupCharset);
		charSet.removeAll(dupCharset);
		for(Character output:charSet) {
			if(output!=' ') {
				System.out.println(output);
				
				
			}
		}
		
		
	}
	

}
