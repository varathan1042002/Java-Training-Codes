import java.util.*;
public class Prime_TwoIntervals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scan = new Scanner(System.in);
       int f=scan.nextInt();
       int s=scan.nextInt();
       Prime_TwoIntervals p = new Prime_TwoIntervals();
       p.prime_processin(f, s);
       

}
	public void prime_processin(int f,int s) {
		for(int i=f;i<s;i++) {
			boolean flag =true;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					flag=false;
					break;
					
				}
				
			}
			if(flag==true) {
				System.out.println("The prime Num is :"+i);
			
			}
		}
	}
}
