package com.example.bankalfalahumair.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.bankalfalahumair.R;

public class AccountCreated extends AppCompatActivity {

    RelativeLayout okBtn;
    TextView GetUserNameTV,GetPasswordTV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_created);

        initViews();
        ClickListners();
    }

    private void ClickListners() {

        Intent intent = getIntent();
        if (intent != null)
        {
            String name = intent.getStringExtra("Full Name");
            String password = intent.getStringExtra("password");
            if (name!=null || password !=null)
            {
                GetUserNameTV.setText(name);
                GetPasswordTV.setText(password);
            }
        }

        okBtn.setOnClickListener(v->{
            startActivity(new Intent(AccountCreated.this,LoginActivity.class));
        });

    }

    private void initViews() {

        GetUserNameTV = findViewById(R.id.GetUserNameTV);
        GetPasswordTV = findViewById(R.id.GetPasswordTV);
        okBtn = findViewById(R.id.okBtn);

    }
}