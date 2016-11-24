package com.example.dell.styleexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText etEmail;
    private EditText etPassword;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        init();

    }

    private void init() {

        btnLogin = (Button) findViewById(R.id.btnLogin);

        etEmail = (EditText) findViewById(R.id.etEmail);
        etPassword = (EditText) findViewById(R.id.etPassword);
        btnLogin.setOnClickListener(onClickListener);

    }

    private View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btnLogin:
                    btnLoginClick();
                    break;
            }

        }
    };

    private void btnLoginClick() {
        String txtLogin = etEmail.getText().toString().trim();
        String txtPassword = etPassword.getText().toString();

        if (txtLogin.isEmpty() || txtPassword.isEmpty()) {
            Toast.makeText(MainActivity.this, "Username Password Empty", Toast.LENGTH_SHORT).show();

        } else {
            Toast.makeText(MainActivity.this, txtLogin + " " + txtPassword, Toast.LENGTH_SHORT).show();
        }


    }

}
