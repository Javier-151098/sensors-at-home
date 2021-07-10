package com.example.proyecto_sensores;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class olvideContrasenia extends AppCompatActivity {

    EditText email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_olvide_contrasenia);

        email= (EditText) findViewById(R.id.editTextTextEmail);

    }



    public void irAtras(View view) {
        onBackPressed();
    }

    public void enviarEmail(View view) {
        Toast.makeText(getApplicationContext(), email.getText().toString(), Toast.LENGTH_SHORT).show();
    }
}