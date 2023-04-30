package array4;

import java.util.*;

public class ArrayConcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First Array Size");
		int a = scan.nextInt();
		System.out.println("Enter Second Array Size");
		int b = scan.nextInt();
		ArrayConcat ac = new ArrayConcat();
		ac.process(a, b);

	}

	void process(int a, int b) {
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[a];
		int brr[] = new int[b];

		System.out.println("Enter your first Array Values");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println("Enter Second Array Values");
		for (int i = 0; i < brr.length; i++) {
			brr[i] = scan.nextInt();
		}
		int c = arr.length > brr.length ? brr.length : arr.length;
		int d = arr.length > brr.length ? arr.length : brr.length;
		int crr[] = new int[d];
		for (int i = 0; i < c; i++) {
			crr[i] = arr[i] * brr[i];
		}
		for(int i=c;i<crr.length;i++) {
			if(arr.length>brr.length) {
			crr[i]=arr[i];
			}
			else if(arr.length<brr.length) {
				crr[i]=brr[i];
			}
		}/
		
		  for(int i=0;i<crr.length;i++)
		  {
			  System.out.print(crr[i]+" ");
		  }
		 

	}

}
