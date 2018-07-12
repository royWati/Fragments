package com.atfortecdynamics.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by folio on 7/10/2018.
 */

public class fragment_three extends Fragment{
    public static fragment_three newInstance(){
        fragment_three fragmentThree=new fragment_three();
        return fragmentThree;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstance){
        return inflater.inflate(R.layout.fragment3,container,false);
    }


    public void onViewCreated(Bundle bundle,View view){

    }
}
