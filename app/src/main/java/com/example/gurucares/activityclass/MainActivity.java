package com.example.gurucares.activityclass;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.gurucares.R;
import com.example.gurucares.fragmentclass.User;
import com.example.gurucares.fragmentclass.Attendance;
import com.example.gurucares.fragmentclass.Dash;
import com.example.gurucares.fragmentclass.Home;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;

public class MainActivity extends AppCompatActivity {

    FirebaseDatabase db;
    DatabaseReference parent;
    FirebaseStorage fs;
    Task<Uri> parentstorage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView homebtn = (ImageView) findViewById(R.id.home);
        ImageView attendancebtn = (ImageView) findViewById(R.id.attendance);
        ImageView dashbtn = (ImageView) findViewById(R.id.dash);
        ImageView userbtn = (ImageView) findViewById(R.id.user);


        //Fetching data from login java file
        Intent i= getIntent();
        Bundle b = i.getExtras();
        String username = (String) b.get("username");
        String userid = (String) b.get("userid");
        String studentcode = username.substring(0,3);
        //String studentcode = "200";
        String gradename = (String) b.get("gradename");
        String sectionname = (String) b.get("sectionname");


        //Sending it to home fragment
        Bundle bundle = new Bundle();
        bundle.putString("username", username);
        bundle.putString("userid", userid);
        bundle.putString("check", "false");
        bundle.putInt("position", 99);
        bundle.putString("gradename", gradename);
        bundle.putString("sectionname", sectionname);


        if(studentcode.equals("100"))
        {
            FragmentManager m = getSupportFragmentManager();
            FragmentTransaction t = m.beginTransaction();
            Fragment Home = new Home();
            Home.setArguments(bundle);
            t.replace(R.id.fragment, Home);
            t.commit();
            homebtn.setImageResource(R.drawable.homecolor);
        }

        else if(studentcode.equals("200"))
        {
            FragmentManager m = getSupportFragmentManager();
            FragmentTransaction t = m.beginTransaction();
            Fragment Home = new Home();
            Home.setArguments(bundle);
            t.replace(R.id.fragment, Home);
            t.commit();
            homebtn.setImageResource(R.drawable.homecolor);
        }



        homebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(studentcode.equals("100"))
                {

                    FragmentManager m = getSupportFragmentManager();
                    FragmentTransaction t = m.beginTransaction();
                    Fragment Home = new Home();
                    Home.setArguments(bundle);
                    t.replace(R.id.fragment, Home);
                    t.commit();
                    homebtn.setImageResource(R.drawable.homecolor);
                    attendancebtn.setImageResource(R.drawable.attendance);
                    dashbtn.setImageResource(R.drawable.dashboard);
                    userbtn.setImageResource(R.drawable.user);

                }
                else if(studentcode.equals("200"))
                {
                    FragmentManager m = getSupportFragmentManager();
                    FragmentTransaction t = m.beginTransaction();
                    Fragment Home = new Home();
                    Home.setArguments(bundle);
                    t.replace(R.id.fragment, Home);
                    t.commit();
                    homebtn.setImageResource(R.drawable.homecolor);
                    homebtn.setImageResource(R.drawable.homecolor);
                    attendancebtn.setImageResource(R.drawable.attendance);
                    dashbtn.setImageResource(R.drawable.dashboard);
                    userbtn.setImageResource(R.drawable.user);


                }

            }
        });



        attendancebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentManager m = getSupportFragmentManager();
                FragmentTransaction t = m.beginTransaction();
                t.replace(R.id.fragment, new Attendance());
                t.commit();
                homebtn.setImageResource(R.drawable.home);
                attendancebtn.setImageResource(R.drawable.attendancecolor);
                dashbtn.setImageResource(R.drawable.dashboard);
                userbtn.setImageResource(R.drawable.user);
            }
        });

        dashbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentManager m = getSupportFragmentManager();
                FragmentTransaction t = m.beginTransaction();
                t.replace(R.id.fragment, new Dash());
                t.commit();
                homebtn.setImageResource(R.drawable.home);
                attendancebtn.setImageResource(R.drawable.attendance);
                dashbtn.setImageResource(R.drawable.dashboardcolor);
                userbtn.setImageResource(R.drawable.user);
            }
        });

        userbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                FragmentManager m = getSupportFragmentManager();
                FragmentTransaction t = m.beginTransaction();
                Fragment user = new User();
                user.setArguments(bundle);
                t.replace(R.id.fragment, user);
                t.commit();
                homebtn.setImageResource(R.drawable.home);
                attendancebtn.setImageResource(R.drawable.attendance);
                dashbtn.setImageResource(R.drawable.dashboard);
                userbtn.setImageResource(R.drawable.usercolor);
            }
        });








    }
}