package com.example.bankalfalahumair.Fragments.FAQs.DepositWithdrawls;

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


public class DepositAndWithdrawlsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_deposit_and_withdrawls, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        NavController navController = Navigation.findNavController(view);

        RelativeLayout RLHowtoWithdrawFund,RLHowtoDepositFund,RLOnlineFundTransferFacility;

        RLHowtoWithdrawFund = view.findViewById(R.id.RLHowtoWithdrawFund);
        RLHowtoDepositFund = view.findViewById(R.id.RLHowtoDepositFund);
        RLOnlineFundTransferFacility = view.findViewById(R.id.RLOnlineFundTransferFacility);

        RLHowtoWithdrawFund.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_depositAndWithdrawlsFragment_to_fundWithdrawlFragment);
            }
        });

        RLHowtoDepositFund.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_depositAndWithdrawlsFragment_to_howtoDepositFundFragment);
            }
        });

        RLOnlineFundTransferFacility.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_depositAndWithdrawlsFragment_to_onlineFundTransferFragment);
            }
        });


    }
}