package com.example.gurucares.fragmentclass;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;

import com.app.progresviews.ProgressWheel;
import com.example.gurucares.R;
import com.example.gurucares.activityclass.MainActivity;
import com.example.gurucares.customadapters.Attendance_Adapter;
import com.example.gurucares.customadapters.Mainviewmodel;

import java.util.ArrayList;

public class Attendance extends Fragment {
    ArrayList<Mainviewmodel> mainviewmodels;
    RecyclerView recyclerView;
    Attendance_Adapter Mainadapter;
    ProgressWheel mainwheel;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_attendance, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        recyclerView = (RecyclerView) view.findViewById(R.id.attendance_recview);
        mainwheel = view.findViewById(R.id.wheelprogress);
        String[] subjectname ={"Chemistry","Maths","Physics","Computer","Drawing","English","German"};
        Integer[] percentage ={90,67,87,96,45,74,68};

        mainviewmodels = new ArrayList<>();

        for(int i=0;i<percentage.length;i++){
            Mainviewmodel model = new Mainviewmodel(percentage[i],subjectname[i]);
            mainviewmodels.add(model);
        }

        LinearLayoutManager layoutManager = new LinearLayoutManager(requireContext(),LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(layoutManager);
//        recyclerView.setItemAnimator(new DefaultItemAnimator());
        Mainadapter = new Attendance_Adapter(requireContext(),mainviewmodels);
        recyclerView.setAdapter(Mainadapter);
    }
}