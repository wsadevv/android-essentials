package com.testing.wsadevv.testing;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;




public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button botaoToast = (Button) findViewById(R.id.botaoToastID);
        Button botaoAlert = (Button) findViewById(R.id.botaoAlertID);
        Button botaoSnack  = (Button) findViewById(R.id.botaoSnackID);

        botaoToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Toast.makeText(MainActivity.this, "Clicou no botão", Toast.LENGTH_SHORT).show();
                }
        });
        botaoAlert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builderAlerta;
                builderAlerta = new AlertDialog.Builder(MainActivity.this);
                builderAlerta.setTitle("Título do Alerta!");
                builderAlerta.setMessage("Qual a sua opção?");
                builderAlerta.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Log.i("AlertDialog","Clicou no sim");
                    }
                });
                builderAlerta.setNegativeButton("Não", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Log.i("AlertDialog","Clicou no não");
                    }
                });

                AlertDialog meuAlerta = builderAlerta.create();
                meuAlerta.show();
                Log.i("LogAlert",meuAlerta.toString());
            }
        });
        botaoSnack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar snackbar = Snackbar.make(view,"Meu Snackbar",Snackbar.LENGTH_LONG);
                snackbar.show();
            }
        });


    }

}
