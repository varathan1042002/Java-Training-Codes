package array4;

import java.util.Scanner;

public class Duplicate_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Duplicate_Array d = new Duplicate_Array();
		System.out.println("Enter your array length");
		int n = scan.nextInt();
		 d.process(n);
		//int[] arr1 = d.process(n);
		//System.out.println("it's your unique Array");
		//for (int i = 0; i < arr1.length; i++) {
		//	System.out.print(arr1[i] + " ");
		//}

	}

	public void process(int n) {
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[n];
		int brr[] = new int[arr.length];
		int c = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();

		}
	

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}

		}
	



	

		for (int i = 0; i < arr.length - 1; i++) {

			if (arr[i] != arr[i + 1]) {
				//c=arr.length-1;
				brr[c++] = arr[i];
				//c=arr.length-1;
				
			}
		}
		
		for (int i = 0; i <c ; i++) {
			System.out.println(brr[i]+" ");
			
		}
		System.out.print(arr[arr.length-1]);
	

	}
}
	

