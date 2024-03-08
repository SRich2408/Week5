import java.util.Scanner;
import java.text.NumberFormat;

public class sleep {
    public static void main (String[] args){
        
        NumberFormat number = NumberFormat.getIntegerInstance();

        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter your birthday: \nYear: ");
        int year = userInput.nextInt();
        System.out.println("Month: ");
        int month = userInput.nextInt();
        System.out.println("Day: ");
        int day = userInput.nextInt();
        
        System.out.println("Enter today's date: \nYear: ");
        int currentYear = userInput.nextInt();
        System.out.println("Month: ");
        int currentMonth = userInput.nextInt();
        System.out.println("Day: ");
        int currentDay = userInput.nextInt();
        userInput.close();

        int numberOfYearsInDays = ((currentYear - year)*365)+((currentMonth -month)*30 + (currentDay - day));
        int timeAsleep = numberOfYearsInDays * 8; 

        System.out.println("You have been alive for " + numberOfYearsInDays +" days.");
        System.out.println("You have been asleep for " + (number.format(timeAsleep)) + " " +"hours");


        
        

    }
}
