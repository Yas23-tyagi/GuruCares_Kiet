package com.example.gurucares.fragmentclass;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.gurucares.R;
import com.example.gurucares.activityclass.Questions_n_Answers;
import com.example.gurucares.modelclass.QuizModal;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link quiz_info#newInstance} factory method to
 * create an instance of this fragment.
 */
    public class quiz_info extends Fragment {


        public static ArrayList<QuizModal> quizModals;
        TextView nextbtn;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public quiz_info() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment quiz_info.
     */
    // TODO: Rename and change types and number of parameters
    public static quiz_info newInstance(String param1, String param2) {
        quiz_info fragment = new quiz_info();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_quiz_info, container, false);

        quizModals = new ArrayList<QuizModal>();

        nextbtn = (TextView) v.findViewById(R.id.nextbtn);
        nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent (getContext(), Questions_n_Answers.class);
                startActivity(i);

            }
        });


        return v;
    }
}