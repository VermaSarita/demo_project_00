package com.ggpl.taskproject;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.ggpl.taskproject.models.Data;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private List<Data> dataList;
    private Context context;

    // Constructor to initialize dataList and context
    public MyAdapter(Context context, List<Data> dataList) {
        this.context = context;
        this.dataList = dataList;
    }

    // Method to update data in the adapter
    public void setData(List<Data> newDataList) {
        this.dataList = newDataList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Inflate your item layout here
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.MyViewHolder holder, int position) {
        // Bind data to views
        holder.memberName.setText(dataList.get(position).getCatagryName());
        holder.chapterName.setText(dataList.get(position).getStoreName());
        holder.companyName.setText(dataList.get(position).getStoreCatId());
        holder.companyName2.setText(dataList.get(position).getUid());
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView memberName, chapterName, companyName, companyName2;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            memberName = itemView.findViewById(R.id.memberName);
            chapterName = itemView.findViewById(R.id.chapterName);
            companyName = itemView.findViewById(R.id.companyName);
            companyName2 = itemView.findViewById(R.id.companyName2);
        }
    }
}
