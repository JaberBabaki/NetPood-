package com.netpood.admin.netpoodapp;

/**
 * Created by jaberALU on 25/05/2017.
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class TwoFragment extends Fragment{

  public TwoFragment() {
    // Required empty public constructor
  }

  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    // StartPointSeekBar a=(StartPointSeekBar) getView().findViewById(R.id.view22);


  }

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
                           Bundle savedInstanceState) {
    // Inflate the layout for this fragment
    return inflater.inflate(R.layout.f_two, container, false);
  }

}