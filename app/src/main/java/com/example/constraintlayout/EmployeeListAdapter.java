package com.example.constraintlayout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class EmployeeListAdapter extends RecyclerView.Adapter<EmployeeListAdapter.ListViewHolder> {

    private List<ItemData> listData;
    private Context context;

    public EmployeeListAdapter(List<ItemData> listData, Context context) {
        this.listData = listData;
        this.context = context;
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {

        private AppCompatImageView companyLogo;
        private TextView tv_ios_developer;
        private TextView tx_company_name_item;
        private TextView tx_city_name_item;
        private TextView tx_date_item;
        private AppCompatImageButton button_favorite;
        private AppCompatImageButton Button_share;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);

            companyLogo = (AppCompatImageView) itemView.findViewById(R.id.appCompatImageView);
            tv_ios_developer = (TextView) itemView.findViewById(R.id.tv_ios_developer);
            tx_company_name_item = (TextView) itemView.findViewById(R.id.tx_company_name_item);
            tx_city_name_item = (TextView) itemView.findViewById(R.id.tx_city_name_item);
            tx_date_item = (TextView) itemView.findViewById(R.id.tx_date_item);
            button_favorite = (AppCompatImageButton) itemView.findViewById(R.id.button_favorite);
            Button_share = (AppCompatImageButton) itemView.findViewById(R.id.Button_share);
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

        ItemData itemData = listData.get(position);
        holder.tv_ios_developer.setText(itemData.getTv_ios_developer());
        holder.tx_city_name_item.setText(itemData.getTx_city_name_item());
        holder.tx_company_name_item.setText(itemData.getTx_company_name_item());
        holder.tx_date_item.setText(itemData.getTx_date_item());
    }

    @Override
    public int getItemCount() {
        return 0;
    }



}
