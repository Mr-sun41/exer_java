import java.util.Scanner;

public class SNail {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [][] A = new int[n][n];
		int f = 0;
		
		for(int K =1; K <=n*n; ){
			int k = f+1;
			for(int j=f; j<n-f; j++) {
				A[f][j] = K++;
			}
			for(int i=k; i<n-f; i++) {
				A[i][n-f-1] = K++;
			}
			k = n-f-2;
			for(int j=k; j>=f; j--) {
				A[n-f-1][j] = K++;
			}
			for(int i=k; i>f; i--) {
				A[i][f] = K++;
			}
			f+=1;
		}
		print(n, A);
	}
	
	public static void print(int n, int[][] array) {
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print("["+array[i][j]+"]"+ "\t");
			}
			System.out.println();
		}
	}
}