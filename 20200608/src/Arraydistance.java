import java.util.HashMap;
import java.util.Scanner;

public class Arraydistance {
	private static String[] unitList = { "cm", "m", "inch", "feet", "yard", "mile"};
    private static double[] procList = { 1, 1*0.01, 1*0.3937007874015748, 1*0.32808398950, 1*0.010936132983, 1*0.000006213712};
    private static HashMap<String, Double> unitMap = new HashMap<String, Double>();

    public static void main(String[] args) {
        int uSize = unitList.length;
        for(int i=0;i<uSize;i++){
            unitMap.put(unitList[i], procList[i]);
        }
        Scanner input = new Scanner(System.in);
        System.out.print("param1 : ");      String in1 = input.nextLine();
        System.out.print("param2 : ");      String in2 = input.nextLine();
        System.out.print("param3 : ");      String in3 = input.nextLine();
        System.out.println(convert(in1, in2, in3));
    }

    private static String convert(String in1, String in2, String in3) {
        double input = Double.valueOf(in1);
        double unitValue, convertValue;
        if(unitMap.containsKey(in2) && unitMap.containsKey(in3)){
            unitValue = unitMap.get(in2);
            convertValue = unitMap.get(in3);
        }else{
            return "No unit in the registered list.";
        }
        return (int)(input / unitValue * convertValue) + " " + in3;
    }
}
