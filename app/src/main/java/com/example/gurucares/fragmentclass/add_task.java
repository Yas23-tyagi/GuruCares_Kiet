package com.example.gurucares.fragmentclass;

import android.os.Bundle;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.gurucares.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link add_task#newInstance} factory method to
 * create an instance of this fragment.
 */
public class add_task extends Fragment {


    public int quiz,assign= 0;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public add_task() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment add_task.
     */
    // TODO: Rename and change types and number of parameters
    public static add_task newInstance(String param1, String param2) {
        add_task fragment = new add_task();
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
        View v = inflater.inflate(R.layout.fragment_add_task, container, false);

        LinearLayout addquiz = (LinearLayout) v.findViewById(R.id.addquiz);
        LinearLayout addassign = (LinearLayout) v.findViewById(R.id.addassignment);
        TextView addbtn = (TextView) v.findViewById(R.id.addbtn);

        addquiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addquiz.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.taskoption));
                addassign.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.barbackgroundempty ));

                quiz=1;
                assign=0;

            }
        });


        addassign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addassign.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.taskoption));
                addquiz.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.barbackgroundempty) );

                assign=1;
                quiz=0;
            }
        });
                

        addbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(quiz==1)
                {
                    //tejash
                }
                else if(assign==1)
                {

                }
                else
                {
                    Toast.makeText(getContext(),"Select atleast one option", Toast.LENGTH_SHORT).show();
                }



            }
        });


        return v;

    }
}