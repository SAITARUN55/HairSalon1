package com.example.saitarun.hairsalon;


import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.widget.DatePicker;
import java.util.Calendar;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.DatePicker;
//import android.widget.TextView;
//import java.util.Calendar;

/**
 * A simple {@link Fragment} subclass.
 */
public class DatePickerFragment extends DialogFragment implements DatePickerDialog.OnDateSetListener {


//    public DatePickerFragment() {
//        // Required empty public constructor
//    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

//        TextView textView = new TextView(getActivity());
//        textView.setText(R.string.hello_blank_fragment);
//        return textView;

        /** Use the current date as the default date in the picker.*/

        final Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);

        /** Create a new instance of DatePickerDialog and return it.*/

        return new DatePickerDialog(getActivity(), this, year, month, day);
    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int day) {

        // Set the activity to the Main Activity.
        Main8Activity activity = (Main8Activity) getActivity();
        // Invoke Main Activity's processDatePickerResult() method.
//        activity.processDatePickerResult(year, month, day);

    }
}
