import java.util.Scanner;

public class Quizz{

  private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int score= 0;

        score= askQuestionStringAnswerAndGetScore("Nom du formateur","Jules", score);
        score= askQuestionBooleanAnswerAndGetScore("Le formateur est'il brun",true, score);

        System.out.print("Votre score final est " + score);

    }

    private static int askQuestionStringAnswerAndGetScore(String question, String goodAnswer, int previousScore)  {

        System.out.println(question + "?");

        String userAnswer= input.nextLine();
        if(userAnswer.equals(goodAnswer)) {
          System.out.println("Réponse correcte !");
          return ++previousScore;
        }
        else
        {
          System.out.println("Réponse incorrecte ! La bonne réponse est " + goodAnswer + ".");
          return previousScore;
        }
    }

    private static int askQuestionBooleanAnswerAndGetScore(String question, boolean goodAnswer, int previousScore)  {

        System.out.println(question + " (O/N) ?");

        char userInput= input.next().charAt(0);
        boolean userAnswer= (userInput == 'O' || userInput == 'o');

        if(userAnswer = goodAnswer){
          System.out.println("Reponse correcte !");
          return ++previousScore;
        }
        else
        {
            System.out.println("Reponse incorrecte ! La bonne réponse " + (goodAnswer ? "Oui" : "Non"));
            return previousScore;
        }
    }


}
