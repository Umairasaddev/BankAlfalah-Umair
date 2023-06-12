package com.example.bankalfalahumair.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.example.bankalfalahumair.R;

public class SecondLevelActivity extends AppCompatActivity {



    RelativeLayout ButtonProceed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_level);


        ButtonProceed = findViewById(R.id.ButtonProceed);

        onClickListners();
    }

    private void onClickListners() {

        ButtonProceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),AllSymbolsActivity.class);
                startActivity(intent);

            }
        });
    }
}