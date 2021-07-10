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

    EditText editTextNombreT, editTextApellidoT, editTextDireccionT, editTextTelefonoT, editTextEmailT, editTextPassword1T, editTextPassword2T;

    private DatabaseReference baseSensorAtHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alta_usuario);
        baseSensorAtHome = FirebaseDatabase.getInstance().getReference("personas");

        editTextNombreT=(EditText)findViewById(R.id.editTextNombre);
        editTextApellidoT=(EditText)findViewById(R.id.editTextApellido);
        editTextDireccionT=(EditText)findViewById(R.id.editTextDireccion);
        editTextTelefonoT=(EditText)findViewById(R.id.editTextTelefono);
        editTextEmailT=(EditText)findViewById(R.id.editTextEmail);
        editTextPassword1T=(EditText)findViewById(R.id.editTextPassword1);
        editTextPassword2T=(EditText)findViewById(R.id.editTextPassword2);
    }

    public void AgregarUsuario(View view) {

        personas per=new personas(
                editTextNombreT.getText().toString(),
                editTextApellidoT.getText().toString(),
                editTextDireccionT.getText().toString(),
                editTextTelefonoT.getText().toString(),
                editTextEmailT.getText().toString(),
                editTextPassword1T.getText().toString(),
                editTextPassword2T.getText().toString());
        baseSensorAtHome.setValue(per);

        Toast.makeText(getApplicationContext(), "Usuario Agregado", Toast.LENGTH_SHORT).show();
    }

    public void irInicioSecion(View view) {
        onBackPressed();
    }
}