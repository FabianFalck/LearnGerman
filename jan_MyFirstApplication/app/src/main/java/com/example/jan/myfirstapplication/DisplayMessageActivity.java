package com.example.jan.myfirstapplication;
import android.app.Activity;
import android.content.Intent;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

import layout.HeadlineFragment;
import layout.MyFirstFragment;


public class DisplayMessageActivity extends AppCompatActivity implements MyFirstFragment.OnFragmentInteractionListener
{
    // Create a new Fragment to be placed in the activity layout
    final MyFirstFragment firstFragment = new MyFirstFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textView = (TextView) findViewById(R.id.textView);

        if (!message.isEmpty())
        {
            textView.setText(message);
        }
        else
        {
            textView.setText(R.string.default_shit);
        }



        // In case this activity was started with special instructions from an
        // Intent, pass the Intent's extras to the fragment as arguments
        firstFragment.setArguments(getIntent().getExtras());

        ToggleButton toggle = (ToggleButton) findViewById(R.id.toggleButton);
        toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if (isChecked)
                {
                    // Check that the activity is using the layout version with
                    // the fragment_container FrameLayout
                    if (findViewById(R.id.frame_container_two) != null)
                    {
                        // Add the fragment to the 'fragment_container' FrameLayout
                        getSupportFragmentManager().beginTransaction()
                                .add(R.id.frame_container_two, firstFragment).commit();
                    }

                }
                else
                {
                    if (findViewById(R.id.frame_container_two) != null)
                    {
                        // remove the fragment
                        getSupportFragmentManager().beginTransaction()
                                .remove(firstFragment).commit();
                    }
                }
            }
        });

        Toolbar myBar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myBar);

        ActionBar currBar = getSupportActionBar();

        currBar.setDisplayHomeAsUpEnabled(true);
        myBar.setTitle("ewig online");
        myBar.setSubtitle("MUHAHAHA :P");
    }

    public void somethingHappened(String text)
    {
        TextView textView = (TextView) findViewById(R.id.fragmented_text);
        textView.setText(text);
    }

    public void buttonEnter(View view)
    {
        EditText eText = (EditText) findViewById(R.id.editFragmentText);
        String text = eText.getText().toString();
     //   if (text != null)
     //   {
     //       firstFragment.onFancyShit(text.getText().toString());
     //   }
        TextView textView = (TextView) findViewById(R.id.fragmented_text);
        textView.setText(text);
    }
}
