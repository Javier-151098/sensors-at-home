package com.example.proyecto_sensores;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class inicioSecion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_secion);
    }

    public  void registrar(View view){
        Toast.makeText(getApplicationContext(),"inicio", Toast.LENGTH_LONG).show();
    }


    public  void olvidar(View view){
        Toast.makeText(getApplicationContext(),"olvido", Toast.LENGTH_LONG).show();
    }

}