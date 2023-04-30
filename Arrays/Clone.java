
public class Clone_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Clone_Array ca = new Clone_Array();
		
		int ar[] = {10,20,30,40};
		
		
		for(int i=0;i<ar.length;i++) {
		
		System.out.print(ar[i]+" ");

		}
		ca.process(ar);
	}
	
	void process(int ar1[]) {
		
		int ar2[] = new int[ar1.length];
		
		ar2=ar1;
		
		System.out.println();
		
		for(int i=0;i<ar2.length;i++) {
			System.out.println(ar2[i]);
		}
		
	}

}
