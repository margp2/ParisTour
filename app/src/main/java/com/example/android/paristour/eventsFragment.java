package com.example.android.paristour;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;


import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class eventsFragment extends Fragment {


    public eventsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate ( R.layout.content_main, container, false );
//        View rootView = inflater.inflate(R.layout.list_item, container, false);

        //Create an ArrayList for events.
        final ArrayList <Listing> listings = new ArrayList <Listing> ();
        listings.add ( new Listing ( "Paris Plages", R.drawable.paris_joedesousa ) );
        listings.add ( new Listing ( " Tour de France", R.drawable.paris_joedesousa ) );

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
