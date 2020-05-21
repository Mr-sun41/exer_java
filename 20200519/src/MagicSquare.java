import java.io.IOException;
 
public class MagicSquare {
	
	public void make() throws IOException {
		
		int n = 0;
		int magic [][];
		int row = 0;
		int col = 0;
		
		n = System.in.read() - 48;
		
		col = n/2;
		magic = new int [n][n];
		
		for(int val=1; val <= n*n;) {
			magic [row][col] = val;
			if(val % n == 0) {
				row++;
			}
			else {
				row--;
				col++;
			}
			if(row < 0) 
				row = n-1;
			if(row >= n) 
				row = 0;
			if(col < 0) 
				col = n-1;
			if(col >= n) 
				col = 0;
				val++;			
		}
		
			for(int i=0; i<n; i++) {
				for(int j=0; j<n; j++) {
					System.out.print ("["+magic[i][j]+"]");
				}
				System.out.println();
			}
	}
	
	public void print() {
	}
	
	public static void main(String[] args) throws IOException {
		System.out.println("홀수 정수를 입력하시요.");	
		MagicSquare add = new MagicSquare();
		add.make();	
		add.print();
	}
}