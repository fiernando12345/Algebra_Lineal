package com.tec.fernandoalberto.algebralineal;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import java.util.ArrayList;

public class Adaptador_Recycler extends RecyclerView.Adapter<Adaptador_Recycler.ViewHolder>{

    public Context VHcontext;
    public ArrayList<Double> VHdatos;

    public Adaptador_Recycler(Context context, ArrayList<Double> datos){
        super();
        this.VHcontext= context;
        this.VHdatos= datos;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.renglon_recycler, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        if(viewHolder==null){
            return;
        }
        viewHolder.binView(i);
    }

    @Override
    public int getItemCount() {
        return VHdatos.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        EditText textoTabla1;
        View layout;
        public ViewHolder(View itemview){
            super(itemview);
            layout= itemview;
            textoTabla1= layout.findViewById(R.id.TextoTabla);
        }
        public void binView(int position){
            final Double item= VHdatos.get(position);
            layout.setTag(this);
            textoTabla1.setHint(position);
        }
    }

}
