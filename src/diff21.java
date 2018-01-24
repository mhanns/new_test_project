/*Maurice Hanns
Given an int n, return the absolute difference
between n and 21, except return double the 
absolute difference if n is over 21.

diff21(19) ? 2
diff21(10) ? 11
diff21(21) ? 0*/

import java.util.Scanner;

public class diff21 {
	
	public static void main(String [] args){
		
	Scanner scan = new Scanner(System.in);
	System.out.println("Please enter a number ");
	int numb = scan.nextInt();
	
	n=differ21 (numb);
	
	}//main

public int differ21(int n) {
		if (n>21)
			{
			n= ((n-21 )* 2);
			}
		else 
			{
			n = n - 21;
			n = n - (n+n);
			}
return n;

	}//diff21
}//class
