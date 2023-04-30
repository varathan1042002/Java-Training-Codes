
package patternprogram;

public class BasicPattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;

		pattern5(n);
		pattern7(10);
		//pattern6(10);

	}
	static void pattern1(int n) {
		for(int i=0;i<n;i++) {
			int k=1;
			for(int j=0;j<i;j++) {
				System.out.print(k);
				k+=2;
			}
			System.out.println();
		}
	}
	
	static void pattern2(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	static void pattern3(int n) {
		for(int i=0;i<n;i++) {
			for(int k=0;k<n-i;k++) {
				System.out.print(" ");
			}
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	static void pattern4(int n) {
		for(int i=0;i<n*2;i++) {
			int c=i > n ? n * 2 - i : i;
			for(int j=0;j<c;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
}
	
	static void pattern5(int n) {
		for(int i=0;i<n*2;i++) {
			int c=i > n ? n * 2 - i:i;
			for(int s=0;s<c;s++) {
				System.out.print(" ");
			}
			for(int k=0;k<c;k++) {
				System.out.print("*");
			}
			System.out.println();
			
			
		}
	}
	
	
	static void pattern6(int n) {
		for(int i=0;i<n*2;i++) {
			int c= i > n ? n * 2 - i:i;
			for(int j=0;j<n-c;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<c;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	static void pattern7(int n) {
		for(int i=1;i<n;i++) {
			for(int j=1;j<n-i;j++) {
				System.out.print(" ");
			}
			for(int k=i;k>=1;k--) {
				System.out.print(k);
			}
			for(int m=2;m<=i;m++) {
				System.out.print(m);
			}
			System.out.println();
		}
	}

}
