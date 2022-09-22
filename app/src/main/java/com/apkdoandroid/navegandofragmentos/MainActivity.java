package com.apkdoandroid.navegandofragmentos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import com.apkdoandroid.navegandofragmentos.fragment.ContatosFragment;
import com.apkdoandroid.navegandofragmentos.fragment.ConversasFragment;

public class MainActivity extends AppCompatActivity {
    private Button btnConversas, btnContatos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setElevation(0);
        btnConversas = findViewById(R.id.buttonConversas);
        btnContatos = findViewById(R.id.buttonContatos);


        mudarFragments(R.id.frameconteudo, new ConversasFragment());

        btnConversas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mudarFragments(R.id.frameconteudo, new ConversasFragment());
            }
        });
        btnContatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mudarFragments(R.id.frameconteudo, new ContatosFragment());
            }
        });
    }


    private  void mudarFragments(int view, Fragment fragment){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(view,fragment);
        transaction.commit();
    }
}