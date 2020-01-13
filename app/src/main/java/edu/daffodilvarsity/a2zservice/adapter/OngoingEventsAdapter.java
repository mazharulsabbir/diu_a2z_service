package edu.daffodilvarsity.a2zservice.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import edu.daffodilvarsity.a2zservice.R;
import edu.daffodilvarsity.a2zservice.model.OngoingEvents;

public class OngoingEventsAdapter extends RecyclerView.Adapter<OngoingEventsAdapter.OngoingEventHolder> {
    private List<OngoingEvents> ongoingEventsList;
    private Context context;

    public OngoingEventsAdapter(List<OngoingEvents> ongoingEventsList, Context context) {
        this.ongoingEventsList = ongoingEventsList;
        this.context = context;
    }

    @NonNull
    @Override
    public OngoingEventHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context)
                .inflate(R.layout.item_ongoing, parent, false);
        return new OngoingEventHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull OngoingEventHolder holder, int position) {
        OngoingEvents ongoingEvents = ongoingEventsList.get(position);
        holder.bind(ongoingEvents);
    }

    @Override
    public int getItemCount() {
        return ongoingEventsList.size();
    }

    public class OngoingEventHolder extends RecyclerView.ViewHolder {
        public OngoingEventHolder(@NonNull View itemView) {
            super(itemView);
        }

        private void bind(OngoingEvents ongoingEvents){

        }
    }
}
