import java.util.Scanner;

public class QuestionService{

    Question[] questions = new Question[2];
    String selection[] = new String[2];

    public QuestionService(){
        questions[0] = new Question(1, "size of int : ", "2","4","6","8","4");
        questions[1] = new Question(2, "size of char : ", "2","4","6","8","2");
    }

    public void playQuiz(){
        int i = 0;
        for(Question q : questions){
            System.out.print("Question No : " + q.getId() +") ");
            System.out.println(" " + q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());
            
            System.out.println("Enter your answer : ");
            Scanner sc = new Scanner(System.in);
            selection[i++] = sc.nextLine();
        }

        //See what user entered
        /* 
        System.out.print("User Entered : ");
        for(String s : selection){
            System.out.print(s + " ");
        }
        */
    }

    public void printScore(){
        int score = 0;

        for(int i = 0; i < questions.length; i++){
            Question que = questions[i];

            String actualAnswer = que.getAnswer();
            String userAnswer = selection[i];


            if(actualAnswer.equals(userAnswer)){
                score++;
            }
        }

        System.out.println("Your score is : " + score);
    }
}