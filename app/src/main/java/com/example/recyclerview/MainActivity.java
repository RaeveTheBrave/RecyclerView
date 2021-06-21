package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        myAdapter = new MyAdapter(this, getMyList());
        mRecyclerView.setAdapter(myAdapter);


    }

    private ArrayList<Model> getMyList() {
        ArrayList<Model> models = new ArrayList<>();

        models.add(new Model("Saved Messages", "Your Saved Messages Go Here", R.drawable.bookmark));

        models.add(new Model("Tank Enthusiast", "Russian Tanks Are Superior!", R.drawable.foxt72));

        models.add(new Model("Unknown User", "Greetings", R.drawable.user));

        models.add(new Model("Person", "Hello", R.drawable.thing));

        models.add(new Model("Another Person", "The Forest Is Really Nice", R.drawable.forest));

        // ulangi this shit ^

        return models;
    }
}
