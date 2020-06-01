import java.io.IOException;

public class MagicsquareX4 {
	
	public void make() throws IOException {
		
		int n = 0;
		int magic [][];
		int row = 0;
		int col = 0;
		int half;
		int quater;
		int val = 1;
		
		n = System.in.read() - 48;
		
		magic = new int [n][n];
		half = n/2;
		quater = half/2;		
		
		for(row = 0; row < n; row++) {
			for(col = 0; col < n; col++) {
				if(a(row,col,half,quater) == true) {
					magic[row][col] = val;
				}else {
					magic[row][col] = n*n-val+1;
				}
				val++;
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
					System.out.print ("["+magic[i][j]+"]");
			}
				System.out.println();
		}
	}
	
	private boolean a(int row, int col, int half, int quater) {
        if(row < quater || row >= half + quater){
            if(col < quater || col >= half + quater){
            return true;
            }
        }
        if(row >= quater && row < half + quater){
            if(col >= quater && col < half + quater){
            return true;
            }
        }
	return false;
	}
	
	public static void main(String[] args) throws IOException {
		System.out.println("값을 입력하시요.");	
		MagicsquareX4 add = new MagicsquareX4();
		add.make();	
	}

}
