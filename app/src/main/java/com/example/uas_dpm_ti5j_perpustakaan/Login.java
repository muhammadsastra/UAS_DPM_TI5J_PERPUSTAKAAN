package com.example.uas_dpm_ti5j_perpustakaan;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    EditText un,pw;
    Button admin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        un = (EditText) findViewById(R.id.edun);
        pw = (EditText) findViewById(R.id.edpw);
        admin = (Button) findViewById(R.id.btnwa);
    }

    public void submit_login(View view){
        String sun = un.getText().toString();
        String spw = pw.getText().toString();

        if(sun.equals("1911500128") && spw.equals("muhammadsastra"))
        {
            Intent i = new Intent(this, MenuUtama.class);
            startActivity(i);
        }
        else if(sun.isEmpty() && spw.isEmpty())
        {
            Toast.makeText(getApplicationContext(), "NIM dan Password tidak boleh dikosongkan",
                    Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(getApplicationContext(), "NIM dan Password anda salah",
                    Toast.LENGTH_SHORT).show();
        }
    }
    public void admin (View view){
        String link = "https://api.whatsapp.com/send?phone=081271590315";
        Intent bukalink = new Intent(Intent.ACTION_VIEW);
        bukalink.setData(Uri.parse(link));
        startActivity(bukalink);
    }
}