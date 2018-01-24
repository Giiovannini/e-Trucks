package br.giovanninibarbosa.transport;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Embarcador extends AppCompatActivity {

    private EditText user;
    private EditText password;
    private Button login;
    private Button createaccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_embarcador);


        user = (EditText)findViewById(R.id.usuarioEmbarcaId);
        password = (EditText)findViewById(R.id.passEmbarcaId);
        login = (Button)findViewById(R.id.loginIdEmbarca);
        createaccount = (Button)findViewById(R.id.criarEmbarcadorId);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String userTxt = user.getText().toString();
                String passwordTxt = password.getText().toString();

                if ( userTxt.equals("Usiminas") && passwordTxt.equals("1234") ) {

                    Intent dashboard = new Intent(Embarcador.this, DashboardEmbarcador.class);
                    startActivity(dashboard);

                }else{

                    Context wrongPassUser = getApplicationContext();
                    CharSequence text = "Usuário ou senha inválidos";
                    int duration = Toast.LENGTH_SHORT;

                    Toast error = Toast.makeText(wrongPassUser, text, duration);
                    error.show();
                }


            }
        });

        createaccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newAccount = new Intent(Embarcador.this, CreateAccountEmbarcador.class);
                startActivity(newAccount);
            }
        });
    }
}
