package io.github.gat_x303.androidportfolio;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //creates variables to find the Views that will be referenced
        LinearLayout aboutView = (LinearLayout) findViewById(R.id.aboutView);
        LinearLayout skillsView = (LinearLayout) findViewById(R.id.skillsView);
        LinearLayout projectsView = (LinearLayout) findViewById(R.id.projectsView);
        LinearLayout contactView = (LinearLayout) findViewById(R.id.contactView);

        //setting onClickListeners to check if it has been clicked

        aboutView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent aboutIntent = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(aboutIntent);
            }
        });

        skillsView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent skillsIntent = new Intent(MainActivity.this, SkillsActivity.class);
                startActivity(skillsIntent);
            }
        });

        //

    }
}
