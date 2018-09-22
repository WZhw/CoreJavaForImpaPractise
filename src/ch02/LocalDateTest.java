package ch02;

import java.time.LocalDate;

public class LocalDateTest {
    public static void main(String[] args){
        int year = 2018, month = 9, day = 11;
        LocalDate date = LocalDate.of(year, month, day);
        System.out.println("Today is " + date.toString());
        date = date.plusDays(1);
        System.out.println("Tomorrow is " + date.toString());
        while(date.getMonthValue() == month){
            System.out.printf(" Day:%d , Week: %s", date.getDayOfMonth(), date.getDayOfWeek().toString());
            if(date.getDayOfMonth() % 7 == 0){
                System.out.println("");
            }
            date = date.plusDays(1);
        }
    }
}
