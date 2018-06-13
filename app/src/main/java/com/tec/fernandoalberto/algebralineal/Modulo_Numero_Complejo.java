package com.tec.fernandoalberto.algebralineal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.tec.fernandoalberto.algebralineal.R;

public class Modulo_Numero_Complejo extends AppCompatActivity {

    Button btnResultado;
    EditText txtCZ1,txtZ1A,txtZ1I, txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modulo__numero__complejo);
        btnResultado= (Button)findViewById(R.id.btnResultado);
        txtCZ1= (EditText)findViewById(R.id.txtCZ1);
        txtZ1A=(EditText)findViewById(R.id.Z1A);
        txtZ1I=(EditText)findViewById(R.id.Z1i);
        txtResultado=(EditText)findViewById(R.id.txtResultado);

        btnResultado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txtCZ1.getText().toString().length()==0 || txtZ1A.getText().toString().length()==0 || txtZ1I.getText().toString().length()==0){
                    Toast.makeText(Modulo_Numero_Complejo.this, "Campos Incompletos", Toast.LENGTH_SHORT).show();
                }else {
                    if (txtCZ1.getText().toString().equals(".") || txtZ1A.getText().toString().equals(".") || txtZ1I.getText().toString().equals(".")) {
                        Toast.makeText(Modulo_Numero_Complejo.this, "Valores no aceptados", Toast.LENGTH_SHORT).show();
                    } else {
                        double a = Double.parseDouble(txtZ1A.getText().toString());
                        double b = Double.parseDouble(txtZ1I.getText().toString());
                        double suma;
                        double conjugado = Double.parseDouble(txtCZ1.getText().toString());
                        a = conjugado * a;
                        b = conjugado * b;
                        a = a * a;
                        b = b * b;
                        suma = a + b;
                        txtResultado.setText(String.valueOf(Math.sqrt(suma)));
                    }
                }
            }
        });
    }
}
