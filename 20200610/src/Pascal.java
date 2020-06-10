import java.util.ArrayList;
import java.util.Scanner;

public class Pascal {
	public static void main(String[] args) {
		//�Ľ�Į�� ����� �����
		ArrayList<int []> arrList = new ArrayList<int []>();
		int [] arr = new int[1];
		int [] prevArr;
		
		int max = printMaxLine(); //�ִ� ���μ�
		
		arr[0] = 1;	//�ʱ� ���μ�
		arrList.add(arr);
		
		for(int n=1; n<max; n++) {
			arr = new int[n+1];	//n+1 ���� �迭 ����
			arr[0] = 1; // ù��° ���� �׻� 1
			prevArr = arrList.get(n-1); //n-1 ��° ���� �迭 ������
			
			for(int k=1; k<n; k++) { //�ش� ���θ�ŭ ����
				arr[k] = prevArr[k-1]+prevArr[k];	//n��° ������ k��° ���� k-1 + n-1 ������ k
			}
			arr[n] = 1;	//������ ���� �׻� 1
			arrList.add(arr);
		}
		printTriangle(arrList);
	}
	
	private static int printMaxLine() {
		System.out.print("�ִ� ������ �Է��ϼ��� : ");
		Scanner scanner = new Scanner(System.in);
		int max = scanner.nextInt();
		return max;
	}
	//�Ľ�Į �ﰢ�� ���
	private static void printTriangle(ArrayList<int[]> al) {
		int len = al.size();
		int len2;
		int [] arr;
		
		for(int i=0; i<len; i++) {
			arr = al.get(i);
			len2 = arr.length;
			
			for(int k=0; k<len2; k++) {
				System.out.print(arr[k] + " ");
			}
			System.out.println();
		}
	}

}
