package string;

import java.util.*;

public class SwapTwoWithout3Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner scan = new Scanner(System.in);
		String a=scan.nextLine();
		String b=scan.nextLine();
		System.out.print("Before Swap :"+a+" "+b);

		a=a+b;
		b=a.substring(0,a.length()-b.length());
		a=a.substring(b.length());
		System.out.print("Before Swap :"+a+" "+b);
	}

}
