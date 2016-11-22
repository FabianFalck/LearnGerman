package com.example.fabianfalck.p5;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by FabianFalck on 22/11/2016.
 */

public class StudyActivity extends Activity {



    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.study_activity, container, false);
        return view;
    }

}
