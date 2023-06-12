package com.example.bankalfalahumair.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.bankalfalahumair.BlankActivities.AboutAlfalahActivity;
import com.example.bankalfalahumair.R;

public class AllSymbolsActivity extends AppCompatActivity {


    LinearLayout LLStockParent,LLComoditiesParent,LLBillsBondsParent,LLOpenAccountParent,LLResearchParent
            ,LLAboutUsParent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_symbols);

        LLStockParent = findViewById(R.id.LLStockParent);
        LLComoditiesParent = findViewById(R.id.LLComoditiesParent);
        LLBillsBondsParent = findViewById(R.id.LLBillsBondsParent);
        LLOpenAccountParent = findViewById(R.id.LLOpenAccountParent);
        LLResearchParent = findViewById(R.id.LLResearchParent);
        LLAboutUsParent = findViewById(R.id.LLAboutUsParent);

        onClickListners();

    }

    private void onClickListners() {

        LLStockParent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),StocksActivity.class);
                startActivity(intent);
            }
        });

        LLComoditiesParent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),CommodityActivity.class);
                startActivity(intent);
            }
        });

        LLBillsBondsParent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),IPSActivity.class);
                startActivity(intent);
            }
        });

        LLOpenAccountParent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),OpenAccountActivity.class);
                startActivity(intent);
            }
        });

        LLResearchParent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),StocksActivity.class);
                startActivity(intent);
            }
        });
        LLAboutUsParent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), AboutAlfalahActivity.class);
                startActivity(intent);
            }
        });

    }
}