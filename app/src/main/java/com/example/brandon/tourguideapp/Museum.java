package com.example.brandon.tourguideapp;

import android.content.Context;

import java.util.List;

public class Museum {
    public static void museumList(List<Location_item> list, Context context) {

    list.add( new Location_item(
            context.getString( R.string.museum_mopop_name ),
            context.getString(R.string.museum_mopop_description ),
            context.getString( R.string.museum_mopop_address ),
            context.getString( R.string.museum_mopop_phone ),
            context.getString( R.string.museum_mopop_hours ),
            context.getString( R.string.museum_mopop_price),
            R.drawable.emp
    ) );

    list.add( new Location_item(
            context.getString( R.string.museum_chi_name ),
            context.getString(R.string.museum_chi_description ),
            context.getString( R.string.museum_chi_address ),
            context.getString( R.string.museum_chi_phone ),
            context.getString( R.string.museum_chi_hours ),
            context.getString( R.string.museum_chi_price),
            R.drawable.chihuly
    ) );

    list.add( new Location_item(
            context.getString( R.string.museum_art_name ),
            context.getString(R.string.museum_art_description ),
            context.getString( R.string.museum_art_address ),
            context.getString( R.string.museum_art_phone ),
            context.getString( R.string.museum_art_hours ),
            context.getString( R.string.museum_art_price),
            R.drawable.sam
    ) );

    list.add( new Location_item(
            context.getString( R.string.museum_fly_name ),
            context.getString(R.string.museum_fly_description ),
            context.getString( R.string.museum_fly_address ),
            context.getString( R.string.museum_fly_phone ),
            context.getString( R.string.museum_fly_hours ),
            context.getString( R.string.museum_fly_price),
            R.drawable.flight
    ) );

}
}
