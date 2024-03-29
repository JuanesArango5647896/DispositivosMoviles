package com.juanes.miaplicacion;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder>{
    private List<ListaElementos> misDatos;
    private LayoutInflater myInflater;
    private Context myContext;

    final ListAdapter.OnItemClickListener listener;

    public interface OnItemClickListener {
        void onItemClick(ListaElementos item);
    }


    public ListAdapter(List<ListaElementos> itemList, Context context, ListAdapter.OnItemClickListener listener) {
        this.misDatos = itemList;
        this.myInflater = LayoutInflater.from(context);
        this.myContext = context;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista = myInflater.inflate(R.layout.list_element,null);
        return new ListAdapter.ViewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull ListAdapter.ViewHolder holder, int position) {
        holder.bindData(misDatos.get(position));
    }

    @Override
    public int getItemCount() {
        return misDatos.size();
    }

    public void setItems(List<ListaElementos> items){ misDatos= items;}

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView iconImage;
        TextView name, city, status, hour;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            iconImage = itemView.findViewById(R.id.iconoImageView);
            name = itemView.findViewById(R.id.nameTextView);
            city = itemView.findViewById(R.id.cityTextView);
            status = itemView.findViewById(R.id.statusTextView);
            hour = itemView.findViewById(R.id.hourTextView);
        }

        void bindData(final ListaElementos item){
            iconImage.setColorFilter(Color.parseColor(item.getColor()), PorterDuff.Mode.SRC_IN);
            name.setText(item.getName());
            city.setText(item.getCiudad());
            status.setText(item.getEstado());
            hour.setText(item.getHora());
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listener.onItemClick(item);
                }
            });
        }
    }

}
