package com.example.brillodefoco;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText etVoltaje;
    private TextView tvBrillo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etVoltaje = findViewById(R.id.etVoltaje);
        tvBrillo = findViewById(R.id.tvBrillo);
    }

    public void calcBrillo (View view){
        int voltaje;
        int brillo;
        String text;
        Foco f = new Foco();

        try {
            voltaje = Integer.parseInt(etVoltaje.getText().toString());
            f.setVoltaje(voltaje);
            brillo = f.getLumens();
            text = "El brillo es de " + brillo + " lumens";
        } catch (Exception e) {
            text = "Ingrese un valor";
        }

        tvBrillo.setText(text);
    }

}