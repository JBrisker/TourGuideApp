package com.example.brandon.tourguideapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


public class LocationAdapter extends ArrayAdapter<Location_item> {

    public LocationAdapter(Context context, int resource, List<Location_item> locationList) {
        super(context, 0, locationList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final Location_item currentLocation = getItem(position);
        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        TextView locationName = (TextView) listItemView.findViewById(R.id.location_name);
        locationName.setText(currentLocation.getName());

        TextView locationDescription = (TextView)
                listItemView.findViewById(R.id.location_description);
        locationDescription.setText(currentLocation.getDescription());

        TextView locationAddress = (TextView) listItemView.findViewById(R.id.location_address);
       locationAddress.setText(currentLocation.getAddress());

        TextView locationHours = (TextView) listItemView.findViewById(R.id.location_hours);
     locationHours.setText(currentLocation.getHours());

        TextView locationPhoneNumber = (TextView) listItemView.findViewById(R.id.location_phone);
        locationPhoneNumber.setText(currentLocation.getPhone());


        TextView locationPriceRange = (TextView) listItemView.findViewById(R.id.location_price);
        locationPriceRange.setText(currentLocation.getPrice());


        ImageView photoLocationImageView = (ImageView) listItemView.findViewById(R.id.location_image);

// Check to see if each field is applicable to location as some as some my have prices but others do not
        if (currentLocation.hasImage()){
            photoLocationImageView.setImageResource(currentLocation.getImageResourceId());
            photoLocationImageView.setVisibility(View.VISIBLE);
        } else {
            photoLocationImageView.setVisibility(View.GONE);
        }

        if (currentLocation.hasPrice()){
            locationPriceRange.setVisibility(View.VISIBLE);
        } else {
            locationPriceRange.setVisibility(View.GONE);
        }

        if (currentLocation.hasHours()){
            locationHours.setVisibility(View.VISIBLE);
        } else {
            locationHours.setVisibility(View.GONE);
        }

        if (currentLocation.hasAddress()){
            locationHours.setVisibility(View.VISIBLE);
        } else {
            locationHours.setVisibility(View.GONE);
        }

        if (currentLocation.hasPhone()){
            locationPhoneNumber.setVisibility(View.VISIBLE);
        } else {
            locationPhoneNumber.setVisibility(View.GONE);
        }

        return listItemView;
    }


}