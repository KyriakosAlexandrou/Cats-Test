package com.ecristina.mypets;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class CatsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cats);


        ArrayList<Cat> cats = new ArrayList<>();

        cats.add(new Cat("Lilli", 2, "grey"));
        cats.add(new Cat("Moon", 2, "white"));
        cats.add(new Cat("Leyla", 2, "black"));
        cats.add(new Cat("Leyla", 2, "black"));
        cats.add(new Cat("Leyla", 2, "black"));
        cats.add(new Cat("Leyla", 2, "black"));
        cats.add(new Cat("Leyla", 2, "black"));
        cats.add(new Cat("Leyla", 2, "black"));
        cats.add(new Cat("Leyla", 2, "black"));
        cats.add(new Cat("Leyla", 2, "black"));
        cats.add(new Cat("Leyla", 2, "black"));
        cats.add(new Cat("Leyla", 2, "black"));
        cats.add(new Cat("Leyla", 2, "black"));
        cats.add(new Cat("Leyla", 2, "black"));
        cats.add(new Cat("Leyla", 2, "black"));
        cats.add(new Cat("Leyla", 2, "black"));
        cats.add(new Cat("Leyla", 2, "black"));
        cats.add(new Cat("Leyla", 2, "black"));
        cats.add(new Cat("Leyla", 2, "black"));
        cats.add(new Cat("Leyla", 2, "black"));
        cats.add(new Cat("Leyla", 2, "black"));
        cats.add(new Cat("Leyla", 2, "black"));
        cats.add(new Cat("Leyla", 2, "black"));
        cats.add(new Cat("Leyla", 2, "black"));
        cats.add(new Cat("Leyla", 2, "black"));
        cats.add(new Cat("Leyla", 2, "black"));
        cats.add(new Cat("Leyla", 2, "black"));

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.list_pets);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        CatsAdapter catsAdapter = new CatsAdapter(cats);
        recyclerView.setAdapter(catsAdapter);

    }
}
