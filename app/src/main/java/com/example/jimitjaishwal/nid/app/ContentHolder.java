package com.example.jimitjaishwal.nid.app;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Jimit Jaishwal on 6/25/2016.
 */
public class ContentHolder extends RecyclerView.ViewHolder{

    ImageView imageView;
    TextView phoneView;
    TextView addressView;
    TextView descriptionView;


    public ContentHolder(View view) {
       super(view);
        imageView = (ImageView) view.findViewById(R.id.poster_View);
        phoneView = (TextView) view.findViewById(R.id.phone_number);
        addressView = (TextView) view.findViewById(R.id.location);
        descriptionView = (TextView) view.findViewById(R.id.description);
    }
}
