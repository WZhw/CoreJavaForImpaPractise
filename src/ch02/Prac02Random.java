package ch02;

import java.util.Random;
import java.util.Scanner;

public class Prac02Random {
    

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String inputLine = "";
        try{
            while(in.hasNextLine()){
                inputLine = in.nextLine();
                long seed = Long.parseLong(inputLine);
                Random random = new Random(seed);
                System.out.println(random.nextInt());
            }
        }
        catch (Exception e){
            System.out.println(e.toString());
        }
        finally {
            in.close();
        }
    }
}
