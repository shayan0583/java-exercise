public class TrueFalseQ extends Question{
    public TrueFalseQ(String questiontext , String correctanswer){
        super(questiontext,correctanswer);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("1. True");
        System.out.println("2. False");
    }
}
