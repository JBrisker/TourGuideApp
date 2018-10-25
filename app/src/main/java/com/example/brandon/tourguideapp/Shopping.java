package com.example.brandon.tourguideapp;

import android.content.Context;

import java.util.List;

public class Shopping {
    public static void ShopsList(List<Location_item> list, Context context) {

        list.add( new Location_item(
                context.getString( R.string.shop_market_name ),
                context.getString( R.string.shop_market_description ),
                context.getString( R.string.shop_market_address ),
                context.getString( R.string.shop_market_phone ),
                context.getString( R.string.shop_market_hours ),
                null,
                R.drawable.pikeplace
        ) );

        list.add( new Location_item(
                context.getString( R.string.shop_pacific_name ),
                context.getString( R.string.shop_pacific_description ),
                context.getString( R.string.shop_pacific_address ),
                context.getString( R.string.shop_pacific_phone ),
                context.getString( R.string.shop_pacific_hours ),
                null,
                R.drawable.pacpal
        ) );

        list.add( new Location_item(
                context.getString( R.string.shop_uwaji_name ),
                context.getString( R.string.shop_uwaji_description ),
                context.getString( R.string.shop_uwaji_address ),
                context.getString( R.string.shop_uwaji_phone ),
                context.getString( R.string.shop_uwaji_hours ),
                null,
                R.drawable.uwaji
        ) );
    }
}
