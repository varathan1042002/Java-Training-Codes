import java.util.Scanner;
import java.util.Set;
import java.util.LinkedHashSet;
public class Print_distinct_Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		char[] c = s.toCharArray();
		
		Set<Character> set = new LinkedHashSet<>();
		
		for(int i=0;i<c.length;i++) {
			
			set.add(c[i]);
		}
		
		System.out.println(set);
		
		
	}
}
