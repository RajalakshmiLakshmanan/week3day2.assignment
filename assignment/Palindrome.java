package week3day2.assignment;


public class Palindrome {
	public static void main(String[] args) {
		String input = "madam";
		String rev="";
		char[] charArray = input.toCharArray();
		for(int i=charArray.length-1;i>=0;i--) {
			rev= rev +charArray[i];
			
		}
		if(input.equals(rev)) {
			System.out.println("given String is palindrome");
		}else {
			System.out.println("given String is not a palindrome");
			
		}
		
	}

}
