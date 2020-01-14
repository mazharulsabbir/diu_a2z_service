package edu.daffodilvarsity.a2zservice.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import edu.daffodilvarsity.a2zservice.R;
import edu.daffodilvarsity.a2zservice.model.OngoingEvents;
import edu.daffodilvarsity.a2zservice.utils.OnItemClickListener;

public class OngoingEventsAdapter extends RecyclerView.Adapter<OngoingEventsAdapter.OngoingEventHolder> {
    private List<OngoingEvents> ongoingEventsList;
    private Context context;
    private OnItemClickListener onItemClickListener;

    public OngoingEventsAdapter(List<OngoingEvents> ongoingEventsList, Context context) {
        this.ongoingEventsList = ongoingEventsList;
        this.context = context;
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
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
        private TextView eventName;
        private TextView venue;
        private TextView type;
        private TextView finishedTime;
        private TextView date;
        private TextView month;

        private OngoingEventHolder(@NonNull View itemView) {
            super(itemView);
            eventName = itemView.findViewById(R.id.eventNameTV);
            venue = itemView.findViewById(R.id.venueTV);
            type = itemView.findViewById(R.id.ongoingTV);
            finishedTime = itemView.findViewById(R.id.timeTV);
            date = itemView.findViewById(R.id.dayTV);
            month = itemView.findViewById(R.id.monthTv);

            itemView.findViewById(R.id.get_event_direction).setOnClickListener(v -> {
                int p = getAdapterPosition();
                if (p != RecyclerView.NO_POSITION) {
                    if (onItemClickListener != null) {
                        onItemClickListener.onItemClick(p);
                    }
                }
            });
        }


        private void bind(OngoingEvents events) {
            eventName.setText(events.getEventName());
            venue.setText(events.getEventVenue());
            type.setText(events.getEventType());
            finishedTime.setText(events.getFinishedTime());
            date.setText(events.getEventDate());
            month.setText(events.getEventMonth());
        }
    }
}
