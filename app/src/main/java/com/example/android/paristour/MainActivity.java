package com.example.android.paristour;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );
        Toolbar toolbar = (Toolbar) findViewById ( R.id.toolbar );
        setSupportActionBar ( toolbar );


        DrawerLayout drawer = (DrawerLayout) findViewById ( R.id.drawer_layout );
        NavigationView navigationView = (NavigationView) findViewById ( R.id.nav_view );
        navigationView.setNavigationItemSelectedListener ( this );
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle ( this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close );
        drawer.addDrawerListener ( toggle );
        toggle.syncState ();
        if (savedInstanceState == null) {
            getSupportFragmentManager ().beginTransaction ().replace ( R.id.fragment_container, new eventsFragment () ).commit ();
            navigationView.setCheckedItem ( R.id.events_name );
        }
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById ( R.id.drawer_layout );
        if (drawer.isDrawerOpen ( GravityCompat.START )) {
            drawer.closeDrawer ( GravityCompat.START );
        } else {
            super.onBackPressed ();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater ().inflate ( R.menu.main, menu );
        return true;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId ()) {
            case R.id.events:
                getSupportFragmentManager ().beginTransaction ().replace ( R.id.fragment_container, new eventsFragment () ).commit ();
                break;
            case R.id.festivals:
                getSupportFragmentManager ().beginTransaction ().replace ( R.id.fragment_container, new festFragment () ).commit ();
                break;
            case R.id.local_attractions:
                getSupportFragmentManager ().beginTransaction ().replace ( R.id.fragment_container, new locAttracFragment () ).commit ();
                break;
            case R.id.restaurants:
                getSupportFragmentManager ().beginTransaction ().replace ( R.id.fragment_container, new restFragment () ).commit ();
                break;
            case R.id.nav_share:
                Toast.makeText ( this, "nav_share is clicked", Toast.LENGTH_SHORT ).show ();
            case R.id.nav_send:
                Toast.makeText ( this, "nav_send is clicked", Toast.LENGTH_SHORT ).show ();
        }
        return true;

    }


}
