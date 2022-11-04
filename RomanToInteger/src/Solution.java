import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String romenNumber = scanner.nextLine();
        int[] integerArray = new int[romenNumber.length()+1];


        for (int i = 0; i < romenNumber.length(); i++){
            integerArray[i] = findValue(String.valueOf(romenNumber.charAt(i)));
        }
        integerArray[integerArray.length-1] = 0;

        int integerValue = 0;
        for (int i = 0; i < integerArray.length-1; i++){
            if (integerArray[i+1] != 0){
                if (integerArray[i] < integerArray[i+1]){
                    integerValue += integerArray[i+1] - integerArray[i];
                    i++;
                }
                else {
                    integerValue += integerArray[i];
                }
            }
            else {
                integerValue += integerArray[i];
            }
        }
        System.out.println("Output: "+integerValue);

//        System.out.println(".................");
//        for (int i:integerArray) {
//            System.out.println(i);
//        }
    }
    static int findValue(String letter){
        return switch (letter) {
            case "I" -> 1;
            case "V" -> 5;
            case "X" -> 10;
            case "L" -> 50;
            case "C" -> 100;
            case "D" -> 500;
            case "M" -> 1000;
            default -> 0;
        };
    }
}