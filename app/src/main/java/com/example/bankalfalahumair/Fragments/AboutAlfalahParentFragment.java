package com.example.bankalfalahumair.Fragments;

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


public class AboutAlfalahParentFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_about_alfalah_parent, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        NavController navController = Navigation.findNavController(view);
        RelativeLayout RLAboutAlfalah = view.findViewById(R.id.RLAboutAlfalah);
        RelativeLayout RLServices = view.findViewById(R.id.RLServices);
        RelativeLayout RLOurSponsers = view.findViewById(R.id.RLOurSponsers);

        RLAboutAlfalah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                navController.navigate(R.id.action_aboutAlfalahParentFragment_to_aboutFragment);
            }
        });

        RLServices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_aboutAlfalahParentFragment_to_servicesFragment);
            }
        });

        RLOurSponsers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_aboutAlfalahParentFragment_to_ourSponsersFragment);
            }
        });

    }




}