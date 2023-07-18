package com.example.bankalfalahumair.Fragments.OpenAccountStocks;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.bankalfalahumair.Activities.StocksActivity;
import com.example.bankalfalahumair.R;


public class OpenAccountStocksFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_open_account_stocks, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        NavController navController = Navigation.findNavController(view);
        LinearLayout LLApplyNow = view.findViewById(R.id.LLApplyNow);

        ImageView IVback;

        IVback = view.findViewById(R.id.IVback);


        IVback.setOnClickListener(v -> {
            Intent intent = new Intent(getContext(), StocksActivity.class);
            startActivity(intent);
        });



        LLApplyNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_openAccountStocksFragment_to_applyNowOAFragment);
            }
        });


    }
}