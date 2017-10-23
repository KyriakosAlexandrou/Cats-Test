package com.ecristina.mypets;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class CatDetailsActivity extends AppCompatActivity {
    TextView nameTv;
    TextView ageTv;
    TextView colorTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_details);

        nameTv = (TextView)findViewById(R.id.name);
        ageTv = (TextView)findViewById(R.id.age);
        colorTv = (TextView)findViewById(R.id.color);
        Cat cat = (Cat)getIntent().getSerializableExtra("cat_data");
        nameTv.setText(cat.getName());
        ageTv.setText(cat.getAge()+ "");
        colorTv.setText(cat.getColor());
    }
}
