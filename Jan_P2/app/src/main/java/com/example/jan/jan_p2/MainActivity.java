package com.example.jan.jan_p2;


import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v7.app.ActionBarDrawerToggle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener,
        LearnFragment.OnLearnInteractionListener,
        ContextFragment.OnContextInteractionListener {

    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mDrawerToggle;

    private Fragment main;
    private Fragment context;
    private Fragment about;
    private Fragment categories;
    private Fragment cue_cards;
    private Fragment definition;
    private Fragment infos;
    private Fragment learn;
    private Fragment numbers;
    private Fragment picture_puzzel;
    private Fragment progress;
    private Fragment sayings;
    private Fragment settings;
    private Fragment synonyms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        final ActionBar currBar = getSupportActionBar();
        currBar.setDisplayHomeAsUpEnabled(true);
        currBar.setHomeAsUpIndicator(R.drawable.ic_action_sort_by_size);
        currBar.setHomeAsUpIndicator(R.drawable.ic_action_sort_by_size);
        currBar.setHomeButtonEnabled(true);

        main = new MainActivityFragment();
        FragmentTransaction fmt = getSupportFragmentManager().beginTransaction();
        fmt.replace(R.id.fragment_holder, main).commit();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerToggle = new ActionBarDrawerToggle(
                this,                  /* host Activity */
                mDrawerLayout,         /* DrawerLayout object */
                toolbar, //Toolbar or Action bar of this Activity
                R.string.act_settings,  /* "open drawer" description */
                R.string.bottom_sheet_behavior  /* "close drawer" description */
        ) {

            /** Called when a drawer has settled in a completely closed state. */
            public void onDrawerClosed(View view) {
                super.onDrawerClosed(view);
                //currBar.setTitle("df");
            }

            /** Called when a drawer has settled in a completely open state. */
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
                //currBar.setTitle("sdf");
            }
        };




        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START))
        {
            drawer.closeDrawer(GravityCompat.START);
        }
        else
        {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        getSupportActionBar().setTitle("Hallo");

        int title;

        FragmentTransaction fmt = getSupportFragmentManager().beginTransaction();
        Fragment fragment;
        switch (item.getItemId())
        {
            case R.id.act_learn:
                if (learn == null)
                {
                    learn = new LearnFragment();
                }
                fragment = learn;
                title = R.string.act_learn;
                break;

            case R.id.act_context:
                if (context == null)
                {
                    context = new ContextFragment();
                }
                fragment = context;
                title = R.string.act_context;
                break;

            //TODO and so onion

            default:
                if (main == null)
                {
                    main = new MainActivityFragment();
                }
                fragment = main;
                title = 0;
                break;
        }

        // set the toolbar title
        if (getSupportActionBar() != null && title != 0)
        {
            getSupportActionBar().setSubtitle(getString(title));
        }

        fmt.replace(R.id.fragment_holder, fragment).commit();

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


    public void mainLearnButton(View view)
    {
        //TODO read the selected wordfields

        FragmentTransaction fmt = getSupportFragmentManager().beginTransaction();
        Fragment fragment = new LearnFragment();
        fmt.replace(R.id.fragment_holder, fragment).commit();
    }

    public void mainExpandWordfields(View view)
    {
        View scrollBar = findViewById(R.id.mainactivity_wordfields_list);
        AppCompatImageView expandIcon = (AppCompatImageView) findViewById(R.id.mainactivity_expand_icon);
        if (scrollBar.getVisibility() == View.GONE)
        {
            scrollBar.setVisibility(View.VISIBLE);
            expandIcon.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.ic_action_collapse));
        }
        else
        {
            scrollBar.setVisibility(View.GONE);
            expandIcon.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.ic_action_expand));
        }
    }


    @Override
    public void onContextInteraction(Uri uri) {

    }

    @Override
    public void onLearnInteractionListener(Uri uri) {

    }
}
