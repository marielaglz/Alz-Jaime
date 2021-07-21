package com.example.alz_jaime;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class EditPersonaAcargo extends AppCompatActivity {

    int numCargo = DatosCuidadores.getNumcuidador();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_persona_acargo);

        EditText nombre = (EditText) findViewById(R.id.CuidadorNombre);
        EditText direccion = (EditText) findViewById(R.id.CuidadorDireccion);
        EditText telefono = (EditText) findViewById(R.id.CuidadorTelefono);

        Button Save = (Button) findViewById(R.id.GCargo);
        Save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Nombre = nombre.getText().toString();
                String Direccion = direccion.getText().toString();
                String Telefono = telefono.getText().toString();

                if(numCargo == 1)
                    DatosCuidadores.setcuidador1(Nombre,Direccion,Telefono);
                if(numCargo == 2)
                    DatosCuidadores.setcuidador2(Nombre,Direccion,Telefono);
                if(numCargo == 3)
                    DatosCuidadores.setcuidador3(Nombre,Direccion,Telefono);
                if(numCargo == 4)
                    DatosCuidadores.setcuidador4(Nombre,Direccion,Telefono);

                Intent intent = new Intent (v.getContext(), PersonasAcargo.class);
                startActivityForResult(intent, 0);

                Toast Guardado = Toast.makeText(getApplicationContext(), "Se ah actualizado el contacto", Toast.LENGTH_SHORT);
                Guardado.show();
            }
        });
    }
}