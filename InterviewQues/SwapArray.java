import java.util.Scanner;
public class Swap_Array_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter Your Array Length");
		
		int len=sc.nextInt();
		
		int ar1[] = new int[len];
		
		int ar2[] = new int[len];
		
		intput_and_process(ar1,ar2,len);


	}
	
	static void intput_and_process(int ar1[],int ar2[],int len) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your First Array Values One By One");
		
		for(int i=0;i<ar1.length;i++) {
			
			ar1[i]=sc.nextInt();
		}
		

		System.out.println("Enter Your Second Array Values One By One");

		for(int i=0;i<ar2.length;i++) {
			
			ar2[i]=sc.nextInt();
		}
		
		
		int ar3[] = new int[len];
		
		// Swapping Area
		
		ar3=ar1;
		
		ar1=ar2;
		
		ar2=ar3;
		
		for(int i=0;i<ar1.length;i++) {
			
			System.out.print(ar1[i]+" ");
		}
		

		for(int i=0;i<ar2.length;i++) {
			
			System.out.print(ar2[i]+" ");
		}
		
	}

}
