package com.example.bankalfalahumair.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.example.bankalfalahumair.R;

public class SignupActivity extends AppCompatActivity {

    LinearLayout contactusLLSignup;
    RelativeLayout CreateAccount;

    EditText etFullName,etPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        initViews();
        onClickListner();
    }

    private void onClickListner() {

        contactusLLSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SignupActivity.this,LoginActivity.class));
            }
        });

        CreateAccount.setOnClickListener(v->{

            Intent intent = new Intent(SignupActivity.this, AccountCreated.class);

            String fullName = etFullName.getText().toString();
            intent.putExtra("Full Name",fullName);
            String userPassword= etPassword.getText().toString();
            intent.putExtra("password",userPassword);
            startActivity(intent);
        });
    }

    private void initViews() {

        contactusLLSignup = findViewById(R.id.contactusLLSignup);
        CreateAccount = findViewById(R.id.CreateAccount);
        etFullName = findViewById(R.id.etFullName);
        etPassword = findViewById(R.id.etPassword);
    }
}