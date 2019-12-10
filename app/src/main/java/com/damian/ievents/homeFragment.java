package com.damian.ievents;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class homeFragment extends Fragment implements View.OnClickListener {
    private Button addButton;
    private Button viewButton;


    public homeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        viewButton = view.findViewById(R.id.view);
        viewButton.setOnClickListener(this);
        addButton = view.findViewById(R.id.create);
        addButton.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.create:
                Main2Activity.fragmentManager.beginTransaction().replace(R.id.fragmentContainer,
                        new addUser()).addToBackStack(null).commit();
                break;

            case R.id.view:
                Main2Activity.fragmentManager.beginTransaction().replace(R.id.fragmentContainer,
                        new EventList()).addToBackStack(null).commit();
                break;
        }

    }
}
