package Basic_program2;

public class Fibbonacci_No {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fibbonacci_No fn = new Fibbonacci_No();
		fn.process(5);
	}
	
	void process(int n) {
		int f=-1,s=1,t=0;
		for(int i=0;i<n;i++) {
			t=f+s;
			System.out.println(t);
			f=s;
			s=t;
			
		}
	}

}
