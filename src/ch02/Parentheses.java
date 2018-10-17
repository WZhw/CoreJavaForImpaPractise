package ch02;

import java.util.Scanner;

public class Parentheses {

    public static final int ParentheseType = 3;
    public static final String ParentheseSample = "([{)]}";

    public static boolean isLegal(String inputLine) {
        boolean result = false;
        int[] ParentheseCodePointArray = new int[ParentheseSample.codePointCount(0, ParentheseSample.length())];
        for (int i = 0; i < ParentheseCodePointArray.length; i++) {
            ParentheseCodePointArray[i] = ParentheseSample.codePointAt(ParentheseSample.offsetByCodePoints(0, i));
        }
        int[] inputCodePoints = inputLine.codePoints().toArray();
        LinklistStack<Integer> testStack = new LinklistStack<>();
        for (int i : inputCodePoints) {
            for (int j = 0; j < ParentheseType; j++) {
                if (i == ParentheseCodePointArray[j]) {
                    testStack.push(i);
                } else if (i == ParentheseCodePointArray[j + ParentheseType]) {
                    if (testStack.top() == ParentheseCodePointArray[j]) {
                        testStack.pop();
                    } else {
                        result = false;
                        return result;
                    }
                } else {

                }
            }
        }
        return testStack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputLine = "";
        boolean result = false;
        while(in.hasNextLine()){
            inputLine = in.nextLine();
            String resultOutput = isLegal(inputLine) ? "ture" : "false";
            System.out.println(resultOutput);
        }
    }
}
