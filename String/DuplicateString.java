package string;
import java.util.*;
public class Duplicate_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Duplicate_String ds = new Duplicate_String();
		System.out.println("Enter your String");
        String s=scan.nextLine();
        ds.process(s);
	}
	void process(String s) {
		int count =0;
		
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)&&s.charAt(i)!=' ') {
					count+=2;
					
					System.out.print(s.charAt(i));
				}
			}
			
		}
		System.out.println("Repeat Words Total "+count);
	}

}
