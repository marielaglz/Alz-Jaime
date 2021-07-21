package com.example.alz_jaime;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class codigoPassword extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_codigo_password);

        EditText Codigo1 = (EditText) findViewById(R.id.Cod1);
        EditText Codigo2 = (EditText) findViewById(R.id.Cod3);
        EditText Codigo3 = (EditText) findViewById(R.id.Cod3);
        EditText Codigo4 = (EditText) findViewById(R.id.Cod4);
        EditText Codigo5 = (EditText) findViewById(R.id.Cod5);

        //Codigo confirmado
        Button confirmcode = (Button) findViewById(R.id.ConfirmCode);
        confirmcode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1 = GenerarCodigo.getCodigo1();
                int n2 = GenerarCodigo.getCodigo2();
                int n3 = GenerarCodigo.getCodigo3();
                int n4 = GenerarCodigo.getCodigo4();
                int n5 = GenerarCodigo.getCodigo5();

                int c1 = Integer.parseInt( Codigo1.getText().toString() );
                int c2 = Integer.parseInt( Codigo2.getText().toString() );
                int c3 = Integer.parseInt( Codigo3.getText().toString() );
                int c4 = Integer.parseInt( Codigo4.getText().toString() );
                int c5 = Integer.parseInt( Codigo5.getText().toString() );

                if( c1 == n1 & c2 == n2 & c3 == n3 & c4 == n4 & c5 == n5){
                    Intent intent = new Intent (v.getContext(), newPassword.class);
                    startActivityForResult(intent, 0);
                    Toast pass = Toast.makeText(getApplicationContext(), "Ingresa la nueva contraseña", Toast.LENGTH_SHORT);
                    pass.show();
                }
                else {
                    Codigo1.setText("");
                    Codigo1.setText("");
                    Codigo1.setText("");
                    Codigo1.setText("");
                    Codigo1.setText("");
                    Toast error = Toast.makeText(getApplicationContext(), "Codigo Incorrecto", Toast.LENGTH_SHORT);
                    error.show();
                }
            }
        });
        // Reenviar codigo
        TextView resendcode = (TextView) findViewById(R.id.ReSendCode);
        resendcode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GenerarCodigo.Generar();
                //Enviar correo electornico

                // Fin
                Toast code = Toast.makeText(getApplicationContext(), "Se ah reenviado el codigo", Toast.LENGTH_SHORT);
                code.show();
            }
        });
    }
}