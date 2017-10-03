package com.example.lab3news.adapter;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.lab3news.Item.Item;
//import com.example.lab3news.Item.SetViewHolder;
import com.example.lab3news.OnTapListener;
import com.example.lab3news.R;

import java.util.Collections;
import java.util.List;

/**
 * Created by Динара on 03.10.2017.
 */

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.SetViewHolder> {
    private Activity activity;
    List<Item> items = Collections.emptyList();
    private OnTapListener onTapListener;
    public CategoryAdapter(Activity activity, List<Item> items){
        this.activity=activity;
        this.items=items;
    }
    @Override
    public SetViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.category_list_item,parent,false);
        return new SetViewHolder(view);
    }

    @Override
    public void onBindViewHolder(SetViewHolder holder, final int position) {
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(onTapListener!=null){
                    onTapListener.OnTapView(position);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    class SetViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView txt_title;
        public TextView txt_date;
        public TextView txt_image;
        public TextView txt_body;

        public SetViewHolder(View itemView) {
            super(itemView);
            txt_title=(TextView) itemView.findViewById(R.id.text_word);
            txt_date=(TextView) itemView.findViewById(R.id.txt_date);

            itemView.setOnClickListener(this);
        }


        @Override
        public void onClick(View view) {

        }
    }

    /*public void setOnTapListener(OnTapListener onTapListener){
        this.onTapListener=onTapListener;
    }*/
}
