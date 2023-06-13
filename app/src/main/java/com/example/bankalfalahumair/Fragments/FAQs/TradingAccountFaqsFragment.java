package com.example.bankalfalahumair.Fragments.FAQs;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.example.bankalfalahumair.R;


public class TradingAccountFaqsFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_trading_account_faqs, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        NavController navController = Navigation.findNavController(view);


        RelativeLayout RLAccountMaintenance,RLDepositWithdrawls,RLCommissionsAndTaxesFaqs
                ,RLCustodyMatters,RLTradingApplication;


        RLAccountMaintenance = view.findViewById(R.id.RLAccountMaintenance);
        RLDepositWithdrawls = view.findViewById(R.id.RLDepositWithdrawls);
        RLCommissionsAndTaxesFaqs = view.findViewById(R.id.RLCommissionsAndTaxesFaqs);
        RLCustodyMatters = view.findViewById(R.id.RLCustodyMatters);
        RLTradingApplication = view.findViewById(R.id.RLTradingApplication);

        RLAccountMaintenance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_tradingAccountFaqsFragment_to_accountMaintenanceFragment);
            }
        });
        RLDepositWithdrawls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_tradingAccountFaqsFragment_to_depositAndWithdrawlsFragment);
            }
        });

        RLCommissionsAndTaxesFaqs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_tradingAccountFaqsFragment_to_commissionAndTaxesFaqsFragment);
            }
        });

        RLCustodyMatters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_tradingAccountFaqsFragment_to_custodyMattersFaqFragment);
            }
        });

        RLTradingApplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_tradingAccountFaqsFragment_to_tradingApplicationFragment);
            }
        });




    }
}