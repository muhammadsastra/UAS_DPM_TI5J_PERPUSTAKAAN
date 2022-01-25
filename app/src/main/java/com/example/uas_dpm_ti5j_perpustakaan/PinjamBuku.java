package com.example.uas_dpm_ti5j_perpustakaan;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PinjamBuku extends AppCompatActivity {
    Button kirim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pinjam_buku);
        kirim = (Button) findViewById(R.id.btnkirim);
    }
    public void kirim (View view){
        Intent kirimbuku = new Intent(this,KirimBuku.class);
        startActivity(kirimbuku);
    }
}