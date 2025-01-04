package com.example.tiketkuu;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    TextView MainTarget, BackToDaftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login); // Pastikan login.xml ada

        // Menemukan elemen berdasarkan ID
        MainTarget = findViewById(R.id.MainTarget);
        BackToDaftar = findViewById(R.id.BackToDaftar);

        // Mengatur aksi ketika MainTarget diklik
        MainTarget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Membuka MainActivity
                Intent menujuMain = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(menujuMain);
                finish(); // Menutup LoginActivity setelah berpindah ke MainActivity
            }
        });

        // Mengatur aksi ketika BackToDaftar diklik
        BackToDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Membuka DaftarActivity
                Intent balikDaftar = new Intent(getApplicationContext(), DaftarActivity.class);
                startActivity(balikDaftar);
                finish(); // Menutup LoginActivity setelah berpindah ke DaftarActivity
            }
        });
    }
}
