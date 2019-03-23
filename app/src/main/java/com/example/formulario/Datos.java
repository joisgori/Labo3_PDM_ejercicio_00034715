package com.example.formulario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

//import static com.example.formulario.AppConstant.TEXT_CONTRASEÑA;
//import static com.example.formulario.AppConstant TEXT_GENERO;

import static com.example.formulario.AppConstant.TEXT_CONTRASEÑA;
import static com.example.formulario.AppConstant.TEXT_EMAIL;
import static com.example.formulario.AppConstant.TEXT_GENERO;
import static com.example.formulario.AppConstant.TEXT_USUARIO;

public class Datos extends AppCompatActivity {

    private static TextView txt_UsuarioRecibido, txt_ContraRecibida, txt_GeneroRecibido, txt_EmailRecibido;
    private static Button mBotonCompartir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos);

        txt_UsuarioRecibido = findViewById(R.id.txt_usuario);
        txt_ContraRecibida = findViewById(R.id.txt_contraseña);
        txt_EmailRecibido = findViewById(R.id.txt_email);
        txt_GeneroRecibido = findViewById(R.id.txt_genero);

        //Busco mi botón share por id
        mBotonCompartir = findViewById(R.id.btn_compartir);

        Intent nIntent = getIntent();

        if(nIntent != null) {
            txt_UsuarioRecibido.setText(nIntent.getStringExtra(TEXT_USUARIO));
            txt_EmailRecibido.setText(nIntent.getStringExtra(TEXT_EMAIL));
            txt_ContraRecibida.setText(nIntent.getStringExtra(TEXT_CONTRASEÑA));
            txt_GeneroRecibido.setText(nIntent.getStringExtra(TEXT_GENERO));

        }

        //Acá creo mi evento para mandarlo a la nueva activity
        mBotonCompartir.setOnClickListener(v -> {
            //Acá reuso las variables que ya tienen el contenido
            String textU = txt_UsuarioRecibido.getText().toString();
            textU = textU + txt_EmailRecibido.getText().toString();
            textU = textU + txt_ContraRecibida.getText().toString();
            textU = textU + txt_GeneroRecibido.getText().toString();
            String textP = txt_EmailRecibido.getText().toString();
            String textE = txt_ContraRecibida.getText().toString();
            String textG = txt_GeneroRecibido.getText().toString();

            Intent UserIntent = new Intent();
            /*Intent PassIntent = new Intent();
            Intent EmailIntent = new Intent();
            Intent GeneroIntent = new Intent();*/

            //Esto lo setteamos para decirle a la aplicación qué tipo de datos va a recibir y está lista...

            UserIntent.setType("text/plain");
            /*PassIntent.setType("text/plain");
            EmailIntent.setType("text/plain");
            GeneroIntent.setType("text/plain");*/

            //Setteamos un tipo de acción

            UserIntent.setAction(Intent.ACTION_SEND);
            /*PassIntent.setAction(Intent.ACTION_SEND);
            EmailIntent.setAction(Intent.ACTION_SEND);
            GeneroIntent.setAction(Intent.ACTION_SEND);*/

            //Acá hay una llave que ya la co

            UserIntent.putExtra(Intent.EXTRA_TEXT, textU);
            /*PassIntent.putExtra(Intent.EXTRA_TEXT, textP);
            EmailIntent.putExtra(Intent.EXTRA_TEXT, textE);
            GeneroIntent.putExtra(Intent.EXTRA_TEXT, textG);*/

            startActivity(UserIntent);
            /*startActivity(PassIntent);
            startActivity(EmailIntent);
            startActivity(GeneroIntent);*/
        });
    }
}
