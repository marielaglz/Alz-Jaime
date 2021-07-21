package com.example.alz_jaime;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class PersonasAcargo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personas_acargo);

        TextView nom1 = (TextView) findViewById( R.id.cargoNom1 );
        TextView nom2 = (TextView) findViewById( R.id.cargoNom2 );
        TextView nom3 = (TextView) findViewById( R.id.cargoNom3 );
        TextView nom4 = (TextView) findViewById( R.id.cargoNom4 );

        TextView dir1 = (TextView) findViewById( R.id.cargoDir1 );
        TextView dir2 = (TextView) findViewById( R.id.cargoDir2 );
        TextView dir3 = (TextView) findViewById( R.id.cargoDir3 );
        TextView dir4 = (TextView) findViewById( R.id.cargoDir4 );

        TextView tel1 = (TextView) findViewById( R.id.cargotelefono1 );
        TextView tel2 = (TextView) findViewById( R.id.cargotelefono2 );
        TextView tel3 = (TextView) findViewById( R.id.cargotelefono3 );
        TextView tel4 = (TextView) findViewById( R.id.cargotelefono4 );

        nom1.setText( DatosCuidadores.getNomCui1() );
        nom2.setText( DatosCuidadores.getNomCui2() );
        nom3.setText( DatosCuidadores.getNomCui3() );
        nom4.setText( DatosCuidadores.getNomCui4() );

        dir1.setText( DatosCuidadores.getDirCui1() );
        dir2.setText( DatosCuidadores.getDirCui2() );
        dir3.setText( DatosCuidadores.getDirCui3() );
        dir4.setText( DatosCuidadores.getDirCui4() );

        tel1.setText( DatosCuidadores.getTelCui1() );
        tel2.setText( DatosCuidadores.getTelCui2() );
        tel3.setText( DatosCuidadores.getTelCui3() );
        tel4.setText( DatosCuidadores.getTelCui4() );

        ImageView regresar = (ImageView) findViewById(R.id.CargoRegresar);
        regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), Principal.class);
                startActivityForResult(intent, 0);
            }
        });

        Button e1 = (Button) findViewById(R.id.edit1);
        e1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatosCuidadores.setNumcuidador(1);

                Intent intent = new Intent (v.getContext(), EditPersonaAcargo.class);
                startActivityForResult(intent, 0);
            }
        });

        Button e2 = (Button) findViewById(R.id.edit2);
        e2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatosCuidadores.setNumcuidador(2);

                Intent intent = new Intent (v.getContext(), EditPersonaAcargo.class);
                startActivityForResult(intent, 0);
            }
        });

        Button e3 = (Button) findViewById(R.id.edit3);
        e3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatosCuidadores.setNumcuidador(3);

                Intent intent = new Intent (v.getContext(), EditPersonaAcargo.class);
                startActivityForResult(intent, 0);
            }
        });

        Button e4 = (Button) findViewById(R.id.edit4);
        e4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatosCuidadores.setNumcuidador(4);

                Intent intent = new Intent (v.getContext(), EditPersonaAcargo.class);
                startActivityForResult(intent, 0);
            }
        });
    }
}