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
public class RegisterActivity extends AppCompatActivity {
    Toolbar toolbar;
    EditText email;
    EditText password;
    EditText confirm;
    Button registerbtn;
    TextView loginlink;
    DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        db = new DatabaseHelper(this);
        toolbar = (Toolbar) findViewById(R.id.registerPage);
        setSupportActionBar(toolbar);
        email =(EditText) findViewById(R.id.email);
        password=(EditText) findViewById(R.id.password);
        confirm =(EditText) findViewById(R.id.confirm);
        registerbtn = (Button) findViewById(R.id.registerbtn);
        loginlink = (TextView) findViewById(R.id.loginlink);
        loginlink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent LoginIntent = new Intent(RegisterActivity.this,LoginActivity.class);
                startActivity(LoginIntent);

            }
        });
        registerbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = email.getText().toString().trim();
                String pwd = password.getText().toString().trim();
                String cnf_pwd =confirm.getText().toString().trim();
                if(pwd.equals(cnf_pwd)){
                   long var = db.addUser(user,pwd);
                   if(var >0){
                       Toast.makeText(RegisterActivity.this,"you have registered",Toast.LENGTH_SHORT).show();
                       Intent moveToLogin = new Intent(RegisterActivity.this,LoginActivity.class);
                       startActivity(moveToLogin);
                   }else {
                       Toast.makeText(RegisterActivity.this,"registration error",Toast.LENGTH_SHORT).show();
                   }
                }
            }
        });
    }
}