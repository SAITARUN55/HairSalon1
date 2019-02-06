package com.example.saitarun.hairsalon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class Main6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
    }

    public void btkap(View view) {
        Intent i=new Intent(getApplicationContext(),Main12Activity.class);
        startActivity(i);
    }

    @Override


    public boolean onOptionsItemSelected(MenuItem item) {


        switch (item.getItemId()) {

            case R.id.nav_share:

                Intent i = new Intent(

                        android.content.Intent.ACTION_SEND);

                i.setType("text/plain");

                i.putExtra(

                        android.content.Intent.EXTRA_TEXT, "My new app https://play.google.com/store/search?q=TECHHUBINDIAN");

                startActivity(Intent.createChooser(

                        i,

                        "Share Via"));

                Toast.makeText(getApplicationContext(), "You click on menu share", Toast.LENGTH_SHORT).show();


                break;

            case R.id.nav_fav_border:

                Toast.makeText(getApplicationContext(), "Added to favourites", Toast.LENGTH_SHORT).show();
                item.setIcon(R.drawable.ic_favorite_black_24dp);

                break;

            case R.id.nav_fav:

                Toast.makeText(getApplicationContext(), "Removed from favourites", Toast.LENGTH_SHORT).show();
                item.setIcon(R.drawable.ic_favorite_border_black_24dp);

                break;


        }


        return super.onOptionsItemSelected(item);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.icon, menu);
        return super.onCreateOptionsMenu(menu);
    }

}
