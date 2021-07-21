package com.example.alz_jaime;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        AlertDialog.Builder Confirmar = new AlertDialog.Builder(this);
        Confirmar.setMessage("¿Desea salir de la aplicacion?")
                .setCancelable(false).setPositiveButton("SI", new DialogInterface.OnClickListener() {
            @Override
            // Si Compra el pedido
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        }).setNegativeButton("NO",new DialogInterface.OnClickListener() {
            @Override
            // Si Compra el pedido
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        Confirmar.show();

        return super.onKeyDown(keyCode, event);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //Iniciar Sesion
        Button Iniciar = (Button) findViewById(R.id.IniSes);
        Iniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), Principal.class);
                startActivityForResult(intent, 0);
            }
        });
        //Registrarse
        Button Registro = (Button) findViewById(R.id.Reg);
        Registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), Registrarse.class);
                startActivityForResult(intent, 0);
            }
        });
        //Recuperar contraseña
        TextView Recuperar = (TextView) findViewById(R.id.REC);
        Recuperar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), recuperarPassword.class);
                startActivityForResult(intent, 0);
            }
        });
    }
}