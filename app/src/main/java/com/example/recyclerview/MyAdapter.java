package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;

import java.util.ArrayList;

public class MyAdapter extends Adapter<MyHolder> {

    private final Click CLICK = new Click() {
        @Override
        public void click(int index)
        {models.remove(index);
            notifyDataSetChanged();
        }
    };

    Context c;
    ArrayList<Model> models;
    public View viewGroup;

    public MyAdapter(Context c, ArrayList<Model> models) {
        this.c = c;
        this.models = models;

        for (Model model : models) {
            System.out.println(model.getTitle());
        }
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(c).inflate(R.layout.row, parent, false);

        return new MyHolder(view, CLICK);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int i) {

        holder.mTitle.setText(models.get(i).getTitle());
        holder.mDes.setText(models.get(i).getDescription());
        holder.mImageView.setImageResource(models.get(i).getImg());

    }

    @Override
    public int getItemCount() {
        return models.size();
    }

    public interface Click{
       void click(int index);
    }
}
