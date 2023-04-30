package array4;
import java.util.*;
public class Transpose_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Transpose_matrix tm = new Transpose_matrix();
        System.out.println("Enter Your Array Row Length");
		int a=scan.nextInt();
		System.out.println("Enter Your Array Column Length");
		int b=scan.nextInt();
		tm.process(a, b);
	}
	void process(int a,int b) {
		Scanner scan = new Scanner(System.in);
		int arr[][] = new int[a][b];
		System.out.println("Please Enter Your Array Values One By One");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				arr[i][j]=scan.nextInt();
			}
			System.out.println();
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(i<j) {
					System.out.print(" 0 ");
				}
				else 
					System.out.print(" "+arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}

