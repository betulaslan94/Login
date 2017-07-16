package com.apps.betul.login;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Betül on 10.06.2017.
 */

public class Activity2 extends Activity {
    Button btnBack;
    TextView txtNamePassword;
    String namePassword;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity);
        Bundle kutu = getIntent().getExtras();
        int gelenSayi = kutu.getInt("sayi");
        String gelenText = kutu.getString("kullaniciBilgileri");
        txtNamePassword = (TextView) findViewById(R.id.txtResult);
        btnBack = (Button) findViewById(R.id.btnResult);
        txtNamePassword.setText(gelenText);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity2.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
