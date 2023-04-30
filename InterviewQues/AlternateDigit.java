import java.util.Scanner;
public class AlterNate_Digit_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Values");
		
		int n=sc.nextInt();
		
		int temp=n;
		
		int digit =0;
		
		while(temp>0) {
		
			digit++;
			temp=temp/10;
		}
		
		process(n,digit);

	}
	
	static void process(int n,int digit) {
		
		int ar[] = new int[digit];
		int i=0,rem=0;
		while(n>0) {
			rem=n%10;
			ar[i]=rem;
			n=n/10;
			i++;
		}
		
		for(int k=digit-1;k>=0;k--) {
			System.out.println(ar[k]+"0 ");
		}
		
	}

}
