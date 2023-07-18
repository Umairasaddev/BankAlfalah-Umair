package com.example.bankalfalahumair;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import com.example.bankalfalahumair.Fragments.eFalahTradeFragment;
import com.google.android.material.navigation.NavigationView;

public class myMainActivity extends AppCompatActivity {


    NavigationView navigationView;
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle toggle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_main);

        initViews();

        getSupportFragmentManager().beginTransaction().replace(R.id.container, new eFalahTradeFragment()).commit();

        navigationView.setCheckedItem(R.id.homeMenu);

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {

            Fragment temp;

            public boolean onNavigationItemSelected(@NonNull MenuItem item) {


                int itemId = item.getItemId();

                if (itemId  ==  R.id.homeMenu){
                    temp = new eFalahTradeFragment();
                }


                getSupportFragmentManager().beginTransaction().replace(R.id.container, temp, "Fragment1").commit();

                drawerLayout.closeDrawer(GravityCompat.START);
                return true;
            }
        });

    }

    private void initViews() {

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        navigationView = findViewById(R.id.navigation_view);
        drawerLayout = findViewById(R.id.drawerlayout);


        toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open, R.string.close);

        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();


    }


}