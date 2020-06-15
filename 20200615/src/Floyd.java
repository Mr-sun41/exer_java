
public class Floyd {
	
    int w = 999;
    int p[][] = {{0,2,3,w,7},
                 {5,0,w,w,4},
                 {2,w,0,6,w},
                 {w,w,3,0,4},
                 {6,1,7,2,0}}; //�׷����� 5���� ������ ������. �����׷���.}
    public void printmatrix() {
        for(int i=0; i<5; i++) {
            for(int j=0; j<5; j++) {
                if(p[i][j] == w) {
                    System.out.printf("   w"); 
                continue;
                }
                System.out.printf("%4d",p[i][j]);
            }
            System.out.println();
        }
    }
    
    public void floydalgorithm() {
        for(int k=0; k<5; k++)
        {
            for(int i=0; i<5; i++)
            {
                for(int j=0; j<5; j++)
                {
                    if(p[i][j]>p[i][k]+p[k][j])
                        p[i][j] = p[i][k]+p[k][j];
                }
            }
            System.out.println(k +"��° ���������� ��ĥ�� �ִ� ��� ��� �ֿ� ���� �ִܰ��");
            printmatrix();
        }
    }
    
    public static void main(String[] args) {
        Floyd f = new Floyd();
        f.floydalgorithm();
    }
}
