package com.example.fabianfalck.p5;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class StartActivity extends Activity {

    /*
<<<<<<< HEAD
    //
    private Button studyButton;

    protected View onCreate(LayoutInflater inflater, ViewGroup container,
                            Bundle savedInstanceState) {

        setContentView(R.layout.start_activity);
        View view = inflater.inflate(R.layout.start_activity, container, false);
        super.onCreate(savedInstanceState);


        studyButton = (Button) view.findViewById(R.id.study_button);
        final Context context = studyButton.getContext();
        studyButton.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View v){
                        Intent intent = new Intent(context, StudyActivity.class);
                        startActivity(intent);
                    }
                }
        );

        return view;

    }
}
=======

*/
    private Button studyButton;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_activity);

        studyButton = (Button) findViewById(R.id.study_button);

        System.out.println("Hello");

        final Context context = studyButton.getContext();
        studyButton.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View v){
                        Intent intent = new Intent(context, StudyActivity.class);
                        startActivity(intent);
                        System.out.println("GEHT!");
                    }
                }
        );

    }
}

