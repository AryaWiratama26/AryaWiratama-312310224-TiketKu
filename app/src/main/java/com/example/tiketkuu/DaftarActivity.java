package com.example.tiketkuu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DaftarActivity extends AppCompatActivity {
    TextView LoginTarget, LoginTargetTwo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.daftar);

        LoginTarget = findViewById(R.id.LoginTarget);
        LoginTargetTwo = findViewById(R.id.LoginTargetTwo);

        LoginTarget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent menujuLogin = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(menujuLogin);
            }
        });

        LoginTargetTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent menujuLoginTwo = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(menujuLoginTwo);
            }
        });
    }
}