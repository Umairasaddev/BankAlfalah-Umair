package com.example.bankalfalahumair.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.bankalfalahumair.BlankActivities.CommissionAndTaxBlankActivity;
import com.example.bankalfalahumair.BlankActivities.FaqsBlankActivity;
import com.example.bankalfalahumair.BlankActivities.ValueAddedServicesActivity;
import com.example.bankalfalahumair.R;

public class IPSActivity extends AppCompatActivity {



    LinearLayout LLIpsParent,LLIpsOpenAccountParent,LLValueAddedServicesIps,LLRatesIps,LLFaqsIps,LLInvestorEducationIps;
    ImageView backBtnIps,homeIps;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ipsactivity);


        initializeViews();
        onClickListners();
    }



    private void initializeViews() {
        LLIpsParent = findViewById(R.id.LLIpsParent);
        LLIpsOpenAccountParent = findViewById(R.id.LLIpsOpenAccountParent);
        LLValueAddedServicesIps = findViewById(R.id.LLValueAddedServicesIps);
        LLRatesIps = findViewById(R.id.LLRatesIps);
        LLFaqsIps = findViewById(R.id.LLFaqsIps);
        LLInvestorEducationIps = findViewById(R.id.LLInvestorEducationIps);
        backBtnIps = findViewById(R.id.backBtnIps);
        homeIps = findViewById(R.id.homeIps);
    }

    private void onClickListners() {

        LLIpsParent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),LoginActivity.class);
                startActivity(intent);
            }
        });

        homeIps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), AllSymbolsActivity.class);
                startActivity(intent);
            }
        });

        backBtnIps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), AllSymbolsActivity.class);
                startActivity(intent);
            }
        });

        LLValueAddedServicesIps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ValueAddedServicesActivity.class);
                startActivity(intent);
            }
        });

        LLRatesIps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CommissionAndTaxBlankActivity.class);
                startActivity(intent);
            }
        });

        LLFaqsIps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), FaqsBlankActivity.class);
                startActivity(intent);
            }
        });
    }
}