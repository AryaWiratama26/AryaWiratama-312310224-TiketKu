package com.example.tiketkuu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView15, gooProfile, pesananMain, homeMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView15 = findViewById(R.id.imageView15);
        gooProfile = findViewById(R.id.gooProfile);
        pesananMain = findViewById(R.id.pesananMain);
        homeMain = findViewById(R.id.homeMain);

        imageView15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent menujuDetail = new Intent(getApplicationContext(), PesawatActivity.class);
                startActivity(menujuDetail);
            }
        });

        gooProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent menujuProfile = new Intent(getApplicationContext(), profileActivity.class);
                startActivity(menujuProfile);
            }
        });

        pesananMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent menujuPesananTwo = new Intent(getApplicationContext(), PesananActivity.class);
                startActivity(menujuPesananTwo);
            }
        });

        homeMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent menujuHomeAgainTwo = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(menujuHomeAgainTwo);
            }
        });
    }
}