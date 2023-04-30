import java.util.Scanner;
public class Merge_Sorted_Array6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your First Array Length");
		
		int len1 = sc.nextInt();
		
		int ar1[] = new int[len1];
		
		System.out.println("Enter Your Second Array Length");

		int len2 =sc.nextInt();
		
		int ar2[]= new int[len2];
		
		input(ar1,ar2);

	}
	static void input(int ar1[],int ar2[]) {
		
		Scanner sc = new Scanner(System.in);
		
	    System.out.println("Enter Your First Array Values One By One");

		for(int i=0;i<ar1.length;i++) {
			ar1[i]=sc.nextInt();
		}
		
	    System.out.println("Enter Your Second Array Values One By One");

		for(int i=0;i<ar2.length;i++) {
			ar2[i]=sc.nextInt();
		}
		
		process(ar1,ar2);
		
	}
	
	static void process(int ar1[],int ar2[]) {
		
		int i=0,j=0,k=0;
		
		int ar3[] = new int[ar1.length+ar2.length];
		
		while(i < ar1.length && j < ar2.length) {
			
			if(ar1[i] < ar2[j]) {
			
				ar3[k++]=ar1[i++];
			}
			else
				ar3[k++]=ar2[j++];
			
		}
		
		while(i < ar1.length) {
			ar3[k++]=ar1[i++];
		}
		
		while(j < ar2.length) {
			ar3[k++]=ar2[j++];
		}
		
		for(int m=0;m<ar3.length;m++) {
			System.out.println(ar3[m]+" ");
		}
		
	}

}
