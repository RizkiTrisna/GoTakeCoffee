package com.example.gotakecoffee_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText edUsername, edPassword;
    Button btnLogin;
    private String username, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edUsername = findViewById(R.id.ed_username);
        edPassword = findViewById(R.id.ed_password);

        btnLogin = findViewById(R.id.btn_login);

        btnLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_login:
                username = edUsername.getText().toString().trim();
                password = edPassword.getText().toString().trim();

                if (username.matches("admin") && password.matches("admin")){
                    Intent mIntent = new Intent(MainActivity.this, Beranda.class);
                    startActivity(mIntent);
                } else {
                    Toast.makeText(getApplicationContext(), "Username atau Password Salah", Toast.LENGTH_SHORT).show();
                }
        }
    }
}
