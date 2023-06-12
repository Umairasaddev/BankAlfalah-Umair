package com.example.bankalfalahumair.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.bankalfalahumair.BlankActivities.OpenAccountBlankActivity;
import com.example.bankalfalahumair.BlankActivities.ValueAddedServicesActivity;
import com.example.bankalfalahumair.R;

public class StocksActivity extends AppCompatActivity {


    LinearLayout LLStartTrading,LLPracticeTrading,LLOpenAccountStocks,LLValueAddedServices;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stocks);

        LLStartTrading = findViewById(R.id.LLStartTrading);
        LLPracticeTrading = findViewById(R.id.LLPracticeTrading);
        LLOpenAccountStocks = findViewById(R.id.LLOpenAccountStocks);
        LLValueAddedServices = findViewById(R.id.LLValueAddedServices);

        onClickListners();
    }

    private void onClickListners() {

        LLStartTrading.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),LoginActivity.class);
                startActivity(intent);
            }
        });

        LLPracticeTrading.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),PracticeAccountLoginActivity.class);
                startActivity(intent);
            }
        });

        LLOpenAccountStocks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), OpenAccountBlankActivity.class);
                startActivity(intent);
            }
        });

        LLValueAddedServices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ValueAddedServicesActivity.class);
                startActivity(intent);
            }
        });
    }
}