package com.example.fabianfalck.p3;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.zip.Inflater;

/**
 * Created by FabianFalck on 22/11/2016.
 */

public class click_study_fragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = Inflater.inflate(R.id.layout.given_study_fragment, container, false);
        return view;
    }


}
