package com.example.brandon.tourguideapp;

import android.content.Context;


import java.util.List;

public class Dining {
    public static void diningList(List<Location_item> list, Context context) {

        list.add( new Location_item(
                context.getString( R.string.dine_pike_name ),
                context.getString( R.string.dine_pike_description ),
                context.getString( R.string.dine_pike_address ),
                context.getString( R.string.dine_pike_phone ),
                context.getString( R.string.dine_pike_hours ),
                context.getString( R.string.dine_pike_price ),
                R.drawable.chowder
        ) );

        list.add( new Location_item(
                context.getString( R.string.dine_dicks_name ),
                context.getString( R.string.dine_dicks_description ),
                context.getString( R.string.dine_dicks_address ),
                context.getString( R.string.dine_dicks_phone ),
                context.getString( R.string.dine_dicks_hours ),
                context.getString( R.string.dine_dicks_price ),
                R.drawable.dicks
        ) );

        list.add( new Location_item(
                context.getString( R.string.dine_cup_name ),
                context.getString( R.string.dine_cup_description ),
                context.getString( R.string.dine_cup_address ),
                context.getString( R.string.dine_cup_phone ),
                context.getString( R.string.dine_cup_hours ),
                context.getString( R.string.dine_cup_price ),
                R.drawable.cupcake
        ) );

        list.add( new Location_item(
                context.getString( R.string.dine_moon_name ),
                context.getString( R.string.dine_moon_description ),
                context.getString( R.string.dine_moon_address ),
                context.getString( R.string.dine_moon_phone ),
                context.getString( R.string.dine_moon_hours ),
                context.getString( R.string.dine_moon_price ),
                R.drawable.molly
        ) );

    }
}
