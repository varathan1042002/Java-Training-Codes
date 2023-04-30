
public class Single_iterator_fNon_repeatChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean flag = false;
		
		char value =' ';
		
		String s = "geeksforgeeks";
		
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(s.indexOf(c)==s.lastIndexOf(c)) {
				value=c;
				flag=true;
				break;
			}
		}

		if(!flag) {
			System.out.println("All character are Repeating");
		}
		else
			System.out.println(value);
	}

}
