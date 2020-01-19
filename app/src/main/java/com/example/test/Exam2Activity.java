package com.example.test;


import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.Button;
import android.widget.EditText;

public class Exam2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam2);
        setTitle("exam2");

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(R.string.test);
        builder.setMessage(R.string.data);
        builder.setPositiveButton(R.string.one, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int index) {
                EditText e = (EditText) findViewById(R.id.editText2);
                e.setText("하나");

            }
        });

        builder.setNegativeButton(R.string.two, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int index) {
                EditText e = (EditText) findViewById(R.id.editText2);
                e.setText("둘");

            }
        });

        AlertDialog dialog = builder.create();
        dialog.show();



    }

    public void button_clicked(View button2){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(R.string.test);
        builder.setMessage(R.string.data);
        builder.setPositiveButton(R.string.one, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int index) {
                EditText e = (EditText) findViewById(R.id.editText2);
                e.setText("하나");

            }
        });

        builder.setNegativeButton(R.string.two, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int index) {
                EditText e = (EditText) findViewById(R.id.editText2);
                e.setText("둘");

            }
        });

        AlertDialog dialog = builder.create();
        dialog.show();
    }
}
