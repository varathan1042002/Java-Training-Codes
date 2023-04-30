package Basic_program2;

public class Prime_Num_Two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prime_Num_Two pt = new Prime_Num_Two();
		
		pt.process(1, 100);
		

	}
	
	void process(int s,int e) {
		
		while(s<e) {
		    int n=s;
		    boolean flag=true;
		    for(int i=2;i<n;i++) {
		    	if(n%i==0) {
		    		flag=false;
		    	}
		    }
		    if(flag==true) {
		    	System.out.println(n);
		    }
		    s++;
			
		}
		
	}

}
