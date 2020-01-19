package com.example.test;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button)findViewById(R.id.exam1);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(MainActivity.this, Exam1Activity.class);
                startActivity(intent);
            }
        };
        button.setOnClickListener(listener);

        Button button2 = (Button)findViewById(R.id.exam2);
        View.OnClickListener listener2 = new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(MainActivity.this, Exam2Activity.class);
                startActivity(intent);
            }
        };
        button2.setOnClickListener(listener2);

    }

}
