package edu.daffodilvarsity.a2zservice.ServicesFragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import edu.daffodilvarsity.a2zservice.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class OngoingFragment extends Fragment {


    public OngoingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ongoing, container, false);
    }

}