package com.example.bankalfalahumair.Fragments.CommissionsAndTaxes;

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


public class CommissionAndTaxesFragment extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_commission_and_taxes, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        NavController navController = Navigation.findNavController(view);

        RelativeLayout BtnCustodyFee,BtnMaintenanceFee,BtnCapitalGainTax,BtnSstFed,BtnTaxOnDividend;

        BtnCustodyFee = view.findViewById(R.id.BtnCustodyFee);
        BtnMaintenanceFee = view.findViewById(R.id.BtnMaintenanceFee);
        BtnCapitalGainTax = view.findViewById(R.id.BtnCapitalGainTax);
        BtnSstFed = view.findViewById(R.id.BtnSstFed);
        BtnTaxOnDividend = view.findViewById(R.id.BtnTaxOnDividend);

        BtnCustodyFee.setOnClickListener(v -> navController.navigate(R.id.action_commissionAndTaxesFragment_to_custodyFeeFragment));

        BtnMaintenanceFee.setOnClickListener(v -> navController.navigate(R.id.action_commissionAndTaxesFragment_to_maintenanceFeeFragment));

        BtnCapitalGainTax.setOnClickListener(v -> navController.navigate(R.id.action_commissionAndTaxesFragment_to_capitalGainsFragment));

        BtnSstFed.setOnClickListener(v -> navController.navigate(R.id.action_commissionAndTaxesFragment_to_sstFedFragment));

        BtnTaxOnDividend.setOnClickListener(v -> navController.navigate(R.id.action_commissionAndTaxesFragment_to_taxOnDividendFragment));


    }
}