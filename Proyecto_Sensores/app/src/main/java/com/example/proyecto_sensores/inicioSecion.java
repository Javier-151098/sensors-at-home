package com.example.proyecto_sensores;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class inicioSecion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_secion);
    }

    public  void olvidar(View view){
        Toast.makeText(getApplicationContext(),"olvido", Toast.LENGTH_LONG).show();
    }

    public void iniciarSecion(View view) {
        Toast.makeText(getApplicationContext(), "Prueba ejemplo", Toast.LENGTH_SHORT).show();
        Intent menu_principal= new  Intent (this, altaUsuario.class);
        startActivity(menu_principal);
    }
}