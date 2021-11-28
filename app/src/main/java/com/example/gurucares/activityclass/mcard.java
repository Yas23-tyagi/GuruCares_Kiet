package com.example.gurucares.activityclass;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.gurucares.R;
import com.example.gurucares.fragmentclass.AcademicInfo;
import com.example.gurucares.fragmentclass.ProfileInfo;
import com.example.gurucares.fragmentclass.Studentid;

public class mcard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mcard);

        Button btn1= (Button) findViewById(R.id.btn1);
        Button btn2=(Button) findViewById(R.id.btn2);
        Button btn3= (Button) findViewById(R.id.btn3);
        FragmentManager manager=getSupportFragmentManager();
        FragmentTransaction transaction=manager.beginTransaction();
        transaction.replace(R.id.Frame1, new Studentid());
        transaction.commit();

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager manager=getSupportFragmentManager();
                FragmentTransaction transaction=manager.beginTransaction();
                transaction.replace(R.id.Frame1, new Studentid());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager manager=getSupportFragmentManager();
                FragmentTransaction transaction=manager.beginTransaction();
                transaction.replace(R.id.Frame1, new ProfileInfo());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager manager=getSupportFragmentManager();
                FragmentTransaction transaction=manager.beginTransaction();
                transaction.replace(R.id.Frame1, new AcademicInfo());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

    }
}