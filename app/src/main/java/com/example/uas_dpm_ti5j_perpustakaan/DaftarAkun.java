package com.example.uas_dpm_ti5j_perpustakaan;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DaftarAkun extends AppCompatActivity {
    Button regis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_akun);
        regis = (Button) findViewById(R.id.btnregis);
    }
    public void regis(View view){
        Intent regisakun = new Intent(this,Register.class);
        startActivity(regisakun);
    }
}