package com.example.formulario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static com.example.formulario.AppConstant.TEXT_KEY;

public class Datos extends AppCompatActivity {

    private static TextView textRecibido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos);

        textRecibido = findViewById(R.id.txt_usuario);

        Intent nIntent = getIntent();

        if(nIntent != null) {
            textRecibido.setText(nIntent.getStringExtra(TEXT_KEY));
        }
    }
}
