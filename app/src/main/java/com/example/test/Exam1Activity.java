package com.example.test;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Exam1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam1);
        setTitle("exam1");


        Button b = (Button)findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText e1 = (EditText)findViewById(R.id.editText);
                TextView t1 = (TextView)findViewById(R.id.textView);

                CharSequence s1= e1.getText().toString();
                CharSequence s2= t1.getText().toString();

                e1.setText(s2);
                t1.setText(s1);

            }
        });


    }
}
