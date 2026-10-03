
public class Question {
    private String questiontext;
    private String correctanswer;

    public Question(String questiontext, String correctanswer){
        this.correctanswer=correctanswer;
        this.questiontext=questiontext;
    }
    public void display(){
     System.out.println("Question = "+ questiontext);
    }
    public boolean checkanswer(String useranswer){
        if (useranswer.equals(correctanswer)){
            return true;
        }
        else {
            return false;
        }
    }
}
