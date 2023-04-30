import java.util.Scanner;
public class Distinct_Elements7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Array Length");
		
		int l=sc.nextInt();
		
		int ar1[] = new int[l];
		
		System.out.println("Enter Your Array Values One By One");
		
		for(int i=0;i< ar1.length;i++) {
			ar1[i]=sc.nextInt();
		}
		
		process(ar1);
		
	}
	
	static void process(int ar1[]) {
		
		int count=0;
		
		for(int i=0;i<ar1.length-1;i++) {
			if(ar1[i] != ar1[i+1]) {
				count++;
			}
		}
		
	}

}
