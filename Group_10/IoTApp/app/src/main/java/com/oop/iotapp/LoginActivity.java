package com.oop.iotapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText et_email;
    private EditText et_password;
    private Button bt_loginButton;
    private TextView tv_registerForward;
    private DBHandler dbHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        dbHandler = new DBHandler(LoginActivity.this);
        initViews();

        bt_loginButton.setOnClickListener(e -> {
            registerIntent();
        });

        tv_registerForward.setOnClickListener(e -> {
            Intent register = new Intent(LoginActivity.this, RegisterActivity.class);
            startActivity(register);
        });
    }

    private void registerIntent() {

        String email = et_email.getText().toString();
        String password = et_password.getText().toString();

        if (dbHandler.checkMatch(email, password)){
            Intent main = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(main);
        }
        else {
            Toast.makeText(this, "Email không tồn tại hoặc sai mật khẩu!", Toast.LENGTH_SHORT).show();
        }

        et_email.setText("");
        et_password.setText("");
    }

    private void initViews() {
        et_email = findViewById(R.id.edittext_email_login);
        et_password = findViewById(R.id.edittext_password_login);
        bt_loginButton = findViewById(R.id.button_login);
        tv_registerForward = findViewById(R.id.textview_register_foward);
    }
}