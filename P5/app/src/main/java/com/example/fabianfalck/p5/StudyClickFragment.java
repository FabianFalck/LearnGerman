package com.example.fabianfalck.p5;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.app.Activity;
import android.widget.Button;

/**
 * Created by FabianFalck on 22/11/2016.
 */

public class StudyClickFragment extends Fragment {

    private static Button button_click;

    StudyClickFragment activityCommander;


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.study_click_fragment, container, false);

        button_click = (Button) view.findViewById(R.id.button_click);
        button_click.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View v){
                        buttonClicked();
                    }
                }
        );

        return view;
    }

public void buttonClicked(){

}


}