package ru.mvrlrd.photoalbum.view;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import ru.mvrlrd.photoalbum.R;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private static int viewHolderCount;
    private int numberItems;

    public MyAdapter(int numberItems) {
        this.numberItems = numberItems;
        viewHolderCount = 0;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        int list_item = R.layout.list_item;

        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(list_item,parent,false);

        MyViewHolder viewHolder = new MyViewHolder(view);
        viewHolder.staticTextView.setText("ViewHolder count: "+ viewHolderCount);
        viewHolderCount++;
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.bind(position);
    }

    @Override
    public int getItemCount() {
        return numberItems;
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
    TextView dinamicTextView,
            staticTextView;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        dinamicTextView = itemView.findViewById(R.id.dinamic_tv);
        staticTextView = itemView.findViewById(R.id.static_tv);
    }
    void bind(int listIndex){
        dinamicTextView.setText(String.valueOf(listIndex));
    }
}
}
