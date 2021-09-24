package com.example.gurucares;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

public class chapter_custom_adapter extends FirebaseRecyclerAdapter<chapter_model,chapter_custom_adapter.myviewholder> {


    /**
     * Initialize a {@link RecyclerView.Adapter} that listens to a Firebase query. See
     * {@link FirebaseRecyclerOptions} for configuration options.
     *
     * @param options
     */
    public chapter_custom_adapter(@NonNull FirebaseRecyclerOptions<chapter_model> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull myviewholder holder, int position, @NonNull chapter_model model) {

        holder.chaptername.setText(model.getChaptername());
        //Glide.with(holder.chapterpic.getContext()).load(model.getImageurl()).into(holder.chapterpic);

    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.chapter_custom_layout,parent,false);
        return new myviewholder(view);
    }

    static class myviewholder extends RecyclerView.ViewHolder
    {
        TextView chaptername;
       // ImageView chapterpic;


        public myviewholder(@NonNull View itemView) {
            super(itemView);
            chaptername = (TextView) itemView.findViewById(R.id.chaptername);
            //chapterpic = (ImageView) itemView.findViewById(R.id.chapterpic);

        }


    }
}
