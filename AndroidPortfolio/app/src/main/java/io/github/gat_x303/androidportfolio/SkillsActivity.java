package io.github.gat_x303.androidportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by allan on 2017-08-11.
 * ItemArrayAdapter is a subclass of ArrayAdapter
 * Used to inflate and recycle Views for List. May seem overcomplicated for a set of predetermined items, but is good in pratice
 */

public class SkillsActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        //creates an object that contains a string and an int
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item("Java", R.drawable.xxhdpi_java));
        items.add(new Item("Python", R.drawable.xxhdpi_python));
        items.add(new Item("JavaScript", R.drawable.xxhdpi_js));
        items.add(new Item("C", R.drawable.xxhdpi_c));
        items.add(new Item("Software Development Practices", R.drawable.xxhdpi_sepratice));
        items.add(new Item("Electrical circuits and integrated circuits", R.drawable.xxhdpi_ic));
        items.add(new Item("Android Development", R.drawable.xxhdpi_android));
        items.add(new Item("Matlab", R.drawable.xxhdpi_matlab));
        items.add(new Item("Assembly", R.drawable.xxhdpi_assembly));
        items.add(new Item("HTML and CSS", R.drawable.xxhdpi_htmlcss));

        //ItemArrayAdapter is a subclass of ArrayAdapter does as similar job except for Item ojbects
        //attaches the the skillAddapter to the listview
        ItemArrayAdapter itemArrayAdapter = new ItemArrayAdapter(this, items);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemArrayAdapter);

    }
}

