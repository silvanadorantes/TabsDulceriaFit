package com.example.silvanadorantes.tabsdulceriafit;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by silvana on 05/07/16.
 */
public class DulcesFitAdapter extends RecyclerView.Adapter<DulcesFitAdapter.ViewHolder> {

    private List<DulcesFit> mItems;
    private OnItemClickListener listener;

    public interface OnItemClickListener{
        public void onClick(DulcesFitAdapter.ViewHolder viewHolder, int idDulce, int idTipo);

    }

    public DulcesFitAdapter(List<DulcesFit> mItems, OnItemClickListener listener){
        this.mItems = mItems;
        this.listener = listener;
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private TextView nombre;
        private ImageView imagen;

        public ViewHolder(View v){
            super(v);
            nombre = (TextView) v.findViewById(R.id.nombre_Dulcefit);
            imagen = (ImageView) v.findViewById(R.id.imageDulcesFit);
            v.setOnClickListener(this);
            imagen.setOnClickListener(this);

        }

        public void setNombre(String text) {
            nombre.setText(text);
        }

        public void setImage(int image) {
            imagen.setTag(image);
            imagen.setImageResource(image);
        }

        @Override
        public void onClick(View v) {
            listener.onClick(this, getIdDulce(getAdapterPosition()), getTipo(getAdapterPosition()));
        }
    }

    private int getIdDulce(int position){
        if (position != RecyclerView.NO_POSITION){
            return mItems.get(position).getId();
        } else {
            return -1;
        }
    }

    private int getTipo(int position){
        if (position != RecyclerView.NO_POSITION){
            return mItems.get(position).getTipo();
        } else {
            return -5;
        }
    }

    public void add(DulcesFit dulcesFit){
        mItems.add(dulcesFit);
        notifyItemInserted(mItems.indexOf(dulcesFit));
    }

    public void remove(DulcesFit dulcesFit){
        int position = mItems.indexOf(dulcesFit);
        if (position != -1){
            mItems.remove(position);
            notifyItemRemoved(position);
        }
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_list_dulcesfit, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        DulcesFit item = mItems.get(position);

        Glide.with(holder.itemView.getContext())
                .load(item.getIdImagen())
                .centerCrop()
                .into(holder.imagen);

        holder.setNombre(item.getNombre());

    }
}
