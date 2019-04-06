package com.sti.findview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button botao01;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Recuperando TextView do XML
        final TextView texto01 = findViewById(R.id.tv_hello_word);
//       resgatando texto do TextView
        String textoBotao = texto01.getText().toString();
//       Recuperando botão do XML
        botao01 = findViewById(R.id.btn_botao);
//        Definindo que o texto do botão será igual ao texto que está no textview
        botao01.setText(textoBotao);
//        Alterando o nome do textView
        texto01.setText("Olá Mundo!");

        botao01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Definir ações aqui!!!

                texto01.setText("Texto novo!");

            }
        });
    }
    public void mudarNome(View view){
        botao01.setText("Botão Clicado");
    }
}


