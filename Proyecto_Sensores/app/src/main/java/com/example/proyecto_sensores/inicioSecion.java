package com.example.proyecto_sensores;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class inicioSecion extends AppCompatActivity {

    EditText email, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_secion);

        email=(EditText)findViewById(R.id.editTextTextPersonNameEmail);
        password= (EditText)findViewById(R.id.editTextPassword);
    }

    public void iniciarSecion(View view) {
        Toast.makeText(getApplicationContext(), "Prueba ejemplo", Toast.LENGTH_SHORT).show();
        Intent menu_principal= new  Intent (this, altaUsuario.class);
        startActivity(menu_principal);
    }

    public void olvideContra(View view) {
        Toast.makeText(getApplicationContext(),"olvido", Toast.LENGTH_LONG).show();

        Intent olvidoC= new  Intent (this, olvideContrasenia.class);
        startActivity(olvidoC);
    }

    public void ingresarInicioSecion(View view) {
        Toast.makeText(getApplicationContext(),email.getText().toString()+" ; "+password.getText().toString(), Toast.LENGTH_LONG).show();
    }
}