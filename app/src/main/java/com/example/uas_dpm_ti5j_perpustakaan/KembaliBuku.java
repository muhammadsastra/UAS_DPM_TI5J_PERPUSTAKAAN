package com.example.uas_dpm_ti5j_perpustakaan;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class KembaliBuku extends AppCompatActivity {
    Button mulang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kembali_buku);
        mulang = (Button) findViewById(R.id.btnmulang);
    }
    public void mulang (View view){
        Intent mulangbuku = new Intent(this,NgembaliBuku.class);
        startActivity(mulangbuku);
    }
}