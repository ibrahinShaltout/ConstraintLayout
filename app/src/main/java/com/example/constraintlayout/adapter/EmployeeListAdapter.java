package com.example.constraintlayout.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.constraintlayout.data_model.EmployeeItemData;
import com.example.constraintlayout.R;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class EmployeeListAdapter extends RecyclerView.Adapter<EmployeeListAdapter.ListViewHolder> {

    private List<EmployeeItemData> listData;
    private Context context;

    public EmployeeListAdapter(List<EmployeeItemData> listData, Context context) {
        this.listData = listData;
        this.context = context;
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.appCompatImageView)
         AppCompatImageView companyLogo;
        @BindView(R.id.tv_ios_developer)
         TextView JobTitle;
        @BindView(R.id.tx_company_name_item)
         TextView CompanyName;
        @BindView(R.id.tx_city_name_item)
         TextView Location;
        @BindView(R.id.tx_date_item)
         TextView StartJobDate;
        @BindView(R.id.button_favorite)
         AppCompatImageButton button_favorite;
        @BindView(R.id.Button_share)
         AppCompatImageButton Button_share;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);

        }
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {

        EmployeeItemData itemData = listData.get(position);
        holder.JobTitle.setText(itemData.getJobTitle());
        holder.Location.setText(itemData.getStartJobDate());
        holder.CompanyName.setText(itemData.getLocation());
        holder.StartJobDate.setText(itemData.getCompanyName());
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }



}
