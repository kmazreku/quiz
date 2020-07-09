import java.util.ArrayList;
import java.util.Scanner;

public class MultiChoice extends Questions {
    private ArrayList<String> options ;
    private int answer ;


    public MultiChoice (String questionCopy, int questPoints, int answer, ArrayList<String> options){
        super(questionCopy, questPoints);
        this.answer=answer;
        this.options = options;
        setQuestPoints(1);
    }
    @Override
    public void displayOptions(){
        for (int i=0; i<options.size(); i++){
        System.out.println(options.get(i));
        }
    }

    public boolean isCorrectAnswer (int userAnswer){
        if (userAnswer == answer){
            return true;
        }else {
            return false;
        }

    }

    @Override
    public int getAnswer(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of the correct answer");
        int userAnswer = input.nextInt();
        if (isCorrectAnswer(userAnswer)){
             return 1;
        } else{
            return 0;
        }

    }

}
