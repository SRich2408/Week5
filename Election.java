import java.util.Scanner;



public class Election {
    public static void main (String[] args){

        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter Awbrey's votes for NY, NJ, CT: ");
        double votesNYA = userInput.nextDouble();
        double votesNJA = userInput.nextDouble();
        double votesCTA = userInput.nextDouble();
        System.out.println("Enter Martinez's votes for NY, NJ, CT: ");
        double votesNYM = userInput.nextDouble();
        double votesNJM = userInput.nextDouble();
        double votesCTM = userInput.nextDouble();

        userInput.close();

        double avgAwbrey = votesNYA + votesNJA + votesCTA;
        double avgMartinez = votesNYM + votesNJM + votesCTM;

        double percAwbrey = avgAwbrey / (avgAwbrey + avgMartinez);
        double percMartinez = avgMartinez / (avgAwbrey + avgMartinez);

        System.out.println("Candidate\nAwbrey\nMartinez ");
        
        

    }
}