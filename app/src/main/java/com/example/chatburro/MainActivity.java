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
    private String msg1;
    private String msg2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        msg1 = getIntent().getStringExtra("KEY_MSG2");
        if (msg1 == null) {
            msg1 = "";
        }
        texto = findViewById(R.id.texto);
        texto.setText(msg1);

        entradadetexto = findViewById(R.id.entradadetexto);

        botao1 = findViewById(R.id.botao1);
        botao1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                msg2 = msg1 + "\n" + entradadetexto.getText().toString();
                texto.setText(msg2);

                Intent intent = new Intent(MainActivity.this, SegundaActivity.class);
                intent.putExtra("KEY_MSG", msg2);

                startActivity(intent);
            }
        });
    }
}