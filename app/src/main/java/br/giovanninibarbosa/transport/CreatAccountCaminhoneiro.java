package br.giovanninibarbosa.transport;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CreatAccountCaminhoneiro extends AppCompatActivity {

    private Button addveicule;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creat_account_caminhoneiro);

        addveicule = (Button)findViewById(R.id.addVeiculeId);

        addveicule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent addVeicule = new Intent(CreatAccountCaminhoneiro.this,CadastroVeiculo.class);
                startActivity(addVeicule);
            }
        });

    }
}
