package com.example.bankalfalahumair.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.example.bankalfalahumair.R;

public class PracticeAccountLoginActivity extends AppCompatActivity {


    RelativeLayout LoginBtnPracticeTrading;

    LinearLayout contactusLLPT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice_account_login);

        initViews();
        onClickListners();
    }

    private void onClickListners() {

        LoginBtnPracticeTrading.setOnClickListener(v ->
                startActivity(new Intent(PracticeAccountLoginActivity.this,SecondLevelActivity.class)));

        contactusLLPT.setOnClickListener(v ->
                startActivity(new Intent(PracticeAccountLoginActivity.this, SignupActivity.class)));
    }

    private void initViews() {
        LoginBtnPracticeTrading = findViewById(R.id.LoginBtnPracticeTrading);
        contactusLLPT = findViewById(R.id.contactusLLPT);
    }
}