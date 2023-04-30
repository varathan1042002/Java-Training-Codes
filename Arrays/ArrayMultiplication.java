import java.util.*;
public class ArrayAddMulDiv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		ArrayAddMulDiv ad = new ArrayAddMulDiv();
        int r=scan.nextInt();
        int l=scan.nextInt();
        ad.add(r, l);
	}
	void add(int a,int b) {
		Scanner scan = new Scanner(System.in);

		int arr[][] = new int[a][b];
		int arr2[][]= new int[a][4];
		int arr3[][] = new int[a][b];
		int i=0;
		int j=0;
		for( i=0;i<arr.length;i++) {
			for( j=0;j<arr.length;j++) {
				arr[i][j]=scan.nextInt();
			}
			System.out.println();
		}
		for( i=0;i<arr2.length;i++) {
			for( j=0;j<arr2.length;j++) {
				arr2[i][j]=scan.nextInt();
			}
			System.out.println();
		}
		for( i=0;i<arr2.length;i++) {
			for( j=0;j<arr2.length;j++) {
				arr2[i][j]=scan.nextInt();
			}
			System.out.println();
		}
		for( i=0;i<arr3.length;i++) {
			for(j=0;j<arr3.length;j++) {
				arr3[i][j]=arr2[i][j]*arr[i][j];
				System.out.print(arr3[i][j]+" ");
				
			}
			System.out.println();
		}
		

    }
}
