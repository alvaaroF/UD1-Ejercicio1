package com.example.ejercicio1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int total;
    int total1;
    int total2;
    int total3;
    int total4;

    // CONTADORES
    TextView contador;
    TextView contador1;
    TextView contador2;
    TextView contador3;
    TextView contador4;

    // RESETEAR
    Button reset;
    Button reset1;
    Button reset2;
    Button reset3;
    Button reset4;

    // AUMENTOS
    Button aum1;
    Button aum2;
    Button aum3;
    Button aum4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contador = findViewById(R.id.contador);
        contador1 = findViewById(R.id.contador1);
        contador2 = findViewById(R.id.contador2);
        contador3 = findViewById(R.id.contador3);
        contador4 = findViewById(R.id.contador4);

        reset = findViewById(R.id.reset);
        reset1 = findViewById(R.id.reset1);
        reset2 = findViewById(R.id.reset2);
        reset3 = findViewById(R.id.reset3);
        reset4 = findViewById(R.id.reset4);

        aum1 = findViewById(R.id.aum1);
        aum2 = findViewById(R.id.aum2);
        aum3 = findViewById(R.id.aum3);
        aum4 = findViewById(R.id.aum4);

        // ACCIONES RESETEAR
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                total = 0;
                total1 = 0;
                total2 = 0;
                total3 = 0;
                total4 = 0;

                contador.setText(String.valueOf(total));
                contador1.setText(String.valueOf(total1));
                contador2.setText(String.valueOf(total2));
                contador3.setText(String.valueOf(total3));
                contador4.setText(String.valueOf(total4));
            }
        });

        reset1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                total1 = 0;
                total = total1 + total2 + total3 + total4;
                contador1.setText(String.valueOf(total1));
                contador.setText(String.valueOf(total));
            }
        });

        reset2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                total2 = 0;
                total = total1 + total2 + total3 + total4;
                contador2.setText(String.valueOf(total2));
                contador.setText(String.valueOf(total));
            }
        });

        reset3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                total3 = 0;
                total = total1 + total2 + total3 + total4;
                contador3.setText(String.valueOf(total3));
                contador.setText(String.valueOf(total));
            }
        });

        reset4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                total4 = 0;
                total = total1 + total2 + total3 + total4;
                contador4.setText(String.valueOf(total4));
                contador.setText(String.valueOf(total));
            }
        });

        //ACCIONES AUMENTAR
        aum1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                total1++;
                total = total1 + total2 + total3 + total4;
                contador1.setText(String.valueOf(total1));
                contador.setText(String.valueOf(total));
            }
        });

        aum2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                total2++;
                total = total1 + total2 + total3 + total4;
                contador2.setText(String.valueOf(total2));
                contador.setText(String.valueOf(total));
            }
        });

        aum3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                total3++;
                total = total1 + total2 + total3 + total4;
                contador3.setText(String.valueOf(total3));
                contador.setText(String.valueOf(total));
            }
        });

        aum4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                total4++;
                total = total1 + total2 + total3 + total4;
                contador4.setText(String.valueOf(total4));
                contador.setText(String.valueOf(total));
            }
        });
    }
}