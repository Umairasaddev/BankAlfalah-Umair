package com.example.bankalfalahumair.Fragments.OpenAccountStocks;

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


public class ValueAddedServicesFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_value_added_services, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        NavController navController = Navigation.findNavController(view);

        RelativeLayout RLFastAndSecureTrading,RLAccessToAccount,RLInstantFundsTransfer
                ,RLAwardWinningResearchTeam,RlEfficientCallCenter,RLIVRServices;



        RLFastAndSecureTrading = view.findViewById(R.id.RLFastAndSecureTrading);
        RLAccessToAccount = view.findViewById(R.id.RLAccessToAccount);
        RLInstantFundsTransfer = view.findViewById(R.id.RLInstantFundsTransfer);
        RLAwardWinningResearchTeam = view.findViewById(R.id.RLAwardWinningResearchTeam);
        RlEfficientCallCenter = view.findViewById(R.id.RlEfficientCallCenter);
        RLIVRServices = view.findViewById(R.id.RLIVRServices);



        RLFastAndSecureTrading.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_valueAddedServicesFragment_to_fastAndSecureTradingFragment);
            }
        });
        RLAccessToAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_valueAddedServicesFragment_to_fullAccesstoAccountFragment);
            }
        });

        RLInstantFundsTransfer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_valueAddedServicesFragment_to_instantFundTransferFragment);
            }
        });

        RLAwardWinningResearchTeam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_valueAddedServicesFragment_to_awardWinningResearchTeamFragment);
            }
        });

        RlEfficientCallCenter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_valueAddedServicesFragment_to_efficientCallCenterFragment);
            }
        });

        RLIVRServices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_valueAddedServicesFragment_to_ivrServicesFragment);

            }
        });

    }
}