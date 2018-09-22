package ch02;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class Calendar {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String inputLine = new String();
        try{
            while(in.hasNextLine()){
                inputLine = in.nextLine();
                String[] dateArray = inputLine.split("\\s+");
                int year = Integer.parseInt(dateArray[0]);
                int month = Integer.parseInt(dateArray[1]);
                int day = Integer.parseInt(dateArray[2]);
                LocalDate date = LocalDate.of(year, month, day);
                LocalDate firstDayOfThisMonth = LocalDate.of(year, month, day);
                displayThisMonthCalendar(firstDayOfThisMonth);
            }

        }
        catch (Exception e){
            System.out.println(e.toString());
        }
        finally {
            in.close();
        }
    }

    public static void displayThisMonthCalendar(LocalDate firstDayOfThisMonth){
        DayOfWeek firstDayOfWeek = firstDayOfThisMonth.getDayOfWeek();
        int firstDayOfWeekValue = firstDayOfWeek.getValue();
        System.out.println("Sun Mon Tue Wed Thu Fri Sat ");
        int tabValue = firstDayOfWeekValue % 7;
        for(int i = 0; i < tabValue; i++){
            System.out.print("    ");
        }
        int lengthOfMonth = firstDayOfThisMonth.lengthOfMonth();
        for(int i = 1; i <= lengthOfMonth; i++){
            System.out.printf("%2d  ", i);
            if((i + tabValue) % 7 == 0){
                System.out.println();
            }
        }
        System.out.println();
    }
}
