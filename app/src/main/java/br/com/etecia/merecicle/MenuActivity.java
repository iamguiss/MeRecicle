package br.com.etecia.merecicle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.card.MaterialCardView;

import br.com.etecia.merecicle.ColetadosActivity;

public class MenuActivity extends AppCompatActivity implements View.OnClickListener {
    MaterialCardView idcoleta, idDistribuidora, idLocalizacao, idMateriais, idEmpresa, idParceiros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_layout);

        idcoleta = findViewById(R.id.idcoleta);
        idDistribuidora = findViewById(R.id.idDistribuidora);
        idLocalizacao = findViewById(R.id.idLocalizacao);
        idMateriais = findViewById(R.id.idMateriais);
        idEmpresa = findViewById(R.id.idEmpresa);
        idParceiros = findViewById(R.id.idParceiros);

        idcoleta.setOnClickListener(this);
        idDistribuidora.setOnClickListener(this);
        idLocalizacao.setOnClickListener(this);
        idMateriais.setOnClickListener(this);
        idEmpresa.setOnClickListener(this);
        idParceiros.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.idcoleta:
                startActivity(new Intent(getApplicationContext(),
                        ColetadosActivity.class));
                break;
            case R.id.idDistribuidora:
                startActivity(new Intent(getApplicationContext(),
                        DistribuidoraActivity.class));
                break;
            case R.id.idLocalizacao:
                startActivity(new Intent(getApplicationContext(),
                        LocalizaActivity.class));
                break;
            case R.id.idMateriais:
                startActivity(new Intent(getApplicationContext(),
                        MaterialActivity.class));
                break;
            case R.id.idEmpresa:
                startActivity(new Intent(getApplicationContext(),
                        EmpresaActivity.class));
                break;
            case R.id.idParceiros:
                startActivity(new Intent(getApplicationContext(),
                        UsuarioActivity.class));
                break;
        }
    }
}