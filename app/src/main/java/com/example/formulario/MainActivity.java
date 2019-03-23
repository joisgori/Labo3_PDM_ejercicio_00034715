package com.example.formulario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import static com.example.formulario.AppConstant.TEXT_KEY;

public class MainActivity extends AppCompatActivity {

    //Defino mis variables privadas estáticas de los edit text y los botones para guardar referencias
    private static Button mEnviar;
    private static EditText mUser, mPassword, mEmail, mGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEnviar = findViewById(R.id.btn_enviar);
        mUser = findViewById(R.id.usuario);
        mPassword = findViewById(R.id.contraseña);
        mEmail = findViewById(R.id.Email);
        mGender = findViewById(R.id.gender);

        //Creo el listener del botón para enviarlo a la nueva actividad
        mEnviar.setOnClickListener(v -> {
            String text = mUser.getText().toString();
            //Creo el intent para mandarlo a una nueva actividad, en este caso será la de Datos
            Intent mIntent = new Intent(MainActivity.this, Datos.class);

            mIntent.putExtra(TEXT_KEY, text);
            startActivity(mIntent);
        });
    }
}
