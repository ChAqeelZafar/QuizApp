package com.example.johnwick.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    TextView insView ;
    TextView instructionView ;
    Button start ;
    EditText userName ;
    String name ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        insView = findViewById(R.id.main_text_ins1) ;
        start = findViewById(R.id.main_button_start);
        userName = findViewById(R.id.main_edit_name) ;
        instructionView = findViewById(R.id.main_text_instruction) ;


        insView.setText("Enter User Name and\nPress start for the Quiz.");

        start.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        if (view == start) {

            if ((userName.getText().toString()).equals("") || (userName.getText().toString()).equals(" ") || (userName.getText().toString()).equals("  ") || (userName.getText().toString()).equals("   ")) {
                Toast.makeText(this, "Enter User Name", Toast.LENGTH_SHORT).show();
            }
            else{

                name = userName.getText().toString() ;
                Bundle bundle = new Bundle() ;
                bundle.putString("nameEntered",name);
                Intent intent = new Intent(this, Question1.class) ;
                intent.putExtras(bundle);
                startActivity(intent) ;






            }







        }

    }
}
