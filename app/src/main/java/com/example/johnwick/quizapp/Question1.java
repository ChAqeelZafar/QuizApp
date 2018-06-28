package com.example.johnwick.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Question1 extends AppCompatActivity implements View.OnClickListener{
    String ques[] = new String[5];
    String ans[] = new String[5];
    int score = 0 ;
    int totalScore = 50 ;
    int loop1 = 0 ;


    TextView question ;
    TextView heading ;
    Button o1 ;
    Button o2 ;
    Button o3 ;
    Button o4 ;
    TextView scoring ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);

        ques[0] = "0 + 1 = ?" ;
        ans[0] = "1" ;
        ques[1] = "1 + 1 = ?" ;
        ans[1] = "2" ;
        ques[2] = "2 + 1 = ?" ;
        ans[2] = "3" ;
        ques[3] = "3 + 1 = ?" ;
        ans[3] = "4" ;
        ques[4] = "4 + 1 = ?" ;
        ans[4] = "5" ;

        question = findViewById(R.id.q1_text_question) ;
        heading = findViewById(R.id.q1_text_haed) ;
        o1 = findViewById(R.id.q1_button_o1);
        o2 = findViewById(R.id.q1_button_o2);
        o3 = findViewById(R.id.q1_button_o3);
        o4 = findViewById(R.id.q1_button_o4);
        scoring = findViewById(R.id.q1_text_score);
        scoring.setVisibility(View.INVISIBLE);

        method(loop1);







    }

    void method(int i){

        Random rand = new Random();
       heading.setText("Question no " + (i+1));
        question.setText(ques[i]) ;
       // String ch = ans[i] ;
        int correct = rand.nextInt(3);
        //heading.setText((correct + 1) + "");
        //check.setText("Question is " + ques[i] + " & Ans is " + ans[i] + " & \nCorrect option is " + correct + " & SCore is " + score);
        if(correct == 0){
            o1.setText(ans[i]);
        }
        if(correct == 1){
            o2.setText(ans[i]);
        }
        if(correct == 2){
            o3.setText(ans[i]);
        }
        if(correct == 3){
            o4.setText(ans[i]);
        }




        if(correct != 0){

            boolean flag = true ;
            int r ;
            do {
                r = rand.nextInt(10) ;
                if (o1.getText().equals(r + "") || o2.getText().equals(r + "") || o3.getText().equals(r + "") || o4.getText().equals(r + "")) {
                    flag = true ;
                }else{
                    flag = false ;
                }
            }while(flag==true);
            o1.setText(r+"");
        }
        if(correct != 1){
            boolean flag = true ;
            int r ;
            do {
                r = rand.nextInt(10) ;
                if (o1.getText().equals(r + "") || o2.getText().equals(r + "") || o3.getText().equals(r + "") || o4.getText().equals(r + "")) {
                    flag = true ;
                }
                else{
                    flag = false ;
                }
            }while(flag==true);
            o2.setText(r+"");
        }
        if(correct != 2){
            boolean flag = true ;
            int r ;
            do {
                r = rand.nextInt(10) ;
                if (o1.getText().equals(r + "") || o2.getText().equals(r + "") || o3.getText().equals(r + "") || o4.getText().equals(r + "")) {
                    flag = true ;
                }else{
                    flag = false ;
                }
            }while(flag==true);
            o3.setText(r+"");
        }
        if(correct != 3){
            boolean flag = true ;
            int r ;
            do {
                r = rand.nextInt(10) ;
                if (o1.getText().equals(r + "") || o2.getText().equals(r + "") || o3.getText().equals(r + "") || o4.getText().equals(r + "")) {
                    flag = true ;
                }else{
                    flag = false ;
                }
            }while(flag==true);
            o4.setText(r+"");
        }

        o1.setOnClickListener(this);
        o2.setOnClickListener(this);
        o3.setOnClickListener(this);
        o4.setOnClickListener(this);







    }

    @Override
    public void onClick(View view) {

            if (view == o1) {
                if ((o1.getText()).equals(ans[loop1])) {
                    score += 10;
                    Toast.makeText(this,"correct", Toast.LENGTH_SHORT).show();
                    loop1 += 1;
                    if (loop1 == 5) {
                        heading.setText("Result");
                        o1.setVisibility(View.GONE);
                        o2.setVisibility(View.GONE);
                        o3.setVisibility(View.GONE);
                        o4.setVisibility(View.GONE);
                        question.setVisibility(View.GONE);
                        scoring.setVisibility(View.VISIBLE);
                        scoring.setText("Total score is " + totalScore + "\n Your Score is " + score);

                        //o1.setVisibility();
                    } else {
                        //Toast.makeText(this,"incorrect", Toast.LENGTH_SHORT).show();
                        method(loop1);
                    }
                }
                else {
                    loop1 += 1;
                    if (loop1 == 5) {
                        heading.setText("Result");
                        o1.setVisibility(View.GONE);
                        o2.setVisibility(View.GONE);
                        o3.setVisibility(View.GONE);
                        o4.setVisibility(View.GONE);
                        question.setVisibility(View.GONE);
                        scoring.setVisibility(View.VISIBLE);
                        scoring.setText("Total score is " + totalScore + "\n Your Score is " + score);

                        //o1.setVisibility();
                    } else {
                        Toast.makeText(this,"incorrect", Toast.LENGTH_SHORT).show();
                        method(loop1);
                    }
                }




            } else if (view == o2) {
                if ((o2.getText()).equals(ans[loop1])) {
                    score += 10;
                    Toast.makeText(this,"correct", Toast.LENGTH_SHORT).show();
                    loop1 += 1;
                    if (loop1 == 5) {
                        heading.setText("Result");
                        o1.setVisibility(View.GONE);
                        o2.setVisibility(View.GONE);
                        o3.setVisibility(View.GONE);
                        o4.setVisibility(View.GONE);
                        question.setVisibility(View.GONE);
                        scoring.setVisibility(View.VISIBLE);
                        scoring.setText("Total score is " + totalScore + "\n Your Score is " + score);

                        //o1.setVisibility();
                    } else {
                        //Toast.makeText(this,"incorrect", Toast.LENGTH_SHORT).show();
                        method(loop1);
                    }
                }
                else {
                    loop1 += 1;
                    if (loop1 == 5) {
                        heading.setText("Result");
                        o1.setVisibility(View.GONE);
                        o2.setVisibility(View.GONE);
                        o3.setVisibility(View.GONE);
                        o4.setVisibility(View.GONE);
                        question.setVisibility(View.GONE);
                        scoring.setVisibility(View.VISIBLE);
                        scoring.setText("Total score is " + totalScore + "\n Your Score is " + score);

                        //o1.setVisibility();
                    } else {
                        Toast.makeText(this,"incorrect", Toast.LENGTH_SHORT).show();
                        method(loop1);
                    }
                }



            } else if (view == o3) {
                if ((o3.getText()).equals(ans[loop1])) {
                    score += 10;
                    Toast.makeText(this,"correct", Toast.LENGTH_SHORT).show();
                    loop1 += 1;
                    if (loop1 == 5) {
                        heading.setText("Result");
                        o1.setVisibility(View.GONE);
                        o2.setVisibility(View.GONE);
                        o3.setVisibility(View.GONE);
                        o4.setVisibility(View.GONE);
                        question.setVisibility(View.GONE);
                        scoring.setVisibility(View.VISIBLE);
                        scoring.setText("Total score is " + totalScore + "\n Your Score is " + score);

                        //o1.setVisibility();
                    } else {
                        //Toast.makeText(this,"incorrect", Toast.LENGTH_SHORT).show();
                        method(loop1);
                    }
                }
                else {
                    loop1 += 1;
                    if (loop1 == 5) {
                        heading.setText("Result");
                        o1.setVisibility(View.GONE);
                        o2.setVisibility(View.GONE);
                        o3.setVisibility(View.GONE);
                        o4.setVisibility(View.GONE);
                        question.setVisibility(View.GONE);
                        scoring.setVisibility(View.VISIBLE);
                        scoring.setText("Total score is " + totalScore + "\n Your Score is " + score);

                        //o1.setVisibility();
                    } else {
                        Toast.makeText(this,"incorrect", Toast.LENGTH_SHORT).show();
                        method(loop1);
                    }
                }



            } else if (view == o4) {
                if ((o4.getText()).equals(ans[loop1])) {
                    score += 10;
                    Toast.makeText(this,"correct", Toast.LENGTH_SHORT).show();
                    loop1 += 1;
                    if (loop1 == 5) {
                        heading.setText("Result");
                        o1.setVisibility(View.GONE);
                        o2.setVisibility(View.GONE);
                        o3.setVisibility(View.GONE);
                        o4.setVisibility(View.GONE);
                        question.setVisibility(View.GONE);
                        scoring.setVisibility(View.VISIBLE);
                        scoring.setText("Total score is " + totalScore + "\n Your Score is " + score);

                        //o1.setVisibility();
                    } else {
                        //Toast.makeText(this,"incorrect", Toast.LENGTH_SHORT).show();
                        method(loop1);
                    }
                }
                else {
                    loop1 += 1;
                    if (loop1 == 5) {
                        heading.setText("Result");
                        o1.setVisibility(View.GONE);
                        o2.setVisibility(View.GONE);
                        o3.setVisibility(View.GONE);
                        o4.setVisibility(View.GONE);
                        question.setVisibility(View.GONE);
                        scoring.setVisibility(View.VISIBLE);
                        scoring.setText("Total score is " + totalScore + "\n Your Score is " + score);

                        //o1.setVisibility();
                    } else {
                        Toast.makeText(this,"incorrect", Toast.LENGTH_SHORT).show();
                        method(loop1);
                    }
                }
            }


    }
}
