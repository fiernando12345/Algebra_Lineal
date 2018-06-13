package com.tec.fernandoalberto.algebralineal.Unidad_2;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.opengl.Matrix;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.InputType;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import com.tec.fernandoalberto.algebralineal.R;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Operaciones_con_matrices extends AppCompatActivity {

    EditText txtF1, txtC1;
    Button btnT1;
    TextView prueba1;
    Double[][] Tabla1, Tabla2;
    private RecyclerView mrecyclerView;
    private GridLayoutManager mgridLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operaciones_con_matrices);
        btnT1 = (Button) findViewById(R.id.btnT1);
        //txtTabla1 = (EditText) findViewById(R.id.Tabla1);
        txtF1 = (EditText) findViewById(R.id.T1F);
        txtC1 = (EditText) findViewById(R.id.T1C);
        mrecyclerView= findViewById(R.id.Recycle1);

        btnT1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int FilasT1 = Integer.parseInt(txtF1.getText().toString());
                int ColumnasT1 = Integer.parseInt(txtC1.getText().toString());
                Tabla1 = new Double[FilasT1][ColumnasT1];
                mgridLayoutManager= new GridLayoutManager(getApplicationContext(), ColumnasT1);
                /*
                String PT1 = "";
                for (int f = 0; f < FilasT1; f++) {
                    for (int c = 0; c < ColumnasT1; c++) {
                        PT1 = PT1 + String.valueOf(Tabla1[f][c]) + " ";
                    }
                    PT1 = PT1 + "\n";
                }
                prueba1.setText(PT1);
                */
            }
        });


        double[][] d = {{1, 2, 3}, {4, 5, 6}, {9, 1, 3}};
        Jama.Matrix matrix = new Jama.Matrix(d);
        matrix.transpose();
        double[][] m = matrix.getArray();
    }

}
