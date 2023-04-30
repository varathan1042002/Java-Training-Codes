import java.util.Scanner;
public class Contain_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter Your String");
		
		String s=sc.nextLine();
		
		process(s);
		
	}
	
	static void process(String s) {
		int count=0;
		s=s.replaceAll("\s", "");
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='0' && s.charAt(i)<='9') {
			
					count++;	
				}
				
			}
		
	
		
		if(count==s.length()) {
			System.out.println(s+" Contains Only Numbers");
		}
		else
			System.out.println(s+" Contain Some Other Values");
		
	}

}
