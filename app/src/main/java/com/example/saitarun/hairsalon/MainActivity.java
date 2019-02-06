package com.example.saitarun.hairsalon;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ShareActionProvider;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.Toast;

import com.tmall.ultraviewpager.UltraViewPager;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ViewPager viewPager1;
    private ShareActionProvider mShareActionProvider;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UltraViewPager ultraViewPager = findViewById(R.id.ultra_viewpager);
        ultraViewPager.setScrollMode(UltraViewPager.ScrollMode.HORIZONTAL);
//initialize UltraPagerAdapter，and add child view to UltraViewPager
        Integer[] images = {R.drawable.nad1, R.drawable.nad2, R.drawable.nad3};
        PagerAdapter adapter = new UltraPagerAdapter(images);
        ultraViewPager.setAdapter(adapter);

//initialize built-in indicator
        ultraViewPager.initIndicator();
//set style of indicators
        ultraViewPager.getIndicator()
                .setOrientation(UltraViewPager.Orientation.HORIZONTAL)
                .setFocusColor(Color.RED)
                .setNormalColor(Color.WHITE)
                .setRadius((int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 5, getResources().getDisplayMetrics()));
//set the alignment
        ultraViewPager.getIndicator().setGravity(Gravity.CENTER_HORIZONTAL | Gravity.BOTTOM);
//construct built-in indicator, and add it to  UltraViewPager
        ultraViewPager.getIndicator().build();

//set an infinite loop
        ultraViewPager.setInfiniteLoop(true);
//enable auto-scroll mode
        ultraViewPager.setAutoScroll(2000);
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
                startActivity(Intent.createChooser(i, "Share Via"));
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


    public void btspa1(View view) {
        Intent i = new Intent(getApplicationContext(), Main8Activity.class);
        startActivity(i);
    }

   /* public void showMap1(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("geo:17.724657,83.314340"));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }*/


    private class UltraPagerAdapter extends PagerAdapter {
        private Integer[] imagesList;

        UltraPagerAdapter(Integer[] imagesList) {
            this.imagesList = imagesList;
        }

        @Override
        public int getCount() {
            return imagesList.length;
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == object;
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(container.getContext()).inflate(R.layout.custom_layout1, null);
            //new LinearLayout(container.getContext());
            ImageView imageView = linearLayout.findViewById(R.id.imageView7);

            int image = imagesList[position];
            imageView.setImageResource(image);

            container.addView(linearLayout);
//        linearLayout.getLayoutParams().width = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 180, container.getContext().getResources().getDisplayMetrics());
//        linearLayout.getLayoutParams().height = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 400, container.getContext().getResources().getDisplayMetrics());
            return linearLayout;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            LinearLayout view = (LinearLayout) object;
            container.removeView(view);
        }
    }


}
