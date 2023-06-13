package com.example.bankalfalahumair.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.bankalfalahumair.BlankActivities.CommissionAndTaxBlankActivity;
import com.example.bankalfalahumair.BlankActivities.FaqsBlankActivity;
import com.example.bankalfalahumair.BlankActivities.OpenAccountBlankActivity;
import com.example.bankalfalahumair.BlankActivities.ValueAddedServicesActivity;
import com.example.bankalfalahumair.R;

public class StocksActivity extends AppCompatActivity {


    LinearLayout LLStartTrading,LLPracticeTrading,LLOpenAccountStocks,LLValueAddedServices,LLCommissionsAndTaxes
            ,LLFaqs;

    ImageView home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stocks);

        LLStartTrading = findViewById(R.id.LLStartTrading);
        LLPracticeTrading = findViewById(R.id.LLPracticeTrading);
        LLOpenAccountStocks = findViewById(R.id.LLOpenAccountStocks);
        LLValueAddedServices = findViewById(R.id.LLValueAddedServices);
        LLCommissionsAndTaxes = findViewById(R.id.LLCommissionsAndTaxes);
        LLFaqs = findViewById(R.id.LLFaqs);

        home = findViewById(R.id.home);



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

        LLCommissionsAndTaxes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CommissionAndTaxBlankActivity.class);
                startActivity(intent);
            }
        });

        LLFaqs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), FaqsBlankActivity.class);
                startActivity(intent);
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), AllSymbolsActivity.class);
                startActivity(intent);
            }
        });
    }
}