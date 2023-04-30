

package patternprogram;

public class Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Patterns.pattern1(5);
		//Patterns.pattern2(5);
		//Patterns.pattern3(10);
		//Patterns.pattern4(5);
		Patterns.pattern6(5);

}
	public static void pattern1(int n) {
		for(int i=0;i<=n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void pattern2(int n) {
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void pattern3(int n) {
		for(int i=1;i<2*n;i++) {
			int total=i>n ? 2*n -i:i;
			for(int j=0;j<total;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void pattern4(int n) {
		for(int i=0;i<2*n;i++) {
			int totalRow=i>n ? 2*n-i: i;
			int space=n-totalRow;
			 for(int j=0;j<space;j++) {
				 System.out.print(" ");
			 }
			 for(int k=0;k<totalRow;k++) {
				 System.out.print("* ");
			 }
			 System.out.println();
		}
	}
	public static void pattern5(int n) {
		for(int i=0;i<n;i++) {
			int k=1;
			for(int j=0;j<i;j++) {
				System.out.print(k);
				k=k+2;
			}
			System.out.println();
		}
		
	}
	public static void pattern6(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<i+1;k++) {
				System.out.print("*");
	
			}
			System.out.println();
		}
	}

}
