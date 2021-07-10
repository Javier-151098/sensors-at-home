package com.example.proyecto_sensores;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import com.google.firebase.*;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class altaUsuario extends AppCompatActivity {

    EditText editTextNombre, editTextApellido, editTextDireccion, editTextTelefono, editTextEmail, editTextPassword1, editTextPassword2;

    private DatabaseReference baseSensorAtHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alta_usuario);
        baseSensorAtHome = FirebaseDatabase.getInstance().getReference("personas");

        editTextNombre=(EditText)findViewById(R.id.editTextNombre);
        editTextApellido=(EditText)findViewById(R.id.editTextApellido);
        editTextDireccion=(EditText)findViewById(R.id.editTextDireccion);
        editTextTelefono=(EditText)findViewById(R.id.editTextTelefono);
        editTextEmail=(EditText)findViewById(R.id.editTextEmail);
        editTextPassword1=(EditText)findViewById(R.id.editTextPassword1);
        editTextPassword2=(EditText)findViewById(R.id.editTextPassword2);
    }

    public void AgregarUsuario(View view) {
        Toast.makeText(getApplicationContext(), editTextPassword1.getText(), Toast.LENGTH_SHORT).show();
        personas per=new personas("a", "a", "a", "a", "a", "a", "a");
        String a="2";
        baseSensorAtHome.child("Usuarios").child(a).setValue(per);
    }
}