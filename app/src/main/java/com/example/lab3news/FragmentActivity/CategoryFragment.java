package com.example.lab3news.FragmentActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.example.lab3news.DatabaseHelper;
import com.example.lab3news.Item.Item;
import com.example.lab3news.R;
import com.example.lab3news.adapter.CategoryAdapter;


import java.util.ArrayList;


public class CategoryFragment extends Fragment {
    private RecyclerView recyclerView;
    private DatabaseHelper databaseHelper;
    private ArrayList<Item> arrayList=new ArrayList<Item>();
    private Cursor cursor;
    private CategoryAdapter adapter;



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup viewGroup=(ViewGroup) inflater.inflate(R.layout.category_list_item, container,false);
        recyclerView=(RecyclerView) viewGroup.findViewById(R.id.recycler_view);
        return viewGroup;


    }
}
