package com.g2.runningFront.ShopActivity;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.g2.runningFront.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class ShopMainFragment extends Fragment {


    public ShopMainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_shop_main, container, false);
    }

}