package com.example.test;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = this.getIntent(); //데이터 수신
        Bundle bundle = intent.getExtras();

        if(bundle != null){
            String txt1= intent.getStringExtra("content1");
            TextView t1 = (TextView)findViewById(R.id.textView1);
            t1.setText(String.valueOf(txt1));
      //  t1.setText(txt1);


            String txt2= intent.getStringExtra("content2");
            TextView t2 = (TextView)findViewById(R.id.textView2);
           t2.setText(String.valueOf(txt2));
       //    t2.setText(txt2);
        }

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
                /*
                EditText e = (EditText) findViewById(R.id.editText2);
                e.setText("");
                EditText e2 = (EditText) findViewById(R.id.editText3);
                e2.setText("");
                */
                Intent intent = new Intent(MainActivity.this, Exam2Activity.class);
                startActivity(intent);
            }
        };
        button2.setOnClickListener(listener2);

    }


}
