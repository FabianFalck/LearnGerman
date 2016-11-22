package com.example.fabianfalck.p3;

/**
 * Created by FabianFalck on 21/11/2016.
 */

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.zip.Inflater;

public class given_study_fragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = Inflater.inflate(R.layout.given_study_fragment, container, false);
        return view;
    }
}
