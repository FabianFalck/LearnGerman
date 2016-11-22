package com.example.fabianfalck.p5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class StartActivity extends AppCompatActivity {

<<<<<<< HEAD
    //
    private Button studyButton;

    protected View onCreate(LayoutInflater inflater, ViewGroup container,
                            Bundle savedInstanceState) {

        setContentView(R.layout.start_activity);
        View view = inflater.inflate(R.layout.start_activity, container, false);
        super.onCreate(savedInstanceState);

        /*
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
        */
        return view;

    }
}
=======
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_activity);
    }
}
>>>>>>> parent of ef354c8... Transitions
