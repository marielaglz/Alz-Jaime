package com.example.alz_jaime;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.alz_jaime.ui.slideshow.SlideshowFragment;

public class RegistroMedico extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_medico);

        TextView histo = (TextView) findViewById(R.id.MedicamentoTomado);
        histo.setText( RegistroMedicamentoTomado.getRegistro() );

        Button Aceptar = (Button) findViewById(R.id.AceptRegistro);
        Aceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), Principal.class);
                startActivityForResult(intent, 0);
            }
        });

    }
}