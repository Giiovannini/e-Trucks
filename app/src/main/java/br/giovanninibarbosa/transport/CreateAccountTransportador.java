package br.giovanninibarbosa.transport;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class CreateAccountTransportador extends AppCompatActivity {

    private Button cadastrarNovoTransportador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account_transportador);

        cadastrarNovoTransportador = (Button)findViewById(R.id.cadastrarTransportadora);

        cadastrarNovoTransportador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Context accountCreated = getApplicationContext();
                CharSequence text = "Sucesso! Aguarde a validação da sua conta. Entraremos em contato em breve.";
                int duration = Toast.LENGTH_LONG;

                Toast created = Toast.makeText(accountCreated, text, duration);
                created.setGravity(Gravity.CENTER, 0,0);
                created.show();

                Intent success = new Intent(CreateAccountTransportador.this, Transportador.class);
                startActivity(success);
            }
        });
    }
}
