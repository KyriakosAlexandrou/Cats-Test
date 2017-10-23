package com.ecristina.mypets;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by tina on 17/10/2017.
 */

public class CatsAdapter extends RecyclerView.Adapter<CatViewHolder> {
    private ArrayList<Cat> mCats;

    public CatsAdapter(ArrayList<Cat> cats) {
        mCats = cats;
    }

    @Override
    public CatViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cat, parent, false);
        CatViewHolder vh = new CatViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(final CatViewHolder holder, int position) {

        final Cat cat = mCats.get(position);
        holder.nameTv.setText(cat.getName());
        holder.ageTv.setText("" + cat.getAge());
        holder.colorTv.setText(cat.getColor());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            private Context context;

            @Override
            public void onClick(View view) {
                context = holder.itemView.getContext();
                Intent intent = new Intent(context, CatDetailsActivity.class);
                intent.putExtra("cat_data", cat);
                context.startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return mCats.size();
    }
}
