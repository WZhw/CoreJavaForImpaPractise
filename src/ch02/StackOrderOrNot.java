package ch02;

import java.util.Scanner;

public class StackOrderOrNot {

    public static final int MAXN = 101;
    public static boolean isLegal(int[] inputNumberArray, int inputLength, int[] orderArray){
        boolean ok = true;
        LinklistStack<Integer> testStack = new LinklistStack<>();
        int orderArrayPointer = 0;
        int inputNumberArrayPointer = 0;
        while(inputNumberArrayPointer < inputLength){
            if(!testStack.isEmpty() && testStack.top() == inputNumberArray[inputNumberArrayPointer]) {
                testStack.pop();
                inputNumberArrayPointer++;
            }
            else if(orderArrayPointer <= inputNumberArray[inputNumberArrayPointer]){
                //while(orderArrayPointer <= inputNumberArray[inputNumberArrayPointer]){
                testStack.push(orderArray[orderArrayPointer++]);
                //}
            }
            else{
                ok = false;
                break;
            }
        }
        return ok;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputLine = "";
        int[] inputNumberArray = new int[MAXN];
        int[] orderArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        while(in.hasNextLine()){
            inputLine = in.nextLine();
            String[] inputNumber = inputLine.split("\\s+");
            int inputLength = 0;
            for(String s : inputNumber){
                inputNumberArray[inputLength++] = Integer.parseInt(s);
            }
            String result = isLegal(inputNumberArray, inputLength, orderArray) ? "True" : "False";
            System.out.println(result);
        }
    }
}
