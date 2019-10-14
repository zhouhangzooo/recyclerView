package com.example.mahadi.frgmtandrcycle;

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

/**
 * Created by Mahadi on 3/7/2018.
 */

public class FinishFragment extends Fragment {

    View v;
    RecyclerView recyclerView;
    List<Contact> listCont;

    public FinishFragment() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        v = inflater.inflate(R.layout.finish_fragment,container,false);
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
        listCont.add(new Contact("第1期","2019-10-10",R.drawable.icon_list_repayment_already,"200"));
         listCont.add(new Contact("第1期","2019-10-10",R.drawable.icon_list_repayment_already,"200"));
         listCont.add(new Contact("第1期","2019-10-10",R.drawable.icon_list_repayment_already,"200"));
         listCont.add(new Contact("第1期","2019-10-10",R.drawable.icon_list_repayment_already,"200"));
         listCont.add(new Contact("第1期","2019-10-10",R.drawable.icon_list_repayment_already,"200"));
         listCont.add(new Contact("第1期","2019-10-10",R.drawable.icon_list_repayment_already,"200"));
         listCont.add(new Contact("第1期","2019-10-10",R.drawable.icon_list_repayment_already,"200"));
         listCont.add(new Contact("第1期","2019-10-10",R.drawable.icon_list_repayment_already,"200"));
         listCont.add(new Contact("第1期","2019-10-10",R.drawable.icon_list_repayment_already,"200"));
         listCont.add(new Contact("第1期","2019-10-10",R.drawable.icon_list_repayment_already,"200"));
         listCont.add(new Contact("第1期","2019-10-10",R.drawable.icon_list_repayment_already,"200"));
         listCont.add(new Contact("第1期","2019-10-10",R.drawable.icon_list_repayment_already,"200"));
         listCont.add(new Contact("第1期","2019-10-10",R.drawable.icon_list_repayment_already,"200"));
         listCont.add(new Contact("第1期","2019-10-10",R.drawable.icon_list_repayment_already,"200"));
         listCont.add(new Contact("第1期","2019-10-10",R.drawable.icon_list_repayment_already,"200"));
    }
}
