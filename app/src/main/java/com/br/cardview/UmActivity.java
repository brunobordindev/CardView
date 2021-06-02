package com.br.cardview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class UmActivity extends AppCompatActivity {

    private ImageView voltar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_um);

        voltar = findViewById(R.id.imgVoltar);
        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                //ou em vez de colocar esse starAtctivity..... só colocar finish();
            }
        });
    }
}