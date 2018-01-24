package br.giovanninibarbosa.transport;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.content.Intent;
import android.widget.Toast;

public class Caminhoneiro extends AppCompatActivity {

    private EditText user;
    private EditText password;
    private Button login;
    private Button createaccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caminhoneiro);

        user = (EditText)findViewById(R.id.usuarioCaminhaId);
        password = (EditText)findViewById(R.id.passCaminhaId);
        login = (Button)findViewById(R.id.loginIdCaminha);
        createaccount = (Button)findViewById(R.id.criarCaminhoneiroId);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String userTxt = user.getText().toString();
                String passwordTxt = password.getText().toString();

                if ( userTxt.equals("joaodascouves") && passwordTxt.equals("12345") ) {

                    Intent dashboard = new Intent(Caminhoneiro.this, DashboardCaminhoneiro.class);
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
                Intent newAccount = new Intent(Caminhoneiro.this, CreatAccountCaminhoneiro.class);
                startActivity(newAccount);
            }
        });
    }
}
