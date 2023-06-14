package com.example.bankalfalahumair.Fragments.FAQs.CustodyMatters;

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


public class CustodyMattersFaqFragment extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_custody_matters_faq, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        NavController navController = Navigation.findNavController(view);

        RelativeLayout RLCustodyCharges,RLAccountMaintenanceFee;


        RLCustodyCharges = view.findViewById(R.id.RLCustodyCharges);
        RLAccountMaintenanceFee = view.findViewById(R.id.RLAccountMaintenanceFee);

        RLCustodyCharges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_custodyMattersFaqFragment_to_custodyFeeFragment2);
            }
        });

        RLAccountMaintenanceFee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_custodyMattersFaqFragment_to_maintenanceFeeFragment2);
            }
        });

    }
}