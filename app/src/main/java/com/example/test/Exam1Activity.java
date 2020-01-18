package com.example.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.support.v7.widget.helper.ItemTouchHelper;


import java.util.ArrayList;

public class Exam1Activity extends AppCompatActivity {

    MyRecyclerViewAdapter myRecyclerViewAdapter;
    ArrayList<Item> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam1);


        arrayList = new ArrayList<Item>();
        arrayList.add(new Item("one", 1));


        myRecyclerViewAdapter = new MyRecyclerViewAdapter(this, arrayList);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(myRecyclerViewAdapter);
        new ItemTouchHelper(new MyRecyclerViewTouchCallback()).attachToRecyclerView(recyclerView);

        Button b = (Button)findViewById(R.id.btnAdd);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                EditText e = (EditText) findViewById(R.id.editText);
                String s = e.getText().toString();
                int n= arrayList.size()+1;
                e.setText("");

                arrayList.add(new Item(s, n));
                myRecyclerViewAdapter.notifyDataSetChanged();
            }
        });

    }
}
