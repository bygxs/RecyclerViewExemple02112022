package com.biniyam.recyclerviewexemple02112022;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {

    private ListData[] listData;
    public CustomAdapter(ListData[]listData){
        this.listData =listData;

    }


    @NonNull
    @Override
    public CustomAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.list_item,parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);



        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CustomAdapter.ViewHolder holder, int position) {
        ListData myListData = listData[position];
        holder.textView.setText(listData[position].getDescripiton());
        holder.imageView.setImageResource(listData[position].getImageId());
        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),"clicked item at postion: "
                        + myListData.getDescripiton(),Toast.LENGTH_SHORT).show();

            }
        });
    }

    @Override
    public int getItemCount() {
        return listData.length;
    }
     public class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView imageView;
        public TextView textView;
        public LinearLayout linearLayout;

        public ViewHolder(View view){
            super(view);
            this.imageView = view.findViewById(R.id.image_view);
            this.textView = view.findViewById(R.id.text_view);
            this.linearLayout = view.findViewById(R.id.linear_layout);


         }
     }

}
