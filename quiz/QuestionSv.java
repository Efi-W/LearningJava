package quiz;

import java.util.Scanner;

public class QuestionSv
{
    Questions[] questions = new Questions[5];
    String choice[] = new String[5];

    public QuestionSv()
    {
        questions[0] = new Questions(1, "1: ", "a", "b", "c", "d", "a");
        questions[1] = new Questions(2, "2: ", "a", "b", "c", "d", "b");
        questions[2] = new Questions(3, "3: ", "a", "b", "c", "d", "c");
        questions[3] = new Questions(4, "4: ", "a", "b", "c", "d", "d");
        questions[4] = new Questions(5, "5: ", "a", "b", "c", "d", "a");


    }



    public void ShowQuestion()
    {
        int i = 0;
        for(Questions q : questions){
            System.out.println("Question Num: " + q.getId());
            System.out.println("Question Num: " + q.getQuestion());
            System.out.println("Question Num: " + q.getOpt1());
            System.out.println("Question Num: " + q.getOpt2());
            System.out.println("Question Num: " + q.getOpt3());
            System.out.println("Question Num: " + q.getOpt4());

            Scanner sc = new Scanner(System.in);
            choice[i] = sc.nextLine();
            i++;

        }

        for(String s: choice){
            System.out.println(s);
        }


    }

    public void printScore(){
        int score = 0;

        for(int i = 0; i< questions.length;i++){
            Questions q1 = questions[i];
            String answer = q1.getAnswer();
            String usrAnswer = choice[i];

            if(answer.equals(usrAnswer)){
                score++;
            }

        }

        System.out.println("Score " + score);


    }
}
