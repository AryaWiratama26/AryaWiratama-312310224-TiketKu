package com.example.tiketkuu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class profileActivity extends AppCompatActivity {
    ImageView backrowDua, profile, pesanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);

        backrowDua = findViewById(R.id.backrowDua);
//        profile = findViewById(R.id.profile);
//        pesanan = findViewById(R.id.pesanan);
//
        backrowDua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent balikHome = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(balikHome);
            }
        });
//
//        profile.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent goProfile = new Intent(getApplicationContext(), profileActivity.class);
//                startActivity(goProfile);
//            }
//        });
//
//        pesanan.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent goPesanan = new Intent(getApplicationContext(), PesananActivity.class);
//                startActivity(goPesanan);
//            }
//        });


    }
}