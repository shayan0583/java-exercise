public class MultiplechoiseQ extends Question{
    private String[] options;

    public MultiplechoiseQ( String questiontext, String[] options ,String correctanswer){
        super(questiontext,correctanswer);
        this.options=options;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Options : ");
        for (int i=0 ; options.length>i;i++){
            System.out.println((i+1)+" "+options[i]);
        }
    }
}
