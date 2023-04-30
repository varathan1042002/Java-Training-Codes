package Basic_program2;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//  implicit Type Conversion
		
		byte by = 29;
		char ch = 'a';
		
		int in = by;
		int in1 = ch;
		
		long lo = in;
		float fl = in1;
		
		double du = lo;
		float fl1 = lo;
		
		System.out.println(fl1);
		
		// Explicit Type Conversion
		
		long lo1 = 1101111101;
		
		int in2 = (int)lo1;
		
		System.out.println(in2);
		
		short sh =(short)in2;
		System.out.println(sh);
		byte by3 =(byte)sh;
		System.out.println(by3);
		
		char ch4 = (char)lo1;
		
		long in5 = (char)ch4;
		System.out.println(in5);
		
		System.out.println(ch4);
		
		 
		System.out.println(//\u000d);  
				
		String s = "hibro";
		String s1 = "hibro";
		StringBuffer sb = new StringBuffer("hibro");
		System.out.println(s==s1);
		
		
				
		
				


	}

}
