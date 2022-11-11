package com.natanael.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText txtNum1, txtNum2;
    private TextView txtResultado;
    private EditorInfo btSomar, btSubtrair, btMultiplicar, btDividir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNum1 = findViewById(R.id.txtNum1);
        txtNum2 = findViewById(R.id.txtNum2);
        txtResultado = findViewById(R.id.txtResultado);
    }
    public void somar(View view){
        int valor1 = Integer.parseInt(txtNum1.getText().toString());
        int valor2 = Integer.parseInt(txtNum2.getText().toString());

        txtResultado.setText(String.valueOf(valor1 + valor2));
    }

}