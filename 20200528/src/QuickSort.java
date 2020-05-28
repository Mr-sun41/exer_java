import java.util.Arrays;

public class QuickSort {
	static int partition(int[] middle, int start, int end) {
	int	pivot = middle[(start+end)/2];
	
		while (start <= end) {
			while(middle[start] < pivot) start++;
			while(middle[end] > pivot) end--;
				if(start <= end) {
					int tmp = middle[start];
					middle[start] = middle[end];
					middle[end] = tmp;
					start++;
					end--;
				}
		}
		return start;
	}
	
	static int[] QSort(int[] middle, int start, int end) {
		int part = partition(middle, start, end);
		
		if(start < part-1)
			QSort(middle, start, part-1);
		if(part<end)
			QSort(middle, part, end);
		
		return middle;		
	}
	
	public static void main(String[] args) {
		int[] middle = {(int)(Math.random()*100)+1, (int)(Math.random()*100)+1, (int)(Math.random()*100)+1,
				(int)(Math.random()*100)+1, (int)(Math.random()*100)+1, (int)(Math.random()*100)+1,
				(int)(Math.random()*100)+1, (int)(Math.random()*100)+1, (int)(Math.random()*100)+1,};
		
		middle = QSort(middle, 0, middle.length-1);
		System.out.println(Arrays.toString(middle));
	}		
}
