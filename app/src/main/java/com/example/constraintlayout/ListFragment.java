package com.example.constraintlayout;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ListFragment extends Fragment {
    RecyclerView recyclerView;

    private EmployeeListAdapter employeeListAdapter;
    private List<ItemData> itemData = new ArrayList<>();

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.list_fragment, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.list_recyclerView_employee_info);


        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);

        employeeListAdapter = new EmployeeListAdapter(itemData, getActivity());
        recyclerView.setAdapter(employeeListAdapter);

        prepareListData();
        return view;
    }

    private void prepareListData() {

        ItemData item = new ItemData("Mad Max: Fury Road", "Action & Adventure", "2015" , "Action & Adventure");
        itemData.add(item);

        item = new ItemData("Inside Out", "Animation, Kids & Family", "2015","Animation");
        itemData.add(item);

        item = new ItemData("Star Wars: Episode VII - The Force Awakens",  "Action", "2015","Animation");
        itemData.add(item);

        item = new ItemData("Shaun the Sheep", "Animation", "2015","Animation");
        itemData.add(item);

        item = new ItemData("The Martian", "Science Fiction & Fantasy", "2015","Animation");
        itemData.add(item);

        item = new ItemData("Mission: Impossible Rogue Nation", "Action", "2015","Animation");
        itemData.add(item);

        employeeListAdapter.notifyDataSetChanged();


    }
}