package com.example.uas_dpm_ti5j_perpustakaan;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuUtama extends AppCompatActivity {
    Button pinjam,keluar,kembali,daftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);
        pinjam = (Button) findViewById(R.id.btnpinjam);
        keluar = (Button) findViewById(R.id.btnkeluar);
        kembali = (Button) findViewById(R.id.btnkembali);
        daftar = (Button) findViewById(R.id.btndaftar);
    }
    public void pinjam (View view){
        Intent pinjambuku = new Intent(this,PinjamBuku.class);
        startActivity(pinjambuku);
    }
    public void kembali (View view){
        Intent kembalibuku = new Intent(this,KembaliBuku.class);
        startActivity(kembalibuku);
    }
    public void daftar (View view){
        Intent daftarakun = new Intent(this,DaftarAkun.class);
        startActivity(daftarakun);
    }
    public void keluar (View view){
        Intent keluarakun = new Intent(this,Login.class);
        startActivity(keluarakun);
    }
}