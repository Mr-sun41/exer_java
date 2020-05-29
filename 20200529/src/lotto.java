import java.util.HashSet;
import java.util.Set;


public class lotto {
	
	 public static void main(String[] args) {
		 
		    Set<Integer> lotto = new HashSet<>();
		    
		    while(lotto.size() < 6) {
		    lotto.add((int)(Math.random() * 45 + 1));
		    }    	
		    
		    Integer[] lottoArr = new Integer[6];
		    lotto.toArray(lottoArr);
		    bubbleSort(lottoArr);
		    
		    for(int i : lottoArr) {
		      System.out.print("["+i+"]");
		    }
	}
	 
	 private static void bubbleSort(Integer[] array) {
			  
		 boolean isContinue = false;
		 int tempNum;
		    for (int i = 0; i < (array.length - 1); i++) {            
		      for (int j = 0; j < (array.length - i - 1); j++) {
		        if (array[j] > array[j + 1]) {
		          tempNum = array[j];
		          array[j] = array[j + 1];
		          array[j + 1] = tempNum;
		          isContinue = true;
		        }
		      }
		      if (!isContinue) {
		        break;
		      }
		    }
		  }
}
