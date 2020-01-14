package edu.daffodilvarsity.a2zservice;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import edu.daffodilvarsity.a2zservice.adapter.ServiceAdapter;
import edu.daffodilvarsity.a2zservice.helper.ServiceHelper;


/**
 * A simple {@link Fragment} subclass.
 */
public class ServiceProviderFragment extends Fragment {

    View view;
    List<ServiceHelper> data;
    RecyclerView recyclerView;
    ServiceAdapter adapter;

    public ServiceProviderFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_service_provider, container, false);

        intiData();

        recyclerView=view.findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter=new ServiceAdapter(data);
        recyclerView.setAdapter(adapter);

        return view;
    }

    private void intiData() {
        data=new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            data.add(new ServiceHelper("","Name"+i,"Location"+i));
        }
    }

}
