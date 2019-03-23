package com.example.formulario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

//import static com.example.formulario.AppConstant.TEXT_CONTRASEÑA;
//import static com.example.formulario.AppConstant TEXT_GENERO;

import static com.example.formulario.AppConstant.TEXT_CONTRASEÑA;
import static com.example.formulario.AppConstant.TEXT_EMAIL;
import static com.example.formulario.AppConstant.TEXT_GENERO;
import static com.example.formulario.AppConstant.TEXT_USUARIO;

public class Datos extends AppCompatActivity {

    private static TextView txt_UsuarioRecibido, txt_ContraRecibida, txt_GeneroRecibido, txt_EmailRecibido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos);

        txt_UsuarioRecibido = findViewById(R.id.txt_usuario);
        txt_ContraRecibida = findViewById(R.id.txt_contraseña);
        txt_EmailRecibido = findViewById(R.id.txt_email);
        txt_GeneroRecibido = findViewById(R.id.txt_genero);


        Intent nIntent = getIntent();

        if(nIntent != null) {
            txt_UsuarioRecibido.setText(nIntent.getStringExtra(TEXT_USUARIO));
            txt_EmailRecibido.setText(nIntent.getStringExtra(TEXT_EMAIL));
            txt_ContraRecibida.setText(nIntent.getStringExtra(TEXT_CONTRASEÑA));
            txt_GeneroRecibido.setText(nIntent.getStringExtra(TEXT_GENERO));

        }
    }
}
