package com.example.jimitjaishwal.nid.app;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Jimit Jaishwal on 6/25/2016.
 */
public class ContentAdapter extends RecyclerView.Adapter<ContentHolder> {
    public Context mContext;
    public List<Content> mContent;

    public ContentAdapter(Context mContext, List<Content> mContent) {
        this.mContext = mContext;
        this.mContent = mContent;
    }

    @Override
    public ContentHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View rootView = LayoutInflater.from(mContext).inflate(R.layout.card_item_content, parent, false);
        return new ContentHolder(rootView);
    }

    @Override
    public void onBindViewHolder(ContentHolder holder, int position) {
        Content content = mContent.get(position);
        holder.imageView.setImageResource(content.image);
        holder.phoneView.setText(content.phoneNumber);
        holder.addressView.setText(content.address);
        holder.descriptionView.setText(content.description);
    }

    @Override
    public int getItemCount() {
        return mContent.size();
    }
}
