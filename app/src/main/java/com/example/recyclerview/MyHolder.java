package com.example.recyclerview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.text.BreakIterator;

public class MyHolder extends RecyclerView.ViewHolder  {

    public ImageView mImageView;
    public TextView mTitle;
    public TextView mDes;

    private MyAdapter.Click click;

    public MyHolder(@NonNull View view, MyAdapter.Click click) {
        super(view);

        mImageView = view.findViewById(R.id.imageIv);
        mTitle = view.findViewById(R.id.titleTV);
        mDes = view.findViewById(R.id.descriptionTV);


        view.setOnCreateContextMenuListener((menu, v, menuInfo) -> {
            menu.add(R.menu.context_menu, R.id.delete,1,"delete").setOnMenuItemClickListener(item ->{
                click.click(getAdapterPosition());

                return false;
            });
        } );
    }
}
