package AlgoTamizha;

import java.util.Scanner;
/*
 * 1         5
 * 
 *   2     4
 * 
 *      3
 * 
 *   2      4
 *   
 * 1          5
 */

public class PatternXtype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();

		int left = 1;

		int right = s.length();
		boolean flag = false;
		
		for (int i = 0; i < s.length(); i++) {

			for (int j = 0; j < left; j++) {
				System.out.print(" ");
			}
			if (left != right)
				System.out.print(left);

			for (int k = 0; k < right - left; k++) {
				System.out.print(" ");
			}

			System.out.println(right);
			if(left==right) {
				flag=true;
			}
			
            if(!flag) {
			left = left + 1;
			right = right - 1;
            }
			
			else {
				left=left-1;
			    right=right+1;
			}
			
			

		}

	}

}
