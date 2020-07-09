import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class QuizRunner {
    public static void main (String[] args){
        Quiz newQuiz = new Quiz(new ArrayList<>());
        ArrayList<String> optionsAnswer1 = new ArrayList<>(Arrays.asList("1- name", "2- age", "3- mass", "4- species"));
        ArrayList<Integer> correctAnswers1= new ArrayList<>(Arrays.asList(1,4));
        Checkbox qst1 = new Checkbox(
                "Assume that we define a Pet class that uses the fields name, age, mass, and species.\n" +
                "Assuming you do not give your pet away, which of these fields should be declared final? (There may be more than one).", 2,optionsAnswer1, correctAnswers1);

        newQuiz.addQuestion(qst1);

        ArrayList<String> optionsAnswer2 = new ArrayList<>(Arrays.asList("1- The makeNoise() method can be accessed outside of the Pet class, while the increaseAge() method cannot.", "2- Each Pet object carries a copy of the makeNoise() method but NOT a copy of the increaseAge() method.", "3- The increaseAge() method can be accessed outside of the Pet class, while the makeNoise() method cannot.", "4- Each Pet object carries a copy of the increaseAge() method but NOT a copy of the makeNoise() method."));
        MultiChoice qst2 = new MultiChoice("Assume that we add two methods to a Pet class—public String makeNoise() and public static void increaseAge(). Which of the following statements is true? ",1,2,optionsAnswer2);
        newQuiz.addQuestion(qst2);

        TrueFalse qst3 = new TrueFalse("Any of the Pet fields should be declared static?", 1, "false");
        newQuiz.addQuestion(qst3);

        newQuiz.runQuiz();
        newQuiz.gradeQuiz();
    }
}
