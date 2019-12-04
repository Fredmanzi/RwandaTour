package com.example.rwandatour;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public  class LoginActivity extends AppCompatActivity {
    Toolbar toolbar;
    EditText email ;
    EditText password;
    Button loginbtn;
    TextView registerLink;
    DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        db=new DatabaseHelper(this);
        toolbar = (Toolbar) findViewById(R.id.registerPage);
        setSupportActionBar(toolbar);
        email = (EditText) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.password);
        loginbtn = (Button) findViewById(R.id.loginbtn);
        registerLink =(TextView) findViewById(R.id.registerlink);

        registerLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(registerIntent);
            }
        });
        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = email.getText().toString().trim();
                String pwd = password.getText().toString().trim();
                Boolean res = db.checkUser(user,pwd);
                if (res == true){
                    Intent homeIntent = new Intent(LoginActivity.this,MainActivity.class);
                    startActivity(homeIntent);
                }else{
                    Toast.makeText(LoginActivity.this,"login error",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
