package com.example.greeterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button greetButton;
    private TextView greetText;
    private EditText textId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        greetButton = findViewById(R.id.greetButton);
        greetText = findViewById(R.id.greetText);
        textId = findViewById(R.id.textId);
        greetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                greetText.setText("Hello, "+textId.getText());
            }
        });
    }
}