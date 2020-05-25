
public class Amicable {
	public static void main(String[] args) {
		
		int n= 5000;
		for(int k=1; k<n; k++) {
			int a =0;
			int b =0;
			
			for (int i = 1; i<k/2+1; i++) {
				if(k%i ==0) {
					a+=i;
				}
			}
			for(int j=1; j<a/2+1; j++) {
				if(a%j ==0) {
					b+=j;
				}
			}
			
			if(k == b && a != b && a>b) {
				int n1 = a;
				int cnt = 0;
				System.out.println("친화수는 "+k+" "+a);
				
				for(int i=1; i<k; i++) {
					if(k%i==0) 
						System.out.print(i+" ");
					}
					System.out.println(" ");
					
					for(int i=1; i<= a; i++) {
						if (a%i==0)
							System.out.print(i+" ");
					}
					System.out.println(" ");				
			}
		}
	}
}


