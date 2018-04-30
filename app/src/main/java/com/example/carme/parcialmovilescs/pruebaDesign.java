package com.example.carme.parcialmovilescs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class pruebaDesign extends AppCompatActivity {
    List<Months> monthsList;
    RecyclerView recyclerView;
    MonthsAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prueba_design);

        monthsList = fillList();

        recyclerView = findViewById(R.id.recyclerView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        adapter = new MonthsAdapter(this, monthsList);

        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);
    }

    private ArrayList<Months> fillList(){


        ArrayList<Months> l = new ArrayList<>();
        l.add(new Months (1, "January"));
        l.add(new Months (2, "February"));
        l.add(new Months (3, "March"));
        l.add(new Months (4, "April"));
        l.add(new Months (5, "May"));
        l.add(new Months (6, "June"));
        l.add(new Months (7, "July"));
        l.add(new Months (8, "August"));
        l.add(new Months (9, "September"));
        l.add(new Months (10, "October"));
        l.add(new Months (11, "November"));
        l.add(new Months (12, "December"));

        return l;
    }
}








