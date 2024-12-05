public class QuestionService{

    Question[] questions = new Question[2];

    public QuestionService(){
        questions[0] = new Question(1, "size of int : ", "2","4","6","8","4");
        questions[1] = new Question(2, "size of char : ", "2","4","6","8","2");
    }

    public void displayQuestions(){

        for(Question q : questions){
            System.out.println(q);
        }
    }
}