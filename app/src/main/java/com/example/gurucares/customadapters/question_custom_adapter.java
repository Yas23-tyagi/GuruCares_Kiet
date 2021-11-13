package com.example.gurucares.customadapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gurucares.R;
import com.example.gurucares.activityclass.DashboardActivity;
import com.example.gurucares.activityclass.MainActivity;
import com.example.gurucares.modelclass.QuizModal;
import com.example.gurucares.viewholder.home_viewholder;

import java.util.ArrayList;

import static com.example.gurucares.fragmentclass.quiz_info.quizModals;

public class question_custom_adapter extends RecyclerView.Adapter<question_custom_adapter.myviewholder> {

    Context context;
    //public static ArrayList<QuizModal> quizModals;


    public question_custom_adapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflator = LayoutInflater.from(parent.getContext());
        View v = inflator.inflate(R.layout.custom_question_layout, parent, false);
        return new myviewholder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {

        //quizModals = new ArrayList<>();
        String head = "Question-"+(position+1);
        holder.headtxt.setText(head);

        if(position==0)
        {
            holder.linearhead.setVisibility(View.VISIBLE);
        }

        if(position==4)
        {
            holder.addbtn.setVisibility(View.VISIBLE);
        }

        //Transferring the whole data of array list quiz to realtime firebase database
        holder.addbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                //then shifiting the user to Main Activity again
                Intent i = new Intent(context, DashboardActivity.class);
                context.startActivity(i);


            }
        });

        holder.lockbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(holder.lockbtn.getText().equals("Save"))
                {
                    if(holder.question.getText().toString().isEmpty() || holder.option1.getText().toString().isEmpty() || holder.option3.getText().toString().isEmpty() || holder.option4.getText().toString().isEmpty() || holder.correctans.getText().toString().isEmpty())
                    {
                        Toast.makeText(context, "Enter all the blanks properly", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        quizModals.add(new QuizModal(holder.question.getText().toString(), holder.option1.getText().toString(), holder.option2.getText().toString(), holder.option3.getText().toString(), holder.option4.getText().toString(), holder.correctans.getText().toString()));

                        holder.question.setEnabled(false);
                        holder.option1.setEnabled(false);
                        holder.option2.setEnabled(false);
                        holder.option3.setEnabled(false);
                        holder.option4.setEnabled(false);
                        holder.correctans.setEnabled(false);

                        holder.cardback.setBackground(ContextCompat.getDrawable(context, R.drawable.green_outlineborder));
                       // holder.lockbtn.setBackground(ContextCompat.getDrawable(context, R.drawable.darkredback));
                        holder.lockbtn.setText("Saved");



                    }



                }

                /*else
                {

                    holder.question.setEnabled(true);
                    holder.option1.setEnabled(true);
                    holder.option2.setEnabled(true);
                    holder.option3.setEnabled(true);
                    holder.option4.setEnabled(true);
                    holder.correctans.setEnabled(true);


                    holder.cardback.setBackground(ContextCompat.getDrawable(context, R.drawable.red_outlineborder));
                    holder.lockbtn.setBackground(ContextCompat.getDrawable(context, R.drawable.lightgreenback));
                    holder.lockbtn.setText("Save");
                }*/


            }
        });

    }

    @Override
    public int getItemCount() {
        return 5;
    }

    static class myviewholder extends RecyclerView.ViewHolder
    {

        EditText question;
        EditText option1;
        EditText option2;
        EditText option3;
        EditText option4;
        EditText correctans;
        TextView headtxt;
        LinearLayout linearhead;
        LinearLayout cardback;
        TextView addbtn;
        TextView lockbtn;



        public myviewholder(@NonNull View itemView) {
            super(itemView);

            lockbtn = (TextView) itemView.findViewById(R.id.lockbtn);
            addbtn = (TextView) itemView.findViewById(R.id.addbtn);
            linearhead = (LinearLayout) itemView.findViewById(R.id.linearhead);
            cardback = (LinearLayout) itemView.findViewById(R.id.cardback);
            headtxt = (TextView) itemView.findViewById(R.id.headtxt);

            question = (EditText) itemView.findViewById(R.id.question_et);
            option1 = (EditText) itemView.findViewById(R.id.option1et);
            option2 = (EditText) itemView.findViewById(R.id.option2et);
            option3 = (EditText) itemView.findViewById(R.id.option3et);
            option4 = (EditText) itemView.findViewById(R.id.option4et);
            correctans = (EditText) itemView.findViewById(R.id.correctanset);


        }
    }
}
