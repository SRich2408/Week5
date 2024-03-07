import java.util.Scanner;


public class timeConversion {
    public static void main (String[] args){
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Enter time in minutes: ");
        int timeInMin = userInput.nextInt();
        int onesMin = (timeInMin % 60) % 10;
        int tensMin = (timeInMin % 60) / 10;
        int timeInHours = (timeInMin - onesMin) / 60;
        userInput.close();
        
        System.out.println("The time in hours is " + timeInHours + ":" + tensMin + onesMin);

    }
}
