package string;

import java.util.Arrays;
import java.util.Scanner;
public class AnagramTwoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        System.out.println("Enter your First anagram value");
		String s1 =scan.nextLine();
		System.out.println("Enter your Second anagram value");
		String s2 =scan.nextLine();
		//char[] a;
	
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		if(s1.length()!=s2.length())
		{
			System.out.println("not anagram");
		}
		else {
	    char[] a = s1.toCharArray();
		char [] b = s2.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		boolean status = Arrays.equals(a,b);
		
		if(status) {
			System.out.println(s1+"  its anagram   "+s2);
		}
			else {
				System.out.println("its not anagram");
			}
			
			
			
		}
			
			
		
		
		
		
		
	}

}
