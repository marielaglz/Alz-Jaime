package com.example.alz_jaime;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class recuperarPassword extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recuperar_password);

        EditText correo = (EditText) findViewById(R.id.RecuperarCorreo);

        Button sendcode = (Button) findViewById(R.id.SendCode);
        sendcode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GenerarCodigo.Generar();

                String Correo = correo.getText().toString();
                GenerarCodigo.setCorreo( correo.getText().toString() );

                String codigo = "";
                codigo += String.valueOf( GenerarCodigo.getCodigo1() );
                codigo += " " + String.valueOf( GenerarCodigo.getCodigo1() );
                codigo += " " + String.valueOf( GenerarCodigo.getCodigo1() );
                codigo += " " + String.valueOf( GenerarCodigo.getCodigo1() );
                codigo += " " + String.valueOf( GenerarCodigo.getCodigo1() );

                // Enviar correo con el codigo
                mandarMail(Correo, codigo);
                //

                Intent intent = new Intent (v.getContext(), codigoPassword.class);
                startActivityForResult(intent, 0);
                Toast code = Toast.makeText(getApplicationContext(), codigo, Toast.LENGTH_SHORT);
                code.show();
            }
        });
    }
    private void mandarMail(String Correo, String Codigo){
        String mensaje = "Buen dia (Nombre del dueño de la cuenta) \n\n"
                + "Su codigo de recuperacion de cuenta es:\n\n"
                + Codigo + "\n\n"
                + "No comparta con nadie. \n"
                + "Atentamente el equipo de desarrollo de AlzJaime.";

        Intent email = new Intent(Intent.ACTION_SEND);
        email.setData(Uri.parse("mailto:"));
        email.setType("text/plain");
        email.putExtra(Intent.EXTRA_EMAIL, Correo);
        email.putExtra(Intent.EXTRA_SUBJECT, "Recuperacion de Cuenta");
        email.putExtra(Intent.EXTRA_TEXT,mensaje);

        startActivity(Intent.createChooser(email, "send Email"));
    }
}