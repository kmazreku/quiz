import java.util.ArrayList;
import java.util.Scanner;

public class Checkbox extends Questions{
    private ArrayList<String> options ;
    private ArrayList<Integer> answers ;
    public Checkbox (String questionCopy, int questPoints, ArrayList<String> options,ArrayList<Integer> answers){
        super(questionCopy, questPoints);
        this.options=options;
        this.answers=answers;
        setQuestPoints(this.answers.size());
    }
    @Override
    public void displayOptions(){
        for (int i=0; i<options.size(); i++){
            System.out.println(options.get(i));
        }
    }

    public int correctAnswers(String[] userAnswersArr){
        int correctAnswer =0;
        for (int i=0; i<userAnswersArr.length; i++){
            if(answers.contains(Integer.parseInt(userAnswersArr[i]))){
                correctAnswer++;
            }
        }
        return correctAnswer;
    }
    @Override
    public int getAnswer(){
        Scanner input = new Scanner(System.in);
        System.out.println("There are multiple correct options for this question. Enter the number of each correct answer separated with ','.");
        String userAnswer = input.nextLine();
        String[] userAnswerArr = userAnswer.split(",");
        return correctAnswers(userAnswerArr);
    }


}
