package com.example.android.paristour;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

class ListingAdapter extends ArrayAdapter <Listing> {
    public ListingAdapter(Context context, ArrayList <Listing> listings) {
        super ( context, 0, listings );
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from ( getContext () ).inflate ( R.layout.list_item, parent, false );
        }

        Listing currentListing = getItem ( position );

        //Set the TextView to the events name.
        TextView listingNameTextView = listItemView.findViewById ( R.id.events_name );
        listingNameTextView.setText ( currentListing.getListingName () );

        //Set the TextView to the festival name.
        TextView festTextView = listItemView.findViewById ( R.id.festival_name );
        listingNameTextView.setText ( currentListing.getListingName () );

        //Set the TextView to the restaurants name.
        TextView restNameTextView = listItemView.findViewById ( R.id.restaurants_name );
        listingNameTextView.setText ( currentListing.getListingName () );

        //Set the TextView to the attraction name.
        TextView attractionNameTextView = listItemView.findViewById ( R.id.attraction_name );
        listingNameTextView.setText ( currentListing.getListingName () );

        //Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById ( R.id.image );
        //If the song has an image
        if (currentListing.hasImage ())

        {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource ( currentListing.getImageResourceId () );
            // Make sure the view is visible
            imageView.setVisibility ( View.VISIBLE );
        } else

        {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility ( View.GONE );
        }
        return listItemView;
    }
}