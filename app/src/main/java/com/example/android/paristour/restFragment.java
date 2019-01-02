package com.example.android.paristour;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class restFragment extends Fragment {


    public restFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate ( R.layout.content_main, container, false );

        //Create an ArrayList for events.
        final ArrayList <Listing> listings = new ArrayList <Listing> ();
        listings.add ( new Listing ( "Restaurant du \nPalais Royal", R.drawable.paris_joedesousa ) );
        listings.add ( new Listing ( "Le Train Bleu", R.drawable.paris_joedesousa ) );

        //Create a ListingAdapter
        final ListingAdapter adapter = new ListingAdapter ( getActivity (), listings );

        //Set the list to the ListView
        ListView listView = rootView.findViewById ( R.id.list );
        //Set the adapter to the listView
        listView.setAdapter ( adapter );

        listView.setOnItemClickListener ( new AdapterView.OnItemClickListener () {
            @Override
            public void onItemClick(AdapterView <?> parent, View view, int i, long id) {
                Listing currentListing = listings.get ( i );

            }
        } );
        return rootView;
    }

}
