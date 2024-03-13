// Sebastian Richardson
// Date: 3/13/2024
// Project: Building

import java.util.Scanner;
import java.text.NumberFormat;

public class Building {
    public static void main (String[] args){
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("How many poles do you need? ");
        int poles = userInput.nextInt();
        userInput.close();

        double volume = 3.14 * 1.5 * 1.5 * 5; 
        double concreteNeeded = poles * volume;
        double totalNum = (concreteNeeded/ 27) * 12.98;

        NumberFormat money = NumberFormat.getCurrencyInstance();
        System.out.println("The cost of concrete will be: " + money.format(totalNum));

    }
}
