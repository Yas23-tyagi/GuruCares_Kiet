package com.example.gurucares.activityclass;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.gurucares.R;
import com.example.gurucares.customadapters.question_custom_adapter;

public class Questions_n_Answers extends AppCompatActivity {

    RecyclerView questions;
    question_custom_adapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions_n__answers);


        questions = (RecyclerView) findViewById(R.id.recycler_questions);
        questions.setLayoutManager(new LinearLayoutManager(getApplicationContext(), RecyclerView.VERTICAL, false));
        adapter = new question_custom_adapter(this);
        questions.setAdapter(adapter);

    }
}