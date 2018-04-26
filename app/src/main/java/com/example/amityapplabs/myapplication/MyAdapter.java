package com.example.amityapplabs.myapplication;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private String[] mTitleDatasets = {"Name1","Name2","Name3"};
    private String[] mSubTitleDatasets = {"Class1","Class2","Class3"};
    private DetailClickListener detailClickListener;

    public void setOnClick(DetailClickListener detailClickListener)
    {
        this.detailClickListener = detailClickListener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_applabs_student, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.mTitleTextView.setText(mTitleDatasets[position]);
        holder.mSubTitleTextView.setText(mSubTitleDatasets[position]);
    }

    @Override
    public int getItemCount() {
        return mTitleDatasets.length;
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView mTitleTextView;
        TextView mSubTitleTextView;
        View rootView;
        ViewHolder(View v) {
            super(v);
            mTitleTextView = v.findViewById(R.id.title);
            mSubTitleTextView = v.findViewById(R.id.subtitle);
            rootView = v.findViewById(R.id.root_view);
        }
    }



}
