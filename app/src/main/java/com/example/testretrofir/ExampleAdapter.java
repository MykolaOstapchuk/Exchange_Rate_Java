package com.example.testretrofir;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ExampleAdapter extends RecyclerView.Adapter<ExampleAdapter.ExampleViewHolder> {

    private List<RecyclerData> arrayList;

    public ExampleAdapter(List<RecyclerData> recyclerDataArrayList) {
        this.arrayList = recyclerDataArrayList;
    }

    @NonNull
    @Override
    public ExampleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.example_item, parent, false);
        return new ExampleViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ExampleViewHolder holder, int position) {
        RecyclerData temp = arrayList.get(position);
        holder.ccy.setText(temp.getCurrency());
        holder.sale.setText(temp.getSale_price());
        holder.base_ccy.setText(temp.getBase_currency());
        holder.buy.setText(temp.getBuy_price());
    }

    @Override
    public int getItemCount() {
        return this.arrayList.size();
    }

    public static class ExampleViewHolder extends RecyclerView.ViewHolder {
        public TextView ccy, base_ccy, buy, sale;

        public ExampleViewHolder(@NonNull View itemView) {
            super(itemView);

            ccy = itemView.findViewById(R.id.idCcy);
            base_ccy = itemView.findViewById(R.id.idBaseCcy);
            buy = itemView.findViewById(R.id.idBuy);
            sale = itemView.findViewById(R.id.idSale);
        }
    }
}
