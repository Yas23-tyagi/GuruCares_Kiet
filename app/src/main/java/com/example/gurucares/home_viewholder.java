package com.example.gurucares;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class home_viewholder extends RecyclerView.ViewHolder {

    ImageView subjectimage;
    TextView subjectname;
    TextView facultyname;
    TextView enrollbtn;




    public home_viewholder(@NonNull View itemView) {
        super(itemView);

        subjectimage = (ImageView)itemView.findViewById(R.id.subjectpic);
        subjectname = (TextView)itemView.findViewById(R.id.subjectname);
        facultyname = (TextView)itemView.findViewById(R.id.facultyname);
        enrollbtn = (TextView) itemView.findViewById(R.id.enroll);




    }
}
