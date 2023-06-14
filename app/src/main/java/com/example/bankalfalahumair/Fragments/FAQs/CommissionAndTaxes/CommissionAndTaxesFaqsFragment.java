package com.example.bankalfalahumair.Fragments.FAQs.CommissionAndTaxes;

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


public class CommissionAndTaxesFaqsFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_commission_and_taxes_faqs, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        NavController navController = Navigation.findNavController(view);

        RelativeLayout RLTaxOnTrading,RLCapitalGainsTax,RLTaxonDividendAndBonusShare;

        RLTaxOnTrading = view.findViewById(R.id.RLTaxOnTrading);
        RLCapitalGainsTax = view.findViewById(R.id.RLCapitalGainsTax);
        RLTaxonDividendAndBonusShare = view.findViewById(R.id.RLTaxonDividendAndBonusShare);


        RLTaxOnTrading.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_commissionAndTaxesFaqsFragment_to_taxonTradingFragment);
            }
        });
        RLCapitalGainsTax.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_commissionAndTaxesFaqsFragment_to_capitalGainsFragment2);
            }
        });

        RLTaxonDividendAndBonusShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_commissionAndTaxesFaqsFragment_to_taxOnDividendFragment2);
            }
        });



    }
}