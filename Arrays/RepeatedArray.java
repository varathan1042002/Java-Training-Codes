package array4;

import java.util.*;

public class Repeated_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		Repeated_Array ra = new Repeated_Array();
		int n= scan.nextInt();
		ra.process(n);
		

	}
	void process(int n) {
		
		
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[n];
		int brr[] = new int[arr.length];
		int c=0;
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					brr[c++]=arr[i];
				}
				
			}
		}
			for(int i=0;i<c;i++) {
				System.out.print(brr[i]+" ");
				
			}
		
		
	}

}
