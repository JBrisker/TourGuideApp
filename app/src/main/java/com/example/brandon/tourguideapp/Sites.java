package com.example.brandon.tourguideapp;

import android.content.Context;

import java.util.List;

public class Sites {
    public static void sitesList(List<Location_item> list, Context context) {

        list.add( new Location_item(
                context.getString( R.string.sight_space_name ),
                context.getString(R.string.sight_space_description),
                context.getString( R.string.sight_space_address ),
                context.getString( R.string.sight_space_phone ),
                context.getString( R.string.sight_space_hours ),
                context.getString(R.string.sight_space_price),
                R.drawable.space_needle
        ) );

        list.add( new Location_item(
                context.getString( R.string.sight_aqua_name ),
                context.getString(R.string.sight_aqua_description),
                context.getString( R.string.sight_aqua_address ),
                context.getString( R.string.sight_aqua_phone ),
                context.getString( R.string.sight_aqua_hours ),
                context.getString(R.string.sight_aqua_price),
                R.drawable.aqua
        ) );

        list.add( new Location_item(
                context.getString( R.string.sight_science_name ),
                context.getString(R.string.sight_science_description),
                context.getString( R.string.sight_science_address ),
                context.getString( R.string.sight_science_phone ),
                context.getString( R.string.sight_science_hours ),
                context.getString(R.string.sight_science_price),
                R.drawable.psc
        ) );

        list.add( new Location_item(
                context.getString( R.string.sight_miner_name ),
                context.getString(R.string.sight_miner_description),
                context.getString( R.string.sight_miner_address ),
                context.getString( R.string.sight_miner_phone ),
                context.getString( R.string.sight_miner_hours ),
                null,
                R.drawable.miners_landing
        ) );

    }
}
