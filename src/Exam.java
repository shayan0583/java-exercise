import java.util.Scanner;

public class Exam {
    private String title ;
    private Question[] questions;

    public Exam(String title ,Question[] questions){
        this.title=title;
        this.questions=questions;
    }

    public void startExam(){
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        int totalscore = questions.length;
        System.out.println("-------- "+title+" --------");

        for (int i=0; i <questions.length; i++){
            questions[i].display();
            System.out.println("Your Answer : ");
            String useranswer = scanner.nextLine();

            if (questions[i].checkanswer(useranswer)){
                System.out.println("Correct ✅");
                score++;
            }
            else{
                System.out.println("InCorrect ❌");
            }
        }
        System.out.println("Your Score : "+ score + "/ " + totalscore);
    }
}
