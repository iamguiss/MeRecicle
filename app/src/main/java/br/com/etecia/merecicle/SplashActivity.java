package br.com.etecia.merecicle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import br.com.etecia.merecicle.LoginActivity;
import br.com.etecia.merecicle.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_layout);

        //criando o carregamento da janela de login
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //abrindo a janela de login
                startActivity(new Intent(getApplicationContext(),
                        LoginActivity.class));
                finish();//fechando a janela atual
            }
        }, 3000);


    }
}