package com.apps.betul.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edtUsername;
    EditText edtPassword;
    Button btnLogin;
    String username;
    String password;
    TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtUsername = (EditText) findViewById(R.id.txtUserName);
        edtPassword = (EditText) findViewById(R.id.txtPassword);
        btnLogin = (Button) findViewById(R.id.btnLogin);
        txtResult = (TextView) findViewById(R.id.txtResult);


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                username = edtUsername.getText().toString();
                password = edtPassword.getText().toString();

                // Toast.makeText(MainActivity.this, username +" "+ password, Toast.LENGTH_SHORT).show();
                txtResult.setText(username + " " + password);
                Bundle bundle = new Bundle();
                bundle.putString("kullaniciBilgileri", username);
                bundle.putInt("sayi", 8);
                Intent intent = new Intent(MainActivity.this, Activity2.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}
