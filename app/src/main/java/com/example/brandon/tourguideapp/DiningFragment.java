package com.example.brandon.tourguideapp;

import android.location.Location;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class DiningFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        List<Location_item> list = new ArrayList<>();
        Dining.diningList(list, getContext());

        LocationAdapter adapter = new LocationAdapter(getActivity(), -1, list);
        View view = inflater.inflate(R.layout.location_list, container, false);
        ListView listView = (ListView) view.findViewById(R.id.listView);

        listView.setAdapter(adapter);

        return view;
    }
}


