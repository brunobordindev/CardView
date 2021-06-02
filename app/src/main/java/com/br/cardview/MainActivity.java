package com.br.cardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private CardView cardDois;
    private CardView cardTres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //------------------------ cardDois----------------------------
        cardDois = findViewById(R.id.cardDois);

        cardDois.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //startActivity(new Intent(getBaseContext(), DoisActivity.class));
                Intent abrirDois = new Intent(getBaseContext(), DoisActivity.class);
                startActivity(abrirDois);
            }
        });
        //---------------------Fim cardDois -----------------------

        cardTres = findViewById(R.id.cardTres);

        cardTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abrirTres = new Intent(getBaseContext(), TresActivity.class);
                startActivity(abrirTres);
            }
        });



    }

    public void quemsou(View view){
        startActivity(new Intent(this, UmActivity.class));
    }






}