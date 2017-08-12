package io.github.gat_x303.androidportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by allan on 2017-08-08.
 */

public class AboutActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        TextView textView = (TextView) findViewById(R.id.text);
        ImageView imageView = (ImageView) findViewById(R.id.image);

        //created using http://snible.org/java2/uni2java.html
        String outputString = "My name is Allan Hieng, I'm currently a computer engineering student at McMaster University. Much like my online portfolio site, this Android application will act contain information on my skills, projects and how to get in touch with me while giving me a chance to apply my Android development skills.\n\nI\u2019m currently interested in software development including mobile application development. Eventually, I would like to work on mobile devices on a low-level.\n\nThank you for taking your time to visit and hopefully you find what you\u2019re looking for.\n\n";

        textView.setText(outputString);

    }
}
