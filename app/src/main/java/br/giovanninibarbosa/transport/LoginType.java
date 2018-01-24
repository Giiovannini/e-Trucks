package br.giovanninibarbosa.transport;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginType extends AppCompatActivity {

    private Button autonomo;
    private Button transportadora;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_type);

        autonomo = (Button)findViewById(R.id.autonomoId);
        transportadora = (Button)findViewById(R.id.daTransportadoraId);

        autonomo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent passData = new Intent(LoginType.this, Caminhoneiro.class);
                startActivity(passData);
            }
        });

        transportadora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goTo = new Intent(LoginType.this, DriverTransportadora.class);
                startActivity(goTo);
            }
        });
    }
}
