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

        double totalAwbrey = votesNYA + votesNJA + votesCTA;
        double totalMartinez = votesNYM + votesNJM + votesCTM;

        double percentAwbrey = totalAwbrey / (totalAwbrey + totalMartinez);
        double percentMartinez = totalMartinez / (totalAwbrey + totalMartinez);

        System.out.println("Candidate   Votes    Percentage\nAwbrey      " + totalAwbrey + "    " + percentAwbrey +" %" + "\nMartinez    " + totalMartinez + "    " + percentMartinez + " %" + "\n\nTOTAL VOTES = " + (totalAwbrey + totalMartinez));
        
        

    }
}