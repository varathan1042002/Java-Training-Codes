package array4;
import java.util.Scanner;
public class Upper_Matrix {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int r=scan.nextInt();
		int c=scan.nextInt();
		
		Upper_Matrix um = new Upper_Matrix();
		um.process(r, c);

	}
	
	void process(int r,int c) {
		
		int[][] n= new int[r][c];
		Scanner scan = new Scanner(System.in);

		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				n[i][j]=scan.nextInt();
			}
			System.out.println();
		}
		
		for(int i=0;i<r;i++) {

			for(int j=0;j<c;j++) {
				if(i==j) {
					System.out.print("0"+" ");
				}
				else
				System.out.print(n[i][j]+" ");
		}
			System.out.println();
		
		
	}
		
		
		
	}
	
}


