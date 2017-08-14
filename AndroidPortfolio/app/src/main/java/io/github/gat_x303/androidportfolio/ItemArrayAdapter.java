package io.github.gat_x303.androidportfolio;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/*
Used to recycle and populate ListViews of object Item
 */
public class ItemArrayAdapter extends ArrayAdapter<Item> {
    public ItemArrayAdapter(Context context, ArrayList<Item> items) {
        super(context, 0, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_listitem, parent, false);
        }

        //inside activity_listitem, it finds the Views that will changed
        TextView skillView = (TextView) listItemView.findViewById(R.id.skillName);
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.skillImage);

        //gets the current skills at index position
        Item currentItem = getItem(position);

        skillView.setText(currentItem.name);
        imageView.setImageResource(currentItem.image);

        return listItemView;
    }
}
