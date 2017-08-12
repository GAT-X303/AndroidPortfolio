package io.github.gat_x303.androidportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by allan on 2017-08-11.
 * SkillAdapter is a subclass of ArrayAdapter
 * Used to inflate and recycle Views for List. May seem overcomplicated for a set of predetermined items, but is good in pratice
 */

public class SkillsActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        //creates an object that contains a string and an int
        ArrayList<Skill> skills = new ArrayList<>();
        skills.add(new Skill("Java", R.drawable.python));
        skills.add(new Skill("Python", R.drawable.python));
        skills.add(new Skill("JavaScript", R.drawable.python));
        skills.add(new Skill("C", R.drawable.python));

        //SkillAdapter is a subclass of ArrayAdapter does as similar job except for Skill ojbects
        //attaches the the skillAddapter to the listview
        SkillAdapter skillAdapter = new SkillAdapter(this,skills);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(skillAdapter);

    }
}

