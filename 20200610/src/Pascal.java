import java.util.ArrayList;
import java.util.Scanner;

public class Pascal {
	public static void main(String[] args) {
		//파스칼의 삼격형 저장소
		ArrayList<int []> arrList = new ArrayList<int []>();
		int [] arr = new int[1];
		int [] prevArr;
		
		int max = printMaxLine(); //최대 라인수
		
		arr[0] = 1;	//초기 라인수
		arrList.add(arr);
		
		for(int n=1; n<max; n++) {
			arr = new int[n+1];	//n+1 개의 배열 생성
			arr[0] = 1; // 첫번째 수는 항상 1
			prevArr = arrList.get(n-1); //n-1 번째 라인 배열 가져옴
			
			for(int k=1; k<n; k++) { //해당 라인만큼 루프
				arr[k] = prevArr[k-1]+prevArr[k];	//n번째 라인의 k번째 수는 k-1 + n-1 라인의 k
			}
			arr[n] = 1;	//마지막 수는 항상 1
			arrList.add(arr);
		}
		printTriangle(arrList);
	}
	
	private static int printMaxLine() {
		System.out.print("최대 라인을 입력하세요 : ");
		Scanner scanner = new Scanner(System.in);
		int max = scanner.nextInt();
		return max;
	}
	//파스칼 삼각형 출력
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
