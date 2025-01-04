package com.example.tiketkuu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FirstActivity extends AppCompatActivity {

    TextView loginText, daftarText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first);

        loginText = findViewById(R.id.loginText);
        daftarText = findViewById(R.id.daftarText);

        loginText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent menujuLogin = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(menujuLogin);
            }
        });

        daftarText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent menujuDaftar = new Intent(getApplicationContext(), DaftarActivity.class);
                startActivity(menujuDaftar);
            }
        });
    }
}