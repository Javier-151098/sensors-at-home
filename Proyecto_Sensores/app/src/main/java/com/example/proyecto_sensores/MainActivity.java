package com.example.proyecto_sensores;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Se modifica para ejecutar la ventana de inicio

    }

    public void ventanaPrincipal(View view) {
        Toast.makeText(getApplicationContext(), "Prueba ejemplo", Toast.LENGTH_SHORT).show();
        Intent menu_principal= new  Intent (this, modificarUsuario.class);
        startActivity(menu_principal);
    }
}