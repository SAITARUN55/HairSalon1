package com.example.saitarun.hairsalon;


import android.app.Dialog;
import android.app.DialogFragment;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.format.DateFormat;
import android.widget.TimePicker;
import java.util.Calendar;

//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.TextView;
//import android.widget.TimePicker;
//import java.util.Calendar;

/**
 * A simple {@link Fragment} subclass.
 */

public class TimePickerFragment extends DialogFragment implements TimePickerDialog.OnTimeSetListener {


//    public TimePickerFragment() {
//        // Required empty public constructor
//    }


    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

//        TextView textView = new TextView(getActivity());
//        textView.setText(R.string.hello_blank_fragment);
//        return textView;

        /** Use the current time as the default values for the picker.*/

        final Calendar c = Calendar.getInstance();
        int hour = c.get(Calendar.HOUR_OF_DAY);
        int minute = c.get(Calendar.MINUTE);

        /** Create a new instance of TimePickerDialog and return it.*/

        return new TimePickerDialog(getActivity(), this, hour, minute,
                DateFormat.is24HourFormat(getActivity()));
    }

    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {

        // Set the activity to the Main Activity.
        Main8Activity activity = (Main8Activity) getActivity();
        // Invoke Main Activity's processTimePickerResult() method.
//        activity.processTimePickerResult(hourOfDay, minute);

    }
}
