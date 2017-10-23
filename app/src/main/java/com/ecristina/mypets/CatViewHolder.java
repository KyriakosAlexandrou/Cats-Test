package com.ecristina.mypets;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by tina on 17/10/2017.
 */

public class CatViewHolder extends RecyclerView.ViewHolder{
    TextView nameTv;
    TextView ageTv;
    TextView colorTv;

    public CatViewHolder(View itemView) {
        super(itemView);

        nameTv = (TextView) itemView.findViewById(R.id.name);
        ageTv = (TextView) itemView.findViewById(R.id.age);
        colorTv = (TextView) itemView.findViewById(R.id.color);
    }
}
