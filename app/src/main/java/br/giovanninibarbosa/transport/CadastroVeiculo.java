package br.giovanninibarbosa.transport;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class CadastroVeiculo extends AppCompatActivity {

    private Button done;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_veiculo);

        done = (Button)findViewById(R.id.doneId);
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Context accountCreated = getApplicationContext();
                CharSequence text = "Sucesso! Aguarde a validação da sua conta. Entraremos em contato em breve.";
                int duration = Toast.LENGTH_LONG;

                Toast created = Toast.makeText(accountCreated, text, duration);
               created.setGravity(Gravity.CENTER, 0,0);
                created.show();


                Intent success = new Intent(CadastroVeiculo.this, Caminhoneiro.class);
                startActivity(success);
            }
        });
    }
}
