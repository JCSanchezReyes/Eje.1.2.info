package com.example.eje12info;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityMostrar extends AppCompatActivity {
    TextView amNombre,amApellido,amEdad,amCorreo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar);

        amNombre = (TextView) findViewById(R.id.amtxtNombre);
        amApellido = (TextView) findViewById(R.id.amtxtApellido);
        amEdad = (TextView) findViewById(R.id.amtxtEdad);
        amCorreo = (TextView) findViewById(R.id.amtxtEmail);

        String nombre = getIntent().getStringExtra("nombres");
        String apellido = getIntent().getStringExtra("apellidos");
        String edad = getIntent().getStringExtra("edad");
        String correo = getIntent().getStringExtra("correo");

        amNombre.setText(nombre);
        amApellido.setText(apellido);
        amEdad.setText(edad);
        amCorreo.setText(correo);
    }
}