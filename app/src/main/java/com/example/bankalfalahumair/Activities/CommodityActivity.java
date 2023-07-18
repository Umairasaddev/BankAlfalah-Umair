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

public class CommodityActivity extends AppCompatActivity {


    LinearLayout LLStartTradingCommodity,LLPracticeTradingCommodity,LLOpenAccountCommodity,
            LLValueAddedServicesCommodity, LLCommissionsAndTaxesCommodity,LLFaqsCommodity;



    ImageView homeCommodity,backBtnCommodity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_commodity);


        initializeViews();
        onClickListners();

    }



    private void initializeViews() {
        homeCommodity = findViewById(R.id.homeCommodity);

        LLStartTradingCommodity = findViewById(R.id.LLStartTradingCommodity);
        LLPracticeTradingCommodity = findViewById(R.id.LLPracticeTradingCommodity);
        LLOpenAccountCommodity = findViewById(R.id.LLOpenAccountCommodity);
        LLValueAddedServicesCommodity = findViewById(R.id.LLValueAddedServicesCommodity);
        LLCommissionsAndTaxesCommodity = findViewById(R.id.LLCommissionsAndTaxesCommodity);
        LLFaqsCommodity = findViewById(R.id.LLFaqsCommodity);
        backBtnCommodity = findViewById(R.id.backBtnCommodity);





        onClickListners();
    }



    private void onClickListners() {

        LLStartTradingCommodity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),LoginActivity.class);
                startActivity(intent);
            }
        });

        LLPracticeTradingCommodity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),PracticeAccountLoginActivity.class);
                startActivity(intent);
            }
        });

        LLOpenAccountCommodity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), OpenAccountBlankActivity.class);
                startActivity(intent);
            }
        });

        LLValueAddedServicesCommodity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ValueAddedServicesActivity.class);
                startActivity(intent);
            }
        });

        LLCommissionsAndTaxesCommodity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CommissionAndTaxBlankActivity.class);
                startActivity(intent);
            }
        });

        LLFaqsCommodity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), FaqsBlankActivity.class);
                startActivity(intent);
            }
        });

        homeCommodity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), AllSymbolsActivity.class);
                startActivity(intent);
            }
        });

        backBtnCommodity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), AllSymbolsActivity.class);
                startActivity(intent);
            }
        });
    }
}