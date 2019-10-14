package com.example.mahadi.frgmtandrcycle;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class OngoingFragment extends Fragment {

    View v;
    RecyclerView recyclerView;
    List<Contact> listCont;

    public OngoingFragment() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        v = inflater.inflate(R.layout.ongoing_fragment,container,false);
        recyclerView = (RecyclerView) v.findViewById(R.id.contact_recycleView);
        RecycleViewAdapter viewAdapter = new RecycleViewAdapter(getContext(), listCont);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.addItemDecoration(new DividerItemDecoration(getActivity(),DividerItemDecoration.VERTICAL));
        recyclerView.setAdapter(viewAdapter);

        viewAdapter.setOnItemClickListener(new IOnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Toast.makeText(getActivity(),"点击了———" + position, Toast.LENGTH_SHORT).show();
            }
        });

        return v;
    }

     @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         listCont = new ArrayList<>();
         listCont.add(new Contact("第1期","2019-10-12",R.drawable.status_payment,"100"));
         listCont.add(new Contact("第1期","2019-10-12",R.drawable.status_payment,"100"));
         listCont.add(new Contact("第1期","2019-10-12",R.drawable.status_overdue,"100"));
         listCont.add(new Contact("第1期","2019-10-12",R.drawable.status_payment,"100"));
         listCont.add(new Contact("第1期","2019-10-12",R.drawable.status_overdue,"100"));
         listCont.add(new Contact("第1期","2019-10-12",R.drawable.status_payment,"100"));
         listCont.add(new Contact("第1期","2019-10-12",R.drawable.status_payment,"100"));
         listCont.add(new Contact("第1期","2019-10-12",R.drawable.status_overdue,"100"));
         listCont.add(new Contact("第1期","2019-10-12",R.drawable.status_overdue,"100"));
         listCont.add(new Contact("第1期","2019-10-12",R.drawable.status_payment,"100"));
         listCont.add(new Contact("第1期","2019-10-12",R.drawable.status_payment,"100"));
         listCont.add(new Contact("第1期","2019-10-12",R.drawable.status_overdue,"100"));
         listCont.add(new Contact("第1期","2019-10-12",R.drawable.status_overdue,"100"));
         listCont.add(new Contact("第1期","2019-10-12",R.drawable.status_payment,"100"));
         listCont.add(new Contact("第1期","2019-10-12",R.drawable.status_payment,"100"));
    }
}
