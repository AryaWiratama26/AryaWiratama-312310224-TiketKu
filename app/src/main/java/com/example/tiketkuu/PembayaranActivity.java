package com.example.tiketkuu;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;  // Tetap gunakan TextView, meskipun berfungsi seperti tombol
import android.widget.Toast;
import android.content.DialogInterface;
import androidx.appcompat.app.AlertDialog;

public class PembayaranActivity extends AppCompatActivity {

    TextView btnBayar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pembayaran);

        btnBayar = findViewById(R.id.bayarBtn);

        btnBayar.setOnClickListener(v -> {
            AlertDialog.Builder builder = new AlertDialog.Builder(PembayaranActivity.this);
            builder.setTitle("Konfirmasi Pembayaran")
                    .setMessage("Apakah Anda yakin ingin melanjutkan pembayaran?")
                    .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            Toast.makeText(PembayaranActivity.this, "Pembayaran berhasil!", Toast.LENGTH_SHORT).show();
                        }
                    })
                    .setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.dismiss(); // Tutup dialog
                        }
                    })
                    .create()
                    .show();
        });
    }
}
