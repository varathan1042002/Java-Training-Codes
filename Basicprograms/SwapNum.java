package Basic_program2;

public class Swap_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		String a = "varathan";
		
		String b ="raja";
		
		a=a+b;//  
		//System.out.println(a);

		b=a.substring(0,a.length()-b.length());
		
		a=a.substring(b.length());
		
		System.out.println(a+"  "+b);

	}
	
}
