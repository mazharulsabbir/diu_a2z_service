package edu.daffodilvarsity.a2zservice.events_services;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import edu.daffodilvarsity.a2zservice.R;
import edu.daffodilvarsity.a2zservice.adapter.OngoingEventsAdapter;
import edu.daffodilvarsity.a2zservice.model.OngoingEvents;

/**
 * A simple {@link Fragment} subclass.
 */
public class OngoingFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ongoing, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView ongoingRecyclerView = view.findViewById(R.id.ongoingRV);
        ongoingRecyclerView.setHasFixedSize(true);
        ongoingRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        List<OngoingEvents> ongoingEventsList = new ArrayList<>();
        ongoingEventsList.add(new OngoingEvents("Foundation Day",
                "Parmanent camous,Ashulia Dhaka",
                "Foundation Day",
                "27 January 2020",
                "27",
                "Jan",
                "Daffodil International University, Ashulia Dhaka"
        ));

        OngoingEventsAdapter ongoingEventsAdapter = new OngoingEventsAdapter(ongoingEventsList,getContext());
        ongoingRecyclerView.setAdapter(ongoingEventsAdapter);

    }
}
