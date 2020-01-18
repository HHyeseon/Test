package com.example.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Exam2Activity extends AppCompatActivity {
    EditText editText_content;
    EditText editText_content2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam2);

         editText_content = (EditText) findViewById(R.id.editText2);
         editText_content2 = (EditText) findViewById(R.id.editText3);

        Button button = (Button)findViewById(R.id.button);      //저장
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent = new Intent(Exam2Activity.this, MainActivity.class);
                    intent.putExtra("content1", editText_content.getText().toString());
                    intent.putExtra("content2", editText_content2.getText().toString());
                    startActivity(intent);

                }
            });



        Button button2 = (Button)findViewById(R.id.button2);            //취소
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(Exam2Activity.this, MainActivity.class);
                intent.putExtra("content1", editText_content.getText().toString());
                intent.putExtra("content2", editText_content2.getText().toString());
                startActivity(intent);
            }
        });

    }
}
