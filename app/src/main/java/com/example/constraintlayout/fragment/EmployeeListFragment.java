package com.example.constraintlayout.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.constraintlayout.R;
import com.example.constraintlayout.adapter.EmployeeListAdapter;
import com.example.constraintlayout.data_model.EmployeeItemData;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class EmployeeListFragment extends Fragment {

    /////////////////////////////////////////////////
    @BindView(R.id.list_recyclerView_employee_info)
    RecyclerView recyclerView;
    //////////////////////////////////////////////////

    private EmployeeListAdapter employeeListAdapter;
    private List<EmployeeItemData> itemData = new ArrayList<>();

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.list_fragment, container, false);

        //////////////////////////////////
        ButterKnife.bind(this,view);
        //////////////////////////////////


        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);

        employeeListAdapter = new EmployeeListAdapter(itemData, getActivity());
        recyclerView.setAdapter(employeeListAdapter);

        prepareListData();
        return view;
    }

    private void prepareListData() {

        EmployeeItemData item = new EmployeeItemData("Mad Max: Fury Road", "Action & Adventure", "2015", "Action & Adventure");
        itemData.add(item);

        item = new EmployeeItemData("Inside Out", "Animation, Kids & Family", "2015", "Animation");
        itemData.add(item);

        item = new EmployeeItemData("Star Wars:", "Action", "2015", "Animation");
        itemData.add(item);

        item = new EmployeeItemData("Shaun the Sheep", "Animation", "2015", "Animation");
        itemData.add(item);

        item = new EmployeeItemData("The Martian", "Science Fiction", "2015", "Animation");
        itemData.add(item);

        item = new EmployeeItemData("Mission: Impossible ", "Action", "2015", "Animation");
        itemData.add(item);

        itemData.add(item);
        itemData.add(item);
        itemData.add(item);
        itemData.add(item);
        itemData.add(item);
        itemData.add(item);

        employeeListAdapter.notifyDataSetChanged();


    }
}