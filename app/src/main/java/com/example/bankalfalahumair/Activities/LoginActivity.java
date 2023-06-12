package com.example.bankalfalahumair.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.RelativeLayout;

import com.example.bankalfalahumair.R;

public class LoginActivity extends AppCompatActivity {



    RelativeLayout LoginBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);



        LoginBtn = findViewById(R.id.LoginBtn);

        onClickListners();
    }

    private void onClickListners() {
        LoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),SecondLevelActivity.class);
                startActivity(intent);

            }
        });

    }
}