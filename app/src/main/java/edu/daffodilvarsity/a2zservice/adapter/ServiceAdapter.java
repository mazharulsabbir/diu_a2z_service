package edu.daffodilvarsity.a2zservice.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import edu.daffodilvarsity.a2zservice.R;
import edu.daffodilvarsity.a2zservice.helper.ServiceHelper;

public class ServiceAdapter extends RecyclerView.Adapter<ServiceAdapter.MyAdapter> {

    List<ServiceHelper> data;

    public ServiceAdapter(List<ServiceHelper> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public MyAdapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.service_item_design,parent,false);
        return new MyAdapter(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter holder, int position) {

        ServiceHelper helper=data.get(position);
        if (helper.getImage().isEmpty()){

        }
        holder.name.setText(helper.getProviderName());
        holder.location.setText(helper.getLocation());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class  MyAdapter extends RecyclerView.ViewHolder{
        ImageView image;
        TextView name,location;

        public MyAdapter(@NonNull View itemView) {
            super(itemView);

            image=itemView.findViewById(R.id.rounded_user_image);
            name=itemView.findViewById(R.id.textViewName);
            location=itemView.findViewById(R.id.textViewLocation);
        }
    }
}
