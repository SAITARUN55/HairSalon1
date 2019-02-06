package com.example.saitarun.hairsalon;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class NavigatorActivity extends AppCompatActivity implements View.OnClickListener, NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigator);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer);
        mToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.string.open, R.string.close);
        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //navigation view
        NavigationView navigationView = findViewById(R.id.navigation_viewDrawer);
        navigationView.setNavigationItemSelectedListener(this);
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.main, menu);
//        return true;
//    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        /*switch (item.getItemId()) {

            case R.id.nav_fav:

                Intent i = new Intent(NavigatorActivity.this, favourites.class);
                startActivity(i);
                return true;


        }*/
       /* switch (item.getItemId()) {

            case R.id.nav_order:

                Intent i = new Intent(NavigatorActivity.this, Orders.class);
                startActivity(i);
                return true;

        }

        switch (item.getItemId()) {

            case R.id.nav_blog:

                Intent i = new Intent(NavigatorActivity.this, Blogs.class);
                startActivity(i);
                return true;

        }

        switch (item.getItemId()) {

            case R.id.nav_feedback:

                Intent i = new Intent(NavigatorActivity.this, Feedback.class);
                startActivity(i);
                return true;

        }*/
        if (mToggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void btnad2(View view) {
        Intent i = new Intent(getApplicationContext(), Main3Activity.class);
        startActivity(i);
    }

    public void btnad1(View view) {
        Intent i = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(i);
    }

    public void btnad3(View view) {
        Intent i = new Intent(getApplicationContext(), Main4Activity.class);
        startActivity(i);
    }

    public void btnad4(View view) {
        Intent i = new Intent(getApplicationContext(), Main5Activity.class);
        startActivity(i);
    }

    public void btnad5(View view) {
        Intent i = new Intent(getApplicationContext(), Main6Activity.class);
        startActivity(i);
    }

    public void btnad6(View view) {
        Intent i = new Intent(getApplicationContext(), Main7Activity.class);
        startActivity(i);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();


    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.nav_feedback:
                Intent i = new Intent(NavigatorActivity.this, Feedback.class);
                startActivity(i);
                break;
        }
        switch (item.getItemId()) {

            case R.id.nav_fav:

                Intent i = new Intent(NavigatorActivity.this, favourites.class);
                startActivity(i);
                return true;


        }
        switch (item.getItemId()) {

            case R.id.nav_order:

                Intent i = new Intent(NavigatorActivity.this, Orders.class);
                startActivity(i);
                return true;

        }

        switch (item.getItemId()) {

            case R.id.nav_blog:

                Intent i = new Intent(NavigatorActivity.this, Blogs.class);
                startActivity(i);
                return true;

        }


        return false;
    }
}
