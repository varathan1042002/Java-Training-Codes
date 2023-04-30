package string;

public class EachLetterCap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hi hello guys java our is blood";
		String temp="";
		//StringBuffer temp=new StringBuffer();
		String[] s2=s.split(" ");
		for(int i=0;i<s2.length;i++) {
			System.out.print(s2[i].substring(0,1).toUpperCase()+s2[i].substring(1)+" ");
			 System.out.print(temp);
		}
		//System.out.print(temp);

	}

}
