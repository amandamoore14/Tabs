package com.example.amandamoore14.tabs;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by amandamoore14 on 3/20/2018.
 */

public class BreakfastFragment extends Fragment {

   @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
       return inflater.inflate(R.layout.fragment_breakfast, container, false);
   }
}
