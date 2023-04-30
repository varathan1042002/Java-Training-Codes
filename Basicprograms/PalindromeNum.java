package Basic_program2;
import java.util.Scanner;
public class Palindram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Palindram palin = new Palindram();
		
		Scanner scan = new Scanner(System.in);
		
		int p = scan.nextInt();
		
		palin.process(p);
		

	}
	
	void process(int pali) {
		int temp=0,sum=0,rem=0;
		temp=pali;
		while(pali>0) {
			rem=pali%10;
			
			sum=(sum*10)+rem;
			
			pali=pali/10;
			
		}
		if(temp==sum) {
			System.out.println(temp + "It is a Palindrom");
		}
		else
			System.out.println(temp + "It is not a Palindrom" + sum);

	}

}
