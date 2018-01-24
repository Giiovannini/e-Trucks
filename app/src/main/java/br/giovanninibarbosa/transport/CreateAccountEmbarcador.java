package br.giovanninibarbosa.transport;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CreateAccountEmbarcador extends AppCompatActivity {

    private Button cadastrarEmbarcador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account_embarcador);

        cadastrarEmbarcador = (Button)findViewById(R.id.concluirEmbarcador);
        cadastrarEmbarcador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Context accountCreated = getApplicationContext();
                CharSequence text = "Sucesso! Aguarde a validação da sua conta. Entraremos em contato em breve.";
                int duration = Toast.LENGTH_LONG;

                Toast created = Toast.makeText(accountCreated, text, duration);
                created.setGravity(Gravity.CENTER, 0,0);
                created.show();

                Intent login = new Intent(CreateAccountEmbarcador.this, Embarcador.class);
                startActivity(login);
            }
        });
    }
}
