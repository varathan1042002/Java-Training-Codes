import java.util.Scanner;
public class Swap_First_last_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter Your Number");
		
		int n=sc.nextInt();
		
		process(n);

		
	}
	
	static void process(int n) {
		int rem=0;
		while(n>0) {
			rem=n%10;
			System.out.print(rem);
			n=n/10;
		}
		
	}

}
