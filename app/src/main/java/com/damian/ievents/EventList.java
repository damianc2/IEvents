package com.damian.ievents;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class EventList extends Fragment {
    private TextView info;


    public EventList() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_event_list, container, false);
        info = view.findViewById(R.id.textinfo);
        List<Event> event = Main2Activity.eventDatabase.myDao().getEvents();
        String message = "";
        for (Event events: event) {
            String Name = events.getName();
            String Time = events.getTime();
            String Date = events.getDate();
            String Description = events.getDescription();
            message = message + "\n\nEvent Name : " + Name + "\nDate : " + Date + "\nTime : " + Time + "\nDescription : " + Description;
        }
        info.setText(message);
        return view;
    }

}
