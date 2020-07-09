import java.util.ArrayList;

public abstract class Questions {
   private String questionCopy;
   private int questPoints;

     public Questions(String questionCopy, int questPoints){
         this.questionCopy= questionCopy;
         this.questPoints = questPoints;
     }


    public void setQuestionCopy(){
         System.out.println(questionCopy);
    }

    public int getQuestPoints() {
        return questPoints;
    }

    public void setQuestPoints(int questPoints) {
        this.questPoints = questPoints;
    }

   public abstract void displayOptions();

   public abstract int getAnswer();
}
