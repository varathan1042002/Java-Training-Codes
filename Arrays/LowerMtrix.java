package array4;

import java.util.*;

public class Lower_Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter Row length in Array");
		int r=scan.nextInt();
		System.out.println("Enter Column length in Array");
		int c=scan.nextInt();
		Lower_Matrix lw = new Lower_Matrix();
		lw.lower_process(r,c);
		

	}
	void lower_process(int r,int c) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Array values one by one");
		int arr[][] = new int[r][c];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				
			arr[i][j]=scan.nextInt();
		}
			System.out.println();
		}
		System.out.print("Before Matrix");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
			System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(i>j) {
					System.out.print("0"+" ");
				}
				else
					System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

}
