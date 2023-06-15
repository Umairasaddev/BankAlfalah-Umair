package com.example.bankalfalahumair.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.bankalfalahumair.R;

public class CommodityActivity extends AppCompatActivity {


    ImageView HomeCommodity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_commodity);


        initializeViews();
        onClickListners();

    }



    private void initializeViews() {
        HomeCommodity = findViewById(R.id.HomeCommodity);
    }

    private void onClickListners() {

        HomeCommodity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}