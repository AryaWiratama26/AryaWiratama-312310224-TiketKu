package com.example.tiketkuu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class PesawatActivity extends AppCompatActivity {

    ImageView backrow;
    TextView goToPayment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_pesawat);

        backrow = findViewById(R.id.backrow);
        goToPayment = findViewById(R.id.goToPayment);


        backrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent balikRumah = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(balikRumah);
            }
        });

        goToPayment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pergiKePayment = new Intent(getApplicationContext(), PembayaranActivity.class);
                startActivity(pergiKePayment);
            }
        });
    }
}