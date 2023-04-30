package array4;

import java.util.Scanner;



public class LargestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
int n =scan.nextInt();
int a[] = new int[n];
for(int i=0;i<a.length;i++) {
	a[i]=scan.nextInt();
	
}
/*for(int i=0;i<a.length;i++) {

System.out.println(a[i]);
	}*/
//int max=a[0];
for(int i=0;i<a.length;i++) {
     for (int j=i+1;j<a.length;j++) {
    	 if(a[i]>a[j]) {
    		 int t=a[i];
    		 a[i]=a[j];
    		 a[j]=t;
    	 }
     }
		//System.out.println(a[i]);

}
System.out.println("largest Element :"+a[a.length-2]);

	}
}
