import java.util.*;
public class Switch_Case {

    int a;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		char c=scan.next().charAt(0);
		switch(c){
		case '+':
			int a=10,b=20,d;
			d=a+b;
			System.out.print(d);
			break;
			
		case '-':
			d=0;
			a=20;
			b=90;
			d=a-b;
			System.out.print(d);
			break;
			
			
		}

	}

}
