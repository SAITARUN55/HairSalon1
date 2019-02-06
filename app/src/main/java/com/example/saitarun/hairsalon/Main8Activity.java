package com.example.saitarun.hairsalon;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.github.jhonnyx2012.horizontalpicker.DatePickerListener;
import com.github.jhonnyx2012.horizontalpicker.HorizontalPicker;
import com.jaredrummler.materialspinner.MaterialSpinner;

import org.joda.time.DateTime;

import java.util.ArrayList;

public class Main8Activity extends AppCompatActivity implements DatePickerListener{

    //String date,time,txt1,txt2;
    Context mContext = this;

    @Override
    protected void onCreate(@Nullable final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        // find the picker
        HorizontalPicker picker = findViewById(R.id.datePicker);

        picker.setListener(this)
                .setDays(30)
                .setOffset(7)
                .setDateSelectedColor(Color.DKGRAY)
                .setDateSelectedTextColor(Color.WHITE)
                .setMonthAndYearTextColor(Color.DKGRAY)
                .setTodayButtonTextColor(getResources().getColor(R.color.colorPrimary))
                .setTodayDateTextColor(getResources().getColor(R.color.colorPrimary))
                .setTodayDateBackgroundColor(Color.GRAY)
                .setUnselectedDayTextColor(Color.DKGRAY)
                .setDayOfWeekTextColor(Color.DKGRAY )
                .setUnselectedDayTextColor(getResources().getColor(R.color.primaryTextColor))
                .showTodayButton(false)
                .init();
        picker.setBackgroundColor(Color.LTGRAY);
        picker.setDate(new DateTime());

        Spinner spinner = findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.time_picker, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        MaterialSpinner sp2 = findViewById(R.id.spinner1);
        String[] services = getResources().getStringArray(R.array.service_picker);
        sp2.setItems(services);
        /*ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this,
                R.array.service_picker, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp2.setAdapter(adapter1);*/

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(mContext, "Position: "+i, Toast.LENGTH_SHORT ).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        sp2.setOnItemSelectedListener(new MaterialSpinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(MaterialSpinner view, int position, long id, Object item) {
                Toast.makeText(mContext, "Position: "+position, Toast.LENGTH_SHORT ).show();
            }
        });


    }

    @Override
    public void onDateSelected(@NonNull final DateTime dateSelected) {
        // log it for demo
        Log.i("HorizontalPicker", "Selected date is " + dateSelected.toString());
    }


    /*public void showDatePickerDialog(View v) {
        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getFragmentManager(),getString(R.string.date_picker));
    }

    public void showTimePickerDialog(View view) {
        DialogFragment newFragment = new TimePickerFragment();
        newFragment.show(getFragmentManager(),getString(R.string.time_picker));
    }

    public void processDatePickerResult(int year, int month, int day) {

        String month_string = Integer.toString(month+1);
        String day_string = Integer.toString(day);
        String year_string = Integer.toString(year);
        String dateMessage = (day_string + "/" +month_string + "/" + year_string);
        date = dateMessage;

    }

    public void processTimePickerResult(int hourOfDay, int minute) {

        String hour_string = Integer.toString(hourOfDay);
        String minute_string = Integer.toString(minute);
        String timeMessage = (hour_string + ":" + minute_string);
        time = timeMessage;
    }

    public void orderSummary(View view){

        CheckBox hairCut = (CheckBox) findViewById(R.id.hair_cut);
        boolean val1 = hairCut.isChecked();
        if(val1==true){
             txt1 = "Hair Cut";
        }

        CheckBox trimm = (CheckBox) findViewById(R.id.trimming);
        boolean val2  = trimm.isChecked();
        if(val2==true){
             txt2 = "Trimming";
        }

        TextView txt = (TextView) findViewById(R.id.order_summary_text);
        txt.setText("Choosen date: " + date + "\nChoosen Time: " + time + "\nServices requested: \n  " + txt1 + "\n  " + txt2);
        Toast.makeText(this,"click proceed if ok",Toast.LENGTH_SHORT).show();

//        Button date =(Button) findViewById(R.id.date_button);
//        date.setText((CharSequence) date);

    }*/

    public void registrationPage(View view) {
        Intent i=new Intent(getApplicationContext(),Registration1Activity.class);
        startActivity(i);
    }


    /*@Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        Spinner spinner = findViewById(R.id.spinner);
        spinner.setOnItemSelectedListener(this);

        MaterialSpinner sp2 = findViewById(R.id.spinner1);
        sp2.setOnItemSelectedListener(this);
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }*/
}
