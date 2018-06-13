package com.tec.fernandoalberto.algebralineal;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.tec.fernandoalberto.algebralineal.R;

public class Plano_Argand extends AppCompatActivity {

    EditText txtX, txtY;
    Button btnGraficar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_plano__argand);
        setContentView(new MyView(this));
        txtX= (EditText)findViewById(R.id.X);
        txtY= (EditText)findViewById(R.id.Y);
        btnGraficar= (Button)findViewById(R.id.btnGraficar);

        txtX.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                if(txtX.getText().length()==0){
                    btnGraficar.setEnabled(false);
                }else{
                    btnGraficar.setEnabled(true);
                }
                return false;

            }
        });
        txtY.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                if(txtY.getText().length()==0){
                    btnGraficar.setEnabled(false);
                }else{
                    btnGraficar.setEnabled(true);
                }
                return false;
            }
        });
        btnGraficar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtX.getText().toString().length() == 0 || txtY.getText().toString().length() == 0 ) {
                    Toast.makeText(Plano_Argand.this, "Campo Vacio", Toast.LENGTH_SHORT).show();
                } else {
                    int x= Integer.parseInt(txtX.getText().toString())*7;
                    int y= Integer.parseInt(txtY.getText().toString())*7;
                    DisplayMetrics metrics = new DisplayMetrics();
                    getWindowManager().getDefaultDisplay().getMetrics(metrics);
                    int width = metrics.widthPixels; // ancho absoluto en pixels
                    int height = metrics.heightPixels; // alto absoluto en pixels
                    Paint paint= new Paint();
                    paint.setColor(Color.BLACK);
                    paint.setStyle(Paint.Style.FILL_AND_STROKE);
                    Canvas canvas= new Canvas();
                    canvas.drawLine(width/2, height/2, width/2+x, height/2+y, paint);
                }
            }
        });
    }

    public class MyView extends View{
        public MyView(Context context){
            super(context);
        }
        @Override
        protected void onDraw(Canvas canvas){
            super.onDraw(canvas);
            int x= 30;
            int y= 20;
            DisplayMetrics metrics = new DisplayMetrics();
            getWindowManager().getDefaultDisplay().getMetrics(metrics);
            int width = metrics.widthPixels; // ancho absoluto en pixels
            int height = metrics.heightPixels; // alto absoluto en pixels
            Paint paint= new Paint();
            paint.setColor(Color.BLACK);
            paint.setStyle(Paint.Style.FILL_AND_STROKE);
            canvas.drawLine(width/2, height/2, width/2+x, height/2+y, paint);
        }
    }
}
