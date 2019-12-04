package com.example.rwandatour;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PlaceAdapter extends ArrayAdapter<Place> {
    public PlaceAdapter(Activity context, ArrayList<Place> places) {
        super(context, 0, places);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Place currentPlace = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title_id);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        titleTextView.setText(currentPlace.getTitle());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView timeTextView = (TextView) listItemView.findViewById(R.id.time_id);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        timeTextView.setText(currentPlace.getTime());

       TextView kilometerTextView = (TextView) listItemView.findViewById(R.id.kilometers);
       kilometerTextView.setText(currentPlace.getKilometers());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image_id);
        imageView.setImageResource(currentPlace.getImageResourceId());
        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
