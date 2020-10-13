package com.example.chatburro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button botao1;
    private EditText entradadetexto;
    private TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        entradadetexto = findViewById(R.id.entradadetexto);
        texto = findViewById(R.id.texto);
        botao1 = findViewById(R.id.botao1);

        final String msg1  = getIntent().getStringExtra("KEY_MSG2");
        texto.setText(msg1);

        botao1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg2 = entradadetexto.getText().toString()  + "\n" + msg1 + "\n";
                texto.setText(msg2);
                Intent intent = new Intent(MainActivity.this, SegundaActivity.class);
                intent.putExtra("KEY_MSG", msg2);
                startActivity(intent);
            }
        });
    }
}