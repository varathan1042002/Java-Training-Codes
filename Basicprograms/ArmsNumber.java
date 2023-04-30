import java.util.*;
public class Armstron_NumTwoInterval {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int f=scan.nextInt();
		int s=scan.nextInt();
		Armstron_NumTwoInterval a = new Armstron_NumTwoInterval();
		a.arms_process(f, s);
	}
	
	public void arms_process(int f,int s) {
		int digit=0;
		int s1=s;
		while(s1>0) {
			s1=s1/10;
			digit=digit++;
		}
	//	System.out.println("total digits "+digit);
		for(int i=f;i<=s;i++) {
			int temp=i;
			int sum=0;
            int rem=0;
            
			while(temp> 0) {
				rem=temp%10;
				sum=sum+(rem*rem*rem);
				temp=temp/10;
			}
			if(i==sum) {
				System.out.println(" "+sum);	
			}
		}
		

	}

}
