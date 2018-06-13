package com.tec.fernandoalberto.algebralineal.Unidad_2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.TextView;

import com.tec.fernandoalberto.algebralineal.R;

import java.util.ArrayList;

public class GridAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<String> arrayList;

    public GridAdapter(Context context, ArrayList<String> arrayList){
        this.context= context;
        this.arrayList= arrayList;
    }
    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return arrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view == null){
            LayoutInflater layoutInflater= (LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            view= layoutInflater.inflate(R.layout.item_grid,null);
            TextView editText= (TextView) view.findViewById(R.id.ig_texto);
            editText.setText(arrayList.get(i));
        }
        return null;
    }
}
