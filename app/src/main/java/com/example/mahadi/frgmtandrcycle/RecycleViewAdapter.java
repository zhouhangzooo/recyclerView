package com.example.mahadi.frgmtandrcycle;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.MyViewHolder> {

    Context context;
    List<Contact> contactList;

    public RecycleViewAdapter(Context context, List<Contact> contactList) {
        this.context = context;
        this.contactList = contactList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(context).inflate(R.layout.item_contact, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(v);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {

        holder.name.setText(contactList.get(position).getName());
        holder.payment.setText(contactList.get(position).getPayment() + "元");
        holder.phone_num.setText(contactList.get(position).getPhn());
        holder.imageView.setImageResource(contactList.get(position).getPhoto());

        View itemView = ((LinearLayout) holder.itemView).getChildAt(0);
        if (mOnItemClickListener != null) {
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = holder.getLayoutPosition();
                    mOnItemClickListener.onItemClick(holder.itemView, position);
                }
            });
        }
    }

    private IOnItemClickListener mOnItemClickListener;//声明接口

    public void setOnItemClickListener(IOnItemClickListener onItemClickListener) {
        mOnItemClickListener = onItemClickListener;
    }

    @Override
    public int getItemCount() {
        return contactList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView name;
        TextView payment;
        TextView phone_num;
        ImageView imageView;


        public MyViewHolder(View itemView) {
            super(itemView);

            name = (TextView) itemView.findViewById(R.id.name_contact);
            payment = (TextView) itemView.findViewById(R.id.tv_payment);
            phone_num = (TextView) itemView.findViewById(R.id.ph_number);
            imageView = (ImageView) itemView.findViewById(R.id.img);
        }
    }
}
