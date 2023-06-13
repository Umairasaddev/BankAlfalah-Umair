package com.example.bankalfalahumair.Fragments.FAQs.AccountMaintenance;

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


public class AccountMaintenanceFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_account_maintenance, container, false);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        NavController navController = Navigation.findNavController(view);

        RelativeLayout RLHowtoUpdateAccount,RLHowtoCloseAccount
                ,RLWhatisTraderFacility;

        RLHowtoUpdateAccount = view.findViewById(R.id.RLHowtoUpdateAccount);
        RLHowtoCloseAccount = view.findViewById(R.id.RLHowtoCloseAccount);
        RLWhatisTraderFacility = view.findViewById(R.id.RLWhatisTraderFacility);

        RLHowtoUpdateAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_accountMaintenanceFragment_to_howtoUpdateAccountFragment);
            }
        });

        RLHowtoCloseAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_accountMaintenanceFragment_to_howtoCloseAccountFragment);
            }
        });

        RLWhatisTraderFacility.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_accountMaintenanceFragment_to_whatisTraderFacilityFragment);
            }
        });
    }
}