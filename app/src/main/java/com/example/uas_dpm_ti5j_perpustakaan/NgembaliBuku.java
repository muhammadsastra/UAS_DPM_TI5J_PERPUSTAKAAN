package com.example.uas_dpm_ti5j_perpustakaan;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NgembaliBuku extends AppCompatActivity {
    Button utama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ngembali_buku);
        utama = (Button) findViewById(R.id.btnutama2);
    }
    public void utama (View view){
        Intent halamanutama = new Intent(this,MenuUtama.class);
        startActivity(halamanutama);

    }
}