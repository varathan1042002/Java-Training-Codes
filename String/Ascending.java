package string;

import java.util.Arrays;

public class Acsending_String2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s={"dcba","aadhavan","baala"};
		//char[] c=s.toCharArray();
		for(int i=0;i<s.length;i++) {
			for(int j=i+1;j<s.length;j++) {
				if(s[i].compareTo(s[j])>0) {
					String t =s[i];
					s[i]=s[j];
					s[j]=t;
				}
			}
		}
		System.out.println(Arrays.toString(s)); 
		}

	}


