package com.example.eje12info;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.eje12info.Configuraciones.Persona;

public class MainActivity extends AppCompatActivity
{
    EditText txtNombres,txtApellidos,txtEdad,txtEmail;
    Button btnEnviar;


    @Override
    protected void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNombres = (EditText) findViewById(R.id.txtNombres);
        txtApellidos = (EditText) findViewById(R.id.txtApellidos);
        txtEdad = (EditText) findViewById(R.id.txtEdad);
        txtEmail = (EditText) findViewById(R.id.txtEmail);
        btnEnviar = (Button) findViewById(R.id.btnEnviar);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ObtenerInformacion();
                Toast.makeText(getApplicationContext(),"Enviado con exito!",Toast.LENGTH_LONG).show();
            }
        });
    }

    private void ObtenerInformacion()
    {
        Persona persona = null;
        persona = new Persona();

        Intent intent = new Intent(getApplicationContext(),ActivityMostrar.class);

        persona.setNombres(txtNombres.getText().toString());
        persona.setApellidos(txtApellidos.getText().toString());
        persona.setEdad(txtEdad.getText().toString());
        persona.setCorreo(txtEmail.getText().toString());

        intent.putExtra("nombres",persona.getNombres());
        intent.putExtra("apellidos",persona.getApellidos());
        intent.putExtra("edad",persona.getEdad()+"");
        intent.putExtra("correo",persona.getCorreo());

        startActivity(intent);
    }
}