package com.example.semanaradiogroup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

/*
Autor: Juan Francisco Sánchez González
Fecha: 01/11/2022
Clase: Actividad principal que recoge el texto (día) del RadioButton pulsado por el
usuario y lo muestra en el mensaje
*/

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();

        TextView mensaje = (TextView) findViewById(R.id.tvMensajeBienvenida);
        RadioGroup diasSemana = (RadioGroup) findViewById(R.id.rgSemana);

        // Listener para controlar el evento de pulsado en alguno de los RadioButton y recoger su texto
        diasSemana.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                int radioBtnSeleccionadoId = diasSemana.getCheckedRadioButtonId();
                RadioButton radioBtnSeleccionado = (RadioButton) findViewById(radioBtnSeleccionadoId);
                mensaje.setText(getString(R.string.mensajeSaludo) + radioBtnSeleccionado.getText().toString());
            }
        });
    }

}