package com.example.jan.myfirstapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

import layout.MainFragment;


public class MainActivity extends AppCompatActivity implements MainFragment.OnFragmentInteractionListener
{

    public static final String EXTRA_MESSAGE = "MyFirstApp_extra_message";

    Menu menu = null;

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.irgendeineid:

                if (menu != null)
                {
                    MenuItem item1 = menu.findItem(R.id.miProfile);
                    if (item1.isVisible())
                    {
                        item1.setVisible(false);
                    }
                    else
                    {
                        item1.setVisible(true);
                    }
                }
                return true;

            case R.id.miProfile:
                item.setTitle(R.string.accept);
                return true;

            default:
                // If we got here, the user's action was not recognized.
                // Invoke the superclass to handle it.
                return super.onOptionsItemSelected(item);

        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toolbar myBar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myBar);

        ActionBar currBar = getSupportActionBar();

        currBar.setDisplayHomeAsUpEnabled(false);
        //myBar.setTitle("ewig online");
        //myBar.setSubtitle("MUHAHAHA :P");

        expandWordfields(findViewById(R.id.expand_wordfields));

    }

    // Menu icons are inflated just as they were with actionbar
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        this.menu = menu;

        return true;
    }

    public void expandWordfields(View view)
    {
        int toggle = View.VISIBLE;
        if(findViewById(R.id.scroll_wordfields).getVisibility() == View.VISIBLE)
        {
            toggle = View.INVISIBLE;
        }
        findViewById(R.id.scroll_wordfields).setVisibility(toggle);
    }

    public void onFragmentInteraction(Uri uri)
    {
        //TODO
    }

}
