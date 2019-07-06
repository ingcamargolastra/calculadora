package com.example.mycalculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView resultado;
    EditText num1,num2;
    double n1, n2, suma;
    String opciones[];
    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Captura de los objetos utilizados
        num1 = findViewById(R.id.txtNumeroUno);
        num2 = findViewById(R.id.txtNumeroDos);
        resultado = findViewById(R.id.txtResultado);
        spinner = findViewById(R.id.cmbOperacion);
        //Traemos las opciones en un Array de Strings
        opciones = getResources().getStringArray(R.array.operaciones);
        //Creamos el adapter indicando donsde se va a colocar como se va a visualizar y que se va a mostrar
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_spinner_item, opciones);
        //pasamos el adapter al combo
        spinner.setAdapter(adapter);
    }

    public void calcular(View v){
        n1 = Double.parseDouble(num1.getText().toString());
        n2 = Double.parseDouble(num2.getText().toString());
        suma = n1 + n2;
        resultado.setText(""+suma);
    }



}
