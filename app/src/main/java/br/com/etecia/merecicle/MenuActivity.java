package br.com.etecia.merecicle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.card.MaterialCardView;

import br.com.etecia.merecicle.ColetadosActivity;

public class MenuActivity extends AppCompatActivity  {
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

        idcoleta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),
                        ColetadosActivity.class));
            }
        });
        idDistribuidora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),
                        DistribuidoraActivity.class));
            }
        });
        idLocalizacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),
                        LocalizaActivity.class));
            }
        });
        idMateriais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),
                        MaterialActivity.class));
            }
        });
        idEmpresa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),
                        EmpresaActivity.class));
            }
        });
        idParceiros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),
                        UsuarioActivity.class));
            }
        });

    }
}