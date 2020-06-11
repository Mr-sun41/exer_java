
public class Arrayloop {
	public static void main(String[] args) {
		
		int [][] a = new int [10][10];

		for(int n=0; n<10; n++) {
			for(int m=1; m<10; m++) {
				a[n][m] = n*m;
			a[0][n] = n;
			a[m][0] = m;
			}	
		}
		
		for(int i=0; i<a.length; i++){ 
			for(int j=0; j<a[i].length; j++) 
			System.out.print("["+a[i][j]+"]"+"\t"); 
			System.out.println(""); 
			}
		System.out.println();
	}
}
