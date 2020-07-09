import java.util.ArrayList;

public class Quiz {
    private ArrayList<Questions> questions;
    private int totalScore;
    private int score;

    public Quiz(ArrayList<Questions> questions){
        this.questions = questions;
        this.score=0;
        this.totalScore =0;
        for (int i=0; i<questions.size(); i++){
            this.totalScore = this.totalScore + questions.get(i).getQuestPoints();
        }

    }
    public void addQuestion (Questions newQuestion){
        this.questions.add(newQuestion);
        this.totalScore = this.totalScore + newQuestion.getQuestPoints();
    }

    public void runQuiz(){
        for (int i=0; i<questions.size(); i++){
            questions.get(i).setQuestionCopy();
            questions.get(i).displayOptions();
            int pts = questions.get(i).getAnswer();
            updateScore(pts);
        }
    }
    public void updateScore (int points){
        this.score =this.score + points;
    }

    public void gradeQuiz(){
        System.out.println("Congratulations, your scored:" +score+"/"+totalScore);
    }
}
