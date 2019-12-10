package com.damian.ievents;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static com.damian.ievents.Main2Activity.eventDatabase;


/**
 * A simple {@link Fragment} subclass.
 */
public class addUser extends Fragment {
    private EditText name, date, time,description;
    private Button addevent;


    public addUser() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_add_user, container, false);
        name = view.findViewById(R.id.name);
        date = view.findViewById(R.id.date);
        time = view.findViewById(R.id.time);
        description = view.findViewById(R.id.description);
        addevent = view.findViewById(R.id.addevent);
        addevent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Name = name.getText().toString();
                String Date = date.getText().toString();
                String Time= time.getText().toString();
                String Description= description.getText().toString();

                Event event = new Event();
                event.setName(Name);
                event.setTime(Time);
                event.setDescription(Description);
                event.setDate(Date);
                Main2Activity.eventDatabase.myDao().addEvent(event);
                Toast.makeText(getActivity(), "Event added", Toast.LENGTH_SHORT).show();
                event.setName("");
                event.setTime("");
                event.setDate("");
                event.setDescription("");

            }
        });

        return view;
    }

}
