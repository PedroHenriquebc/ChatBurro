package com.example.chatburro;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SegundaActivity extends AppCompatActivity {

    private TextView texto2;
    private Button botao2;
    private EditText entradadetexto2;
    private String msg1;
    private String msg2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        msg1 = getIntent().getStringExtra("KEY_MSG");
        texto2 = findViewById(R.id.texto2);
        texto2.setText(msg1);

        entradadetexto2 = findViewById(R.id.entradadetexto2);

        botao2 = findViewById(R.id.botao2);
        botao2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                msg2 = msg1  + "\n" + entradadetexto2.getText().toString();
                texto2.setText(msg2);

                Intent intent2 = new Intent(SegundaActivity.this, MainActivity.class);
                intent2.putExtra("KEY_MSG2", msg2);

                startActivity(intent2);
            }
        });
    }
}