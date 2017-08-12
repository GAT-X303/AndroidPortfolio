package io.github.gat_x303.androidportfolio;

import android.content.Context;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by allan on 2017-08-11.
 */

public class SkillAdapter extends ArrayAdapter<Skill> {
    public SkillAdapter(Context context, ArrayList<Skill> skills) {
        super(context, 0, skills);
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
        Skill currentSkill = getItem(position);

        skillView.setText(currentSkill.name);
        imageView.setImageResource(currentSkill.image);

        return listItemView;
    }
}
