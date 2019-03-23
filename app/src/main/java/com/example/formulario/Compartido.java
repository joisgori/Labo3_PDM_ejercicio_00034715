package com.example.formulario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Compartido extends AppCompatActivity {

    private static TextView sUser, sPass, sEmail, sGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compartido);

        sUser = findViewById(R.id.User_Com);
        sPass = findViewById(R.id.Pass_Com);
        sEmail = findViewById(R.id.Email_Com);
        sGender = findViewById(R.id.Gender_Com);

        Intent ulIntent = getIntent();

        if (ulIntent!=null){

            sUser.setText(ulIntent.getStringExtra(ulIntent.EXTRA_TEXT)); //Esta debe ser la misma llave

        }
    }
}
