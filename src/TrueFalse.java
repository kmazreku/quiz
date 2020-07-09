import java.util.ArrayList;
import java.util.Scanner;

public class TrueFalse extends Questions {
    private String answer;

    public TrueFalse (String questionCopy, int questPoints, String answer){
        super(questionCopy, questPoints);
        this.answer = answer;
        setQuestPoints(1);
    }
    @Override
    public void displayOptions(){
     System.out.println("True or False");

    }

    public boolean isCorrectAnswer (String userAnswer){
        if (userAnswer == answer.toLowerCase()){
            return true;
        }else {
            return false;
        }

    }

    @Override
    public int getAnswer(){
        Scanner input = new Scanner(System.in);
        System.out.println("What is the correct answer? True or False?");
        String userAnswer = input.nextLine().toLowerCase();
        if (isCorrectAnswer(userAnswer)){
            return 1;
        } else{
            return 0;
        }

    }

}
