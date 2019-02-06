package com.example.saitarun.hairsalon;

import android.content.Intent;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;
import android.widget.Toolbar;

public class Main2Activity extends AppCompatActivity {
    // Button btnShare;
    //Intent shareIntent;
    //String shareBody = "This is a great App, you should try it out!";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        // btnShare = (Button) findViewById(R.id.nav_invite);
        //btnShare.setOnClickListener(new View.OnClickListener() {
        //  @Override
        //public void onClick(View view) {
        //  shareIntent = new Intent(Intent.ACTION_SEND);
        //shareIntent.setType("text/plain");
        //shareIntent.putExtra(Intent.EXTRA_SUBJECT,"My App");
        //shareIntent.putExtra(Intent.EXTRA_TEXT,shareBody);
        //startActivity(Intent.createChooser(shareIntent,"Share via"));
        //}
        //});

    }

    public void btnad1(View view) {
        Intent i = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(i);
    }

    public void btnad2(View view) {
        Intent i = new Intent(getApplicationContext(), Main3Activity.class);
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


    public boolean onOptionsItemSelected(MenuItem item) {



        return super.onOptionsItemSelected(item);


    }

    public boolean onCreateOptionsMenu(Menu menu) {


        // int id = item.getItemId();


        //if (id == R.id.nav_fav) {
        //  Intent intent = new Intent(getApplicationContext(),favourites.class);
        //startActivity(intent);

        //} else if (id == R.id.nav_order) {
        //  Intent intent= new Intent(getApplicationContext(),Orders.class);
        //startActivity(intent);
        //} else if (id == R.id.nav_blog) {
        //  Intent intent= new Intent(getApplicationContext(),Blogs.class);
        //startActivity(intent);
        //} else if (id ==R.id.nav_feedback)   {
        //  Intent intent= new Intent(getApplicationContext(),Feedback.class);
        //startActivity(intent);
        //}
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }


}
