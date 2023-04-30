
public class Perfect_Num {

	public static void main(String[] args) {
		
		Perfect_Num.perfectProcess(28);
	}
	public static void perfectProcess(int n) {
		int per=0;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
			per=per+i;
			
			}
			
		}
		if(n==per)
		System.out.print(per+" : perfect Number");
		else
			System.out.print("not perfect");
	
	}

}
