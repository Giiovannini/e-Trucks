package br.giovanninibarbosa.transport;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login extends AppCompatActivity {

    private Button btnEmbarcador;
    private Button btnTransportador;
    private Button btnCaminhoneiro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnEmbarcador = (Button)findViewById(R.id.btnEmbarcadorId);
        btnTransportador = (Button)findViewById(R.id.btnTransportadorId);
        btnCaminhoneiro = (Button)findViewById(R.id.btnCaminhoneiroId);

        btnEmbarcador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent embarque = new Intent(Login.this, Embarcador.class);
                startActivity(embarque);

            }
        });

        btnTransportador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent transporte = new Intent(Login.this, Transportador.class);
                startActivity(transporte);

            }
        });

        btnCaminhoneiro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent caminhao = new Intent(Login.this, LoginType.class);
                startActivity(caminhao);

            }
        });
    }
}
